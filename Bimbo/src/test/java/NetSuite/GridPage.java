package NetSuite;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class GridPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public GridPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Clicks Add Row button. Tries a few flexible locators to find it.
     */
    public void clickAddRow() {
        By[] possibleLocators = new By[] {
            By.id("btnAddRow"),
            By.xpath("//button[contains(normalize-space(.),'Add Row')]"),
            By.xpath("//a[contains(normalize-space(.),'Add Row')]"),
            By.cssSelector("button.add-row, a.add-row"),
            By.xpath("//button[contains(@class,'add') and contains(.,'Row')]")
        };

        for (By locator : possibleLocators) {
            try {
                WebElement el = wait.until(ExpectedConditions.elementToBeClickable(locator));
                el.click();
                // after clicking, return
                return;
            } catch (Exception ignored) {}
        }
        // last fallback: try to find any element with text add row case-insensitive
        try {
            WebElement el = driver.findElement(By.xpath("//*[translate(normalize-space(.),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')='add row']"));
            el.click();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Add Row button not found. Please update locator.");
        }
    }

    /**
     * Finds the last data row that was added. Uses data-row-type='data' and picks the last one.
     */
    public WebElement findLastDataRow() {
        List<WebElement> rows = driver.findElements(By.cssSelector("div[data-row-type='data']"));
        if (rows.isEmpty()) throw new RuntimeException("No grid rows found with data-row-type='data'");
        return rows.get(rows.size() - 1);
    }

    /**
     * Fill the given row element with the values list. The mapping is positional:
     * values.get(0) -> first cell, values.get(1) -> second cell, ...
     */
    public void fillRowWithValues(WebElement rowElement, List<String> values) {
        // Find cells inside the row. Based on your sample, cell class contains n-w-datagrid__popupselect-cell
        List<WebElement> cells = rowElement.findElements(By.cssSelector("div.n-w-datagrid__popupselect-cell, div[data-widget='GridCell']"));
        if (cells.isEmpty()) {
            // fallback: consider direct child divs
            cells = rowElement.findElements(By.xpath("./div"));
        }

        for (int i = 0; i < values.size(); i++) {
            String value = values.get(i).trim();
            if (value.isEmpty()) continue; // skip blanks

            WebElement cell;
            if (i < cells.size()) cell = cells.get(i);
            else {
                // If Excel has more columns than the DOM returned, stop gracefully
                System.out.println("Warning: Excel has more columns than visible cells. Stopping at cell count: " + cells.size());
                break;
            }

            fillCell(cell, value);
        }
    }

    /**
     * Fill a single cell. It tries:
     * 1) find input inside cell
     * 2) find select inside cell
     * 3) if only span (as your snippet), click span and wait for editor to appear (input/select), then type/select.
     */
    private void fillCell(WebElement cell, String value) {
        try {
            // 1) input present?
            List<WebElement> inputs = cell.findElements(By.xpath(".//input[not(@type='hidden')]"));
            if (!inputs.isEmpty()) {
                WebElement input = inputs.get(0);
                wait.until(ExpectedConditions.elementToBeClickable(input));
                input.clear();
                input.sendKeys(value);
                // maybe press TAB so grid registers
                input.sendKeys(Keys.TAB);
                return;
            }

            // 2) select present?
            List<WebElement> selects = cell.findElements(By.tagName("select"));
            if (!selects.isEmpty()) {
                Select sel = new Select(selects.get(0));
                try {
                    sel.selectByVisibleText(value);
                } catch (NoSuchElementException e) {
                    // try select by value
                    sel.selectByValue(value);
                }
                return;
            }

            // 3) span/display cell (your snippet uses span.uif1062 ...). Click it to open editor.
            List<WebElement> spans = cell.findElements(By.xpath(".//span"));
            if (!spans.isEmpty()) {
                WebElement span = spans.get(0);
                // click to open any editor/popup
                try {
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", span);
                } catch (Exception ignored) {}
                span.click();

                // After clicking the span, wait briefly for possible input/select to appear in the DOM
                WebElement editor = waitForEditorInCell(cell);
                if (editor != null) {
                    if (editor.getTagName().equalsIgnoreCase("input")) {
                        editor.clear();
                        editor.sendKeys(value);
                        editor.sendKeys(Keys.TAB);
                        return;
                    } else if (editor.getTagName().equalsIgnoreCase("select")) {
                        Select sel = new Select(editor);
                        try { sel.selectByVisibleText(value); }
                        catch (NoSuchElementException e) { sel.selectByValue(value); }
                        return;
                    }
                }

                // fallback: try sending keys to the span (some frameworks accept typing directly)
                try {
                    span.sendKeys(value);
                    span.sendKeys(Keys.TAB);
                    return;
                } catch (Exception ignored) {}
            }

            // If we reach here, no known editor found. Print debug message.
            System.out.println("Unable to find input/select/span editor inside cell. Cell text: " + cell.getText());
        } catch (Exception e) {
            System.out.println("Exception while filling cell: " + e.getMessage());
        }
    }

    /**
     * Wait briefly for input/select to appear inside the cell after clicking the display span.
     */
    private WebElement waitForEditorInCell(WebElement cell) {
        try {
            // search within document for a visible input/select that overlaps the cell or is a child
            // First check children
            List<WebElement> inputs = cell.findElements(By.xpath(".//input[not(@type='hidden') and (not(@disabled))]"));
            if (!inputs.isEmpty()) return inputs.get(0);
            List<WebElement> selects = cell.findElements(By.xpath(".//select"));
            if (!selects.isEmpty()) return selects.get(0);

            // Otherwise poll the document short time for any input/select appearing
            long end = System.currentTimeMillis() + 3000;
            while (System.currentTimeMillis() < end) {
                inputs = driver.findElements(By.xpath("//input[not(@type='hidden') and (not(@disabled)) and (string-length(normalize-space(.))>=0)]"));
                if (!inputs.isEmpty()) return inputs.get(0);
                selects = driver.findElements(By.xpath("//select"));
                if (!selects.isEmpty()) return selects.get(0);
                try { Thread.sleep(200); } catch (InterruptedException ignored) {}
            }
        } catch (Exception ignored) {}
        return null;
    }

    /**
     * Example save/submit action if needed. Replace locator accordingly.
     */
    public void clickSave() {
        try {
            WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save') or contains(.,'Submit')]")));
            save.click();
        } catch (Exception e) {
            System.out.println("Save/Submit button not found.");
        }
    }
}

