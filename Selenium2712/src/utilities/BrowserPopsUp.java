package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserPopsUp {
WebDriver driver;
@BeforeMethod
public void setUp() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver",
				TestConstans.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2000);
}
@Test
public void acceptBrowsersPopUp() {
	driver.get("//http://primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
	WebElement button= driver.findElement(By.cssSelector("button[type+'submit']"));
	button.click();
	WebElement no= driver.findElement(By.xpath("//span[.='No']"));
	no.click();
	button.click();
	WebElement x=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick"));
	x.click();
}
}