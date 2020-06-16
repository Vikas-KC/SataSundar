package com.SastaSundar.genricLib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility
{
	public static void mouseHoverAction(WebDriver driver,WebElement el)
	{
		Actions act = new Actions(driver);
		act.moveToElement(el).perform();
	}
	public static  void alertPopUp(WebDriver driver)
	{
		Alert alr = driver.switchTo().alert();
		System.out.println(alr.getText());
		alr.dismiss();
	}
}
