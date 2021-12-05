package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement loginBtn;
	
	@FindBy(tagName="img")
	private WebElement logo;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginApplication(String username, String password) {
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginBtn.click();
	}
	
	public boolean verifyLogo() {
		return logo.isDisplayed();
	}
}
