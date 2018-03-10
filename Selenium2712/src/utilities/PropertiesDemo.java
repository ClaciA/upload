package utilities;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PropertiesDemo {
@Test
public void test() {
	System.setProperty("webdriver.chrome.driver", TestConstans.CHROME_PATH);
	WebDriver driver= new ChromeDriver();
	String url= Configurations.getProperty("url");
	
	driver.get(url);
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(Configurations.getProperty("username"));
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(Configurations.getProperty("password"));
	
	
	
	
	
}
}
