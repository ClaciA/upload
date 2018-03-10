package utilities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindows {
WebDriver driver;
@BeforeMethod
public void setUp() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver",
				TestConstans.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.get("http://the-internet.herokuapp.com/windows");
	Thread.sleep(2000);
}
@Test
public void test() {
	Set<String> handle=driver.getWindowHandles();
	System.out.println(handle);
	driver.findElement(By.linkText("Click here")).click();
	//Set
	String newWindowHandles="";
	Set<String> windowHandles= driver.getWindowHandles();
	for(String string : windowHandles) {
		System.out.println(string);
		if(!string.equals(handle)) {
			newWindowHandles=string;
		}
	}
	driver.switchTo().window(newWindowHandles);	//driver.getWindowHandles();
	//System.out.println(driver.findElement(By.tagName("h3")).getText());
	System.out.println(driver.findElement(By.tagName("h3")).getText());
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
}
@Test
public void switchUsingTitle() {
	
	driver.findElement(By.linkText("Click here")).click();
	String targetTitle="New Window";
	for(String handle : driver.getWindowHandles()) {
		//first switch
		driver.switchTo().window(handle);
		//then check the title
		if(driver.getTitle().equals(targetTitle)) {
			//stop switching
			break;
			
		}
		
	}
	System.out.println(driver.getCurrentUrl());
}
@Test
public void switchUsingUtil() {
	driver.findElement(ByLinkText("Click here")).click();
	System.out.println(driver.getCurrentUrl());
	String targetTitle="New Window";
	BrowserUtils.changeWindow(driver,targetTitle);
	
	
	
	System.out.println(driver.getCurrentUrl());
}


@Test
public void driverClose() {
driver.findElement(By.linkText("Click Here")).click();
driver.findElement(By.linkText("Click Here")).click();
driver.close();
String targetTitle="New Window";
BrowserUtils.changeWindow(driver, targetTitle); 
System.out.println(driver.getCurrentUrl());


}

}
