package com.SataSundar.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SastaSundar.genricLib.Utility;

public class Login
{
	@FindBy(xpath = "//a[text()=' Login '")
	WebElement loginLink;
	
	@FindBy(id = "email_mobileno")
	WebElement mobileNumTF;
	
	@FindBy(name = "password")
	WebElement passwordTF;
	
	@FindBy(id = "js_login_btn")
	WebElement loginButton;

	@FindBy(linkText = "X")
	WebElement closePopUp;
	
	//providing getter methods
	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getMobileNumTF() {
		return mobileNumTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getClosePopUp() {
		return closePopUp;
	}

	//business logic
	public void mouseHover(WebDriver driver)
	{
		Utility.mouseHoverAction(driver, loginLink);
	}
	
	
}
