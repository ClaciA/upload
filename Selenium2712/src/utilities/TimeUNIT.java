package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeUNIT {
WebDriver driver;
@BeforeMethod
public void setUp() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver",
				TestConstans.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("http://the-internet.herokuapp.com/iframe");
		
}
@Test
public void test() {
	WebElement iFrame=driver.findElement(By.tagName("iFrame"));
	driver.switchTo().frame(iFrame);
	driver.findElement(By.id("tinymce")).sendKeys("more text");
	driver.switchTo().parentFrame();
	System.out.println(driver.findElement(By.linkText("Elemental Selenium")));
	}
@Test
public void test2() {
	//WE ALSO  SWITCH TO IFRAMES BY PASSING THE NAME ID DIRECTLY
	driver.switchTo().frame("mce_0_ifr");
	driver.findElement(By.id("tinymce")).clear();
	driver.findElement(By.id("tinymce")).sendKeys("more text");
	driver.switchTo().parentFrame();
	System.out.println(driver.findElement(By.linkText("elemental selenium")));
	
	
	}
@Test
public void test3() {
	//switch by count
	//by the number of the frame
	driver.switchTo().frame(0);
	driver.findElement(By.id("tinymce")).clear();
	driver.findElement(By.id("tinymce")).sendKeys("more text");
	driver.switchTo().parentFrame();
	System.out.println(driver.findElement(By.linkText("elemental Selenium")));
	
	
			+ 
}
}