package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
	WebDriver driver;
	@Test
	public void facebook() {
		
		System.setProperty("webdriver.chrome.driver","/Users/claci/Documents/selenium dependencies/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
	}
	

}
