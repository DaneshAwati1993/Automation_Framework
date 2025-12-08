package NetSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class GridTest {
    private WebDriver driver;
    private GridPage gridPage;

    // Update this path to your excel file
    private final String excelFile = "testdata.xlsx"; // <-- put full path or resource path

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        gridPage = new GridPage(driver);

        // navigate to your page
        driver.get("https://your-app-url.example/pageWithGrid"); // <-- replace with actual URL
    }

    @Test
    public void addRowsFromExcel() throws IOException {
        List<List<String>> rows = ExcelReader.readAllRows(excelFile);

        // Optional: if first row is header, drop it:
        boolean firstRowIsHeader = true;
        if (firstRowIsHeader && !rows.isEmpty()) {
            rows.remove(0);
        }

        for (List<String> excelRow : rows) {
            // 1) click add row
            gridPage.clickAddRow();

            // 2) find the last data row added
            var newRow = gridPage.findLastDataRow();

            // 3) fill fields in that row (positional mapping)
            gridPage.fillRowWithValues(newRow, excelRow);
        }

        // optional: click save/submit
        gridPage.clickSave();
    }

    @AfterClass
    public void teardown() {
        if (driver != null) driver.quit();
    }
}

