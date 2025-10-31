package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    public WebDriver driver;
    public Logger logger;
    public Properties p;
    
    @BeforeTest
    @Parameters({"browser"})
    public void setup(@Optional("chrome") String br) throws IOException 
    {
    	
    	//Loading config.properties file 
    	FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
    	p=new Properties();
    	p.load(file);
    	
    	
    	
    	logger =LogManager.getLogger(this.getClass());
    	
    	if (br == null || br.isEmpty()) 
    	{
            br = "chrome"; // ✅ Default browser
        }
    	
    	switch(br.toLowerCase())
    	{
    	case "chrome"  : driver=new ChromeDriver(); break;
    	case "edge"    : driver=new EdgeDriver();  break;
    	case "firefox" : driver=new FirefoxDriver();  break;
    	
    	default : System.out.println("Invalid browser name...");
    	return;
    	
    	}
    	
    	driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.manage().window().maximize();
        driver.get(p.getProperty("VEurl")); // Reading URL's from properties
        
        System.out.println("✅ Browser opened and navigated to URL");
        
        
        logger.info("Browser launched: {}", driver);
    }

    /*
    @AfterTest
    public void tearDown() 
    {
        if (driver != null) 
        {
            driver.quit();
            System.out.println("🧹 Browser closed successfully.");
        }
    }
    */
    
}
