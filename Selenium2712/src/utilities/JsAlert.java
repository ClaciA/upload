package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JsAlert {
	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver",
				TestConstans.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	@Test
	public void alertTest() throws InterruptedException {
	driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button)[1]")).click();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert(); //capture the alert
	Thread.sleep(2000)	;
	alert.accept(); //click in the alert
	
}
	@Test
	public void alertCancel() throws InterruptedException {
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert(); //capture the alert
		Thread.sleep(2000)	;
		alert.dismiss();
		
	}
	@Test
	public void alertType() throws InterruptedException {
		driver.findElement(By.xpath("(//button)[3]")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());//get text
		alert.sendKeys("hello");
		System.out.println(alert.getText());
		alert.accept();
		
	}
	@Test
	public void test() {
		//star testing
		try {
			driver.switchTo().alert().dismiss();
			}catch(NoAlertPresentException e) {
				e.printStackTrace();
			}
	}
}