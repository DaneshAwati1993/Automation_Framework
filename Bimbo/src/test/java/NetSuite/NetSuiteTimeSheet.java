package NetSuite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetSuiteTimeSheet {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://system.netsuite.com/pages/customerlogin.jsp?country=US");
		
		//Login : 
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("danesh.a@ivymobility.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shilpa@9019");
		
		WebElement RememberMe = driver.findElement(By.xpath("//input[@id='rememberme']"));
		
		// Check if checkbox is enabled
        if (RememberMe.isEnabled()) {
            System.out.println("Checkbox is enabled.");

            // If not already selected, click it to enable
            if (!RememberMe.isSelected()) {
            	RememberMe.click();
                System.out.println("Checkbox is now selected (enabled).");
            } else {
                System.out.println("Checkbox is already selected.");
            }
        } else {
            System.out.println("Checkbox is disabled — cannot be clicked.");
        }

        // Optional: verify after clicking
        if (RememberMe.isSelected()) {
            System.out.println("✅ Remember Me checkbox is enabled & selected successfully!");
        } else {
            System.out.println("❌ Checkbox could not be selected.");
        }
		
        
        //Click Login : 
		driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		
		 try {
	            Thread.sleep(2000); // use WebDriverWait in real tests
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 
		 
		// Fetch the page title
	        String pageTitle1 = driver.getTitle();
	        System.out.println("Current Page Title: " + pageTitle1);

	        // Check if the "Additional Authentication Required" page is displayed
	        if (pageTitle1.equalsIgnoreCase("Additional Authentication Required")) {
	        	System.out.println("✅ Authentication page detected — proceeding with entry steps...");
	        	
	            // Continue steps for this page
	        	//Security Question answer------------
	        	String q1 = driver.findElement(By.xpath("//td[normalize-space()='Question:']/following-sibling::td"))
	                    .getText();

	   WebElement ans1 = driver.findElement(By.xpath("//td[normalize-space()='Answer:']/following-sibling::td//input"));

	   switch (q1) {

	       case "What was your childhood nickname?":
	           ans1.sendKeys("daneshnickname");
	           break;

	       case "What is your oldest sibling's middle name?":
	           ans1.sendKeys("daneshsibling");
	           break;

	       case "In what city or town was your first job?":
	           ans1.sendKeys("daneshcity");
	           break;

	       default:
	           System.out.println("Unknown question → " + q1);
	   }

	        	
	            //driver.findElement(By.xpath("//*[@id=\"null\"]")).sendKeys("danu");  //
	            driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/table/tbody/tr[4]/td/input")).click();
	        } else {
	            System.out.println("ℹ️ Different page detected — skipping authentication steps.");
	        }
	        
	        Thread.sleep(3000);
	        
	        
			// Fetch the page title
	        String pageTitle2 = driver.getTitle();
	        System.out.println("Current Page Title: " + pageTitle2);

	        // Check if the "Additional Authentication Required" page is displayed
	        if (pageTitle2.equalsIgnoreCase("Home - NetSuite (Ivy Mobile Technologies)")) {
	        	System.out.println("Home - NetSuite (Ivy Mobile Technologies -- Is detected Proceeding for Timesheet Menu");
	        	
	            // Proceeding for Timesheet Page
	            driver.findElement(By.xpath("//a[normalize-space(text())='Weekly Timesheet']")).click();

	        } else {
	            System.out.println("ℹ️ Different page detected — skipping authentication steps.");
	        }

	        //Validate Timesheet menu available or not : 
	        
	        String pageTitle3 = driver.getTitle();
	        System.out.println("Current Page Title: " + pageTitle3);

	        if (pageTitle3.equalsIgnoreCase("Weekly Timesheet - NetSuite (Ivy Mobile Technologies)")) {
	        	System.out.println("Home - NetSuite (Ivy Mobile Technologies -- Is detected Proceeding for Timesheet Menu");
	        	
	            // Proceeding for Timesheet Page
	            //driver.findElement(By.xpath("//a[@id=\"ns-component-13384525273380528--52605341\"]")).click();

	        } else {
	            System.out.println("ℹ️ Different page detected — skipping authentication steps.");
	        }
	        
	        
	       //Date Selection : 
	        
	        driver.findElement(By.xpath("//input[@id=\"uif302_input\"]")).sendKeys("10-Nov-2025");
	        
	        
	        
	}

}
