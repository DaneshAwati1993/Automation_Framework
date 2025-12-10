package pageObjects;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActivityPage extends BasePage {

	private WebDriver driver;
    public Logger logger;
    private By masterlocator=By.cssSelector("a[title='Master']");
    
	public ActivityPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	

	@FindBy(css="a[title='Master']") 
	WebElement master;
	
	@FindBy(css="a[title='Reason']") 
	WebElement Reason;

	@FindBy(xpath="//a[@id='prof-anchor']") 
	WebElement profile;
	
	@FindBy(xpath="//a[normalize-space()='Sign Out']") 
	WebElement Logout;
	/*
	public void clickMaster() {
	    try {
	        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.presenceOfElementLocated(masterlocator));
	        //wait.until(ExpectedConditions.elementToBeClickable(master));

	        Actions actions = new Actions(this.driver);
	        actions.scrollToElement(master).perform(); // must call perform()
	        //logger.info("Scrolled to Master menu element.");

	        master.click(); //  click after scroll
	        System.out.println("Clicked on Master menu successfully.");
	        

	    } catch (Exception e) 
	    {
	        System.out.println("Failed to click on Master menu: " + e.getMessage());
	        Assert.fail("PrivateAccessModifier failed due to exception: " + e.getMessage());
	    }
	}
	
	public void clickReason() {
	    try {
	        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
	        //wait.until(ExpectedConditions.presenceOfElementLocated(masterlocator));
	        wait.until(ExpectedConditions.elementToBeClickable(Reason));

	        Actions actions = new Actions(this.driver);
	        actions.scrollToElement(Reason).perform(); // must call perform()
	        //logger.info("Scrolled to Master menu element.");

	        Reason.click(); //  click after scroll
	        System.out.println("Clicked on Master menu successfully.");
	        

	    } catch (Exception e) 
	    {
	        System.out.println("Failed to click on Master menu: " + e.getMessage());
	        Assert.fail("PrivateAccessModifier failed due to exception: " + e.getMessage());
	    }
	}
	    */
	public void clickLogout() {
		
    	logger =LogManager.getLogger(this.getClass());

	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        Actions actions = new Actions(driver);

	        // Wait for the profile icon to be visible and clickable
	        wait.until(ExpectedConditions.visibilityOf(profile));
	        wait.until(ExpectedConditions.elementToBeClickable(profile));

	        // Hover on the profile icon
	        actions.moveToElement(profile).perform();
	        logger.info("Hovered over Profile icon.");

	        // Wait until the Logout option becomes visible
	        wait.until(ExpectedConditions.visibilityOf(Logout));
	        wait.until(ExpectedConditions.elementToBeClickable(Logout));

	        // Click the Logout option
	        actions.moveToElement(Logout).perform();
	        logger.info("Hovered over Logout Button.");
	        Thread.sleep(3000);
	        Logout.click();
	        logger.info("User logged out successfully.");
	        

	    } catch (Exception e) {
	    	logger.error("Failed to click on Logout", e);
	        Assert.fail("PrivateAccessModifier failed due to exception: " + e.getMessage());
	    }
	}
	


}
