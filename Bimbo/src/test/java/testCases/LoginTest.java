package testCases;

import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import pageObjects.LoginPage;
import testBase.BaseTest;

public class LoginTest extends BaseTest {

    @Test(priority=1)
    public void verifyLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setUserName(p.getProperty("Username"));
        logger.info("Username Entered Successfully");

        loginPage.setPassword(p.getProperty("Password"));
        logger.info("Password Entered Successfully");

        loginPage.clickLogin();
        logger.info("Login action performed Successfully");
        
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        
    }
    
    
    @Test(priority=2)
    public void verifyMasterMenuNavigation() throws InterruptedException 
    {
        logger.info("Initializing ActivityPage object...");
        
        ActivityPage AP = new ActivityPage(driver);

        
        logger.info("Calling clickMaster() method...");
        AP.clickMaster();
        logger.info("clickMaster() execution completed.");
        
        logger.info("Calling clickReason() method...");
        AP.clickReason();
        logger.info("clickReason() execution completed.");
    }
	
    /*
    @Test(priority=10)
    public void VerifyLogout() throws InterruptedException 
    {
        logger.info("Initializing ActivityPage object...");
        
        ActivityPage AP = new ActivityPage(driver);
        
        AP.clickLogout();
        Thread.sleep(3000);
        
    }
	*/
}
