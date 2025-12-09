package Service_Start_Stop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Service_Start {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-first-run");
		options.addArguments("--no-service-autorun");
		options.addArguments("--password-store=basic");
		options.addArguments("--use-mock-keychain");

		WebDriver driver = new ChromeDriver(options);

		//WebDriver driver=(WebDriver) new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://qa01-devops.ivy-insights.com:8080/job/as-qaappnfr-dotcore-ivydev01-in-d-Servicestart/");
		
		WebElement signin=driver.findElement(By.xpath("//div[contains(text(),'Sign in with Google')]"));

		
		if (signin.isDisplayed())
		{
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("danesh.a");
			driver.findElement(By.xpath("//DIV[@ID='identifierNext']")).click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//input[@name='Passwd']")
			));

			password.sendKeys("SHILPA9019");
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//DIV[@ID='passwordNext']")).click();
			
			
			Assert.assertEquals(driver.getTitle(), "as-qaappnfr-dotcore-ivydev01-in-d-Servicestart - Jenkins");
		}
	}

}
