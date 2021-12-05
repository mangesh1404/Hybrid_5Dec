package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.LoginPage;

public class LoginTest extends BaseClass{

	public static WebDriver driver;
	LoginPage lp;
	@BeforeSuite
	public void setup() {
		log.info("inside the before suite");
		driver= initilization();
		reportInit();
		lp= new LoginPage(driver);
	}
	@Test
	public void loginTitle() {
		log.info("executing a test for loginTitle");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	}
	@Test
	public void loginLogo() {
		log.info("executing a test for loginLogo");
		WebElement logo = driver.findElement(By.tagName("img"));
		Assert.assertFalse(logo.isDisplayed());
	}
	@Test
	public void loginLable() {
		log.info("executing a test for loginLable");
		WebElement lable = driver.findElement(By.tagName("b"));
		String text = lable.getText();
		throw new SkipException("skipping a testcase");
	}
	
}
