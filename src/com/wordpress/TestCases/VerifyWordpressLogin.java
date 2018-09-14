/**
 * 
 */
package com.wordpress.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.wordpress.pages.LoginPageLocators;

import lib.BrowserDriverUtility;
import lib.ScreenshotUtility;

/**
 * @author ChetanKanani
 *
 */
public class VerifyWordpressLogin {

	WebDriver dr;
	String path;

	@BeforeTest
	public void InvokeBrowser() {
		dr = BrowserDriverUtility.InvokeBrowser("webdriver.chrome.driver",
				"C:\\Chetan\\SeleniumSuite\\WebDrivers\\chromedriver.exe",
				"http://demosite.center/wordpress/wp-login.php");
		path = ScreenshotUtility.CaptureScreenshot(dr, "1_MainPage");
	}

	@Test
	public void verifyValidLogin() {
		LoginPageLocators login = new LoginPageLocators(dr);
		login.LoginToWordpress("admin", "demo123");
	}

	@AfterTest
	public void tearDown() {

		dr.close();

	}
}
