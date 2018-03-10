package utilities;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UtilitiesClass {

	
	public static void verifyTitleMatches(WebDriver a, String expected, String actual) {

		if (expected.equals(actual)) {
		System.out.println("Pass Title Matches");
		} else {
		System.out.println("Fail verify title contains");
		System.out.println("Expected : " + expected);
		System.out.println("Actual : " + actual);
		}
		}

		public static void verifyTitleContains(WebDriver b, String expected1, String actual1) {
		if (expected1.contains(actual1)) {
		System.out.println("Pass Verify title Contains");
		} else {
		System.out.println("Fail Verify title contains");
		System.out.println("Expected: " + expected1);
		System.out.println("Actual: " + actual1);
		}
		}

		public static void verifyUrlMatches(WebDriver c, String expected2, String actual2) {
		if (expected2.equals(actual2)) {
		System.out.println("Pass Verify URL");
		} else {
		System.out.println("Fails Verify URL");
		System.out.println("Expected: " + expected2);
		System.out.println("Actual: " + actual2);
		}
		}

		public static void verifyElementExists(WebDriver driver, By by) {// by is the element xpath,id etc
		try {
		assertTrue(driver.findElement(by).isDisplayed());// if its not display
		} catch (NoSuchElementException e) {
		Assert.fail("Element was not found");
		}
		}

}

