package DefaultPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FirstClass {
	
	WebDriver driver = new ChromeDriver ();

//	@BeforeTest
//	public void DriverConfiguration()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:/EclipseWorkspace/15May/Drivers/chromedriver.exe");	
//	} 
//	
//	@BeforeMethod
//	public void DeleteCookies()
//	{
//		driver.manage().deleteAllCookies();
//		System.out.println("Cookies deleted...");
//	}

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:/EclipseWorkspace/15May/Drivers/chromedriver.exe");	
			driver.get("https://www.flipkart.com/");
			driver.getTitle();
			
			//Assert.assertEquals(driver.getTitle(), expected);
			System.out.println("This is Title of the page : "+ driver.getTitle());
	}
	
//	@AfterMethod
//	public void CloseBrowser()
//	{
//		driver.quit();
//		System.out.println("Closed Browser...");
//	}	
}
