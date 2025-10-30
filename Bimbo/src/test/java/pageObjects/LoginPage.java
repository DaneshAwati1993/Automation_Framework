package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) 
    {
        super(driver);
    }

    @FindBy(id="UserName")
    WebElement username;

    @FindBy(id="Password")
    WebElement password;

    @FindBy(id="Login")
    WebElement btnLogin;
    
 

    // Action Methods
    public void setUserName(String user) 
    {
        waitForVisibility(username);
        username.clear();
        username.sendKeys(user);
    }

    public void setPassword(String pwd) 
    {
        waitForVisibility(password);
        password.clear();
        password.sendKeys(pwd);
    }

    public void clickLogin() 
    {
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
    }

    public void login(String user, String pwd) 
    {
        setUserName(user);
        setPassword(pwd);
        clickLogin();
    }

}
