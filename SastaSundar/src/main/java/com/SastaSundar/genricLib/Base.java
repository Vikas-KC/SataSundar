package com.SastaSundar.genricLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.SataSundar.ObjectRepo.Login;

public class Base 
{
	FileLib fl  = new FileLib();
	public WebDriver driver;
	public static WebDriver  staticDriver;
	
	@BeforeClass
	public void configBC()
	{
		String browser = fl.getPropertiesValue("browser");
		if(browser.equals("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			staticDriver = driver;
		}
		else if (browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
			staticDriver = driver;
		}
		
		driver.manage().window().maximize();
		driver.get(fl.getPropertiesValue("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void configBM() throws Exception
	{
		Login login = PageFactory.initElements(driver, Login.class);
		login.getClosePopUp().click();
//		Thread.sleep(5000);
//		login.getLoginLink().click();
//		Thread.sleep(5000);
//		login.getMobileNumTF().sendKeys(fl.getPropertiesValue("mobile_no"));
//		login.getPasswordTF().sendKeys("password");
//		Thread.sleep(5000);
//		login.getLoginButton().click();
	}
}
