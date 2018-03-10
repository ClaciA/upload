package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsDemo {
WebDriver driver;
@BeforeMethod
public void setUp(){
	
		System.setProperty("webdriver.chrome.driver",
				TestConstans.CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	@Test
	public void hoverTest() {
		Actions actions= new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[.='Hello. Sign in']"));
		
				actions.moveToElement(element).perform();//dont forget to call the perform method 
				driver.findElement(By.linkText("Explore Idea Lists")).click();
				
				
		WebElement source=driver.findElement(By.id("droggable"));
		WebElement target=driver.findElement(By.id("droptarget"));
		actions.dragAndDrop(source, target).perform();
				
}
	@Test
	public void drogAndDrop() {
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		Actions actions= new Actions(driver);
		WebElement source=driver.findElement(By.id("droggable"));
		WebElement target=driver.findElement(By.id("droptarget"));
		//what you wanna drop
		WebElement element = driver.findElement(By.id("droggable"));
		//what you want to drop it
		
		actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		
	}
	@Test
	public void doubleClick() {
		Actions actions= new Actions(driver);	
		driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
		WebElement element=driver.findElement(By.id("puff_header"));
		actions.doubleClick(element).perform();
	}
	@Test
	public void pageDown() throws InterruptedException {
		Actions actions= new Actions(driver);
		driver.get("https://jscroll.com/");
		WebElement element= driver.findElement(By.xpath("8:43 PM//h3[.='Page 1 of jScroll Example - jQuery Infinite Scrolling Plugin']"));
	
	actions.moveToElement(element).sendKeys(Keys.PAGE_DOWN).perform();;
	Thread.sleep(1000);
	actions.moveToElement(element).sendKeys(Keys.PAGE_DOWN).perform();;
	Thread.sleep(1000);
	actions.moveToElement(element).sendKeys(Keys.PAGE_DOWN).perform();;
	Thread.sleep(1000);
	
	}
	
}
