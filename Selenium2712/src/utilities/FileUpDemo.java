package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpDemo {
WebDriver drier;
@BeforeMethod
public void setUp(){
	
		System.setProperty("webdriver.chrome.driver",
				TestConstans.CHROME_PATH);
		drier = new ChromeDriver();
		drier.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
@Test 
public void fileUpload() {
	drier.get("https://the-internet.herokuapp.com/upload");
	//get the path to file
	//the folder where the file is located + name of the file+ extension on the file( if there is one)
	String file="/Users/claci/Downloads/P2_Words/src/words";
	 WebElement input=drier.findElement(By.id("file-upload"));
	 input.sendKeys(file);
	
}

}
