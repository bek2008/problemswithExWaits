package base;

import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	protected WebDriver driver = null;

	  @BeforeMethod
	  public void setup() {

	    String browser = "chrome";

	    if (browser.equalsIgnoreCase("chrome")) {
	    	System.setProperty("WebDriver.chrome.driver", "C:\\Downloads\\Selenium downloads\\chromedriver.exe");
	      driver = new ChromeDriver();
	    } else if (browser.equalsIgnoreCase("firefox")) {
	    	System.setProperty("WebDriver.gecko.driver", "C:\\Downloads\\Selenium downloads\\geckodriver.exe");
	      driver = new FirefoxDriver();
	    } else if (browser.equalsIgnoreCase("edge")) {
	    	System.setProperty("webdriver.edge.driver", "C:\\Downloads\\Selenium downloads\\msedgedriver.exe");
	      driver = new EdgeDriver();
	    }

	    // Move the window to the left side:
	    driver.manage().window().setPosition(new Point(-1800, 0));
	    driver.manage().window().maximize();
	    
	    
	  }
	  public void waits() {
		//Implicit wait:
		    // Doesn't throw "No such element exception" before the set time
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		    
		    //Explicit wait:
		    WebDriverWait explicitlyWait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  }
}
