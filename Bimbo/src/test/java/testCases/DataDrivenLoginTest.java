package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ActivityPage;
import pageObjects.LoginPage;
import testBase.BaseTest;
import utilities.DataProviders;

public class DataDrivenLoginTest extends BaseTest {

    @Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
    public void verifyLoginDDT(String username, String password, String exp) {
        try {
            logger.info("Starting login test with Username: " + username + " | Expected: " + exp);

            LoginPage loginPage = new LoginPage(driver);
            loginPage.setUserName(username);
            logger.debug("Username entered successfully");

            loginPage.setPassword(password);
            logger.debug("Password entered successfully");

            loginPage.clickLogin();
            logger.info("Clicked on Login button");

            String pageTitle = driver.getTitle().trim();
            logger.debug("Page title after login: " + pageTitle);

            if (exp.equalsIgnoreCase("Valid")) {
                if (pageTitle.equalsIgnoreCase("IvyDMS")) {
                    logger.info("Login successful - navigating to Activity Page");
                    ActivityPage activityPage = new ActivityPage(driver);
                    activityPage.clickLogout();
                    logger.info("Logout successful");
                    Assert.assertTrue(true, "Valid login passed as expected");
                } else {
                    logger.error("Valid login failed - Unexpected page title");
                    Assert.fail("Expected 'IvyDMS' but found '" + pageTitle + "'");
                }
            } 
            else if (exp.equalsIgnoreCase("Invalid")) {
                if (pageTitle.equalsIgnoreCase("IvyDMS")) {
                    logger.error("Invalid login succeeded unexpectedly");
                    ActivityPage activityPage = new ActivityPage(driver);
                    activityPage.clickLogout();
                    Assert.fail("Invalid login should not have succeeded");
                } else {
                    logger.info("Invalid login correctly failed");
                    Assert.assertTrue(true, "Invalid login failed as expected");
                }
            }

        } catch (Exception e) {
            logger.error("PrivateAccessModifier failed due to exception: ", e);
            Assert.fail("PrivateAccessModifier failed due to exception: " + e.getMessage());
        }
    }
}
