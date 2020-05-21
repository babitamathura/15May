package DefaultPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass {
  @Test
  public void BrowserLaunch() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:/EclipseWorkspace/Drivers/chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  
  }
}
