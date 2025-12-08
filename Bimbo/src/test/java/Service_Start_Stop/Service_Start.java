package Service_Start_Stop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Service_Start {

	public static void main(String[] args) {

		WebDriver driver=(WebDriver) new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://qa01-devops.ivy-insights.com:8080/job/as-qaappnfr-dotcore-ivydev01-in-d-Servicestart/");
		
		WebElement signin=driver.findElement(By.xpath("//div[contains(text(),'Sign in with Google')]"));

		
		if (signin.isDisplayed())
		{
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("danesh.a");
			driver.findElement(By.xpath("//DIV[@ID='identifierNext']")).click();
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SHILPA9019");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//DIV[@ID='passwordNext']")).click();
		}
	}

}
