package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class VenezuelaQATesting {
	
	

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://bimbo-ve-qa.ivycpg.com/web/DMS/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("L1_user");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1");
		driver.findElement(By.xpath("//button[@id='Login']")).click();
		
		WebElement master=driver.findElement(By.xpath("//a[@title='Master']"));
		
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        wait.until(ExpectedConditions.visibilityOf(master));
	        wait.until(ExpectedConditions.elementToBeClickable(master));
	        
	        
	        
			Actions actions = new Actions(driver);
			
			actions.scrollToElement(master).click().perform();
		}
		catch(Exception e)
		{
			System.out.println("Failed to click on Master menu: " + e.getMessage());
	        Assert.fail("Test failed due to exception: " + e.getMessage());
		}
		
		
	

	}

}
