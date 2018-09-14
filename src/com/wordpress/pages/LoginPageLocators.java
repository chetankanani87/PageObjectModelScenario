/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author ChetanKanani
 *
 *This class will store all the locators and methods of login page.
 */
public class LoginPageLocators {
	
	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.xpath("//input[@id='user_pass']");
	By loginButton = By.name("wp-submit");
	
	public LoginPageLocators(WebDriver driver) {
		this.driver = driver;
	}
	
	public void LoginToWordpress(String uname, String pass) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();

	}
}
