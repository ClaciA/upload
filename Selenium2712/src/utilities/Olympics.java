package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Olympics {
WebDriver driver;
@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver",
			"/Users/claci/Documents/selenium dependencies/Drivers/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics");
}
@Test
public void test1() {
		List<String> listOfCo= new ArrayList<>();
		listOfCo.add(
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[8]/tbody/tr[1]/td[1]")).getText());
		listOfCo.add(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[8]/tbody/tr[2]/td[1]")).getText());

		listOfCo.add(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[8]/tbody/tr[3]/td[1]")).getText());

		listOfCo.add(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[8]/tbody/tr[4]/td[1]")).getText());

		listOfCo.add(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[8]/tbody/tr[5]/td[1]")).getText());

		listOfCo.add(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[8]/tbody/tr[6]/td[1]")).getText());

		listOfCo.add(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[8]/tbody/tr[7]/td[1]")).getText());

		listOfCo.add(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[8]/tbody/tr[8]/td[1]")).getText());

		listOfCo.add(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[8]/tbody/tr[9]/td[1]")).getText());
		listOfCo.add(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[8]/tbody/tr[10]/td[1]")).getText());
              int  [] nums = {1,2,3,4,5,6,7,8,9,10} ;
		
            	  for (int i = 0; i < 10; i++) {
          			for (String list : listOfCo) {
          				if(Integer.valueOf(list).equals(nums[i])) {
          					System.out.println("True");
          					break;
          			}
          			
          			}
          		}
            

}
}






