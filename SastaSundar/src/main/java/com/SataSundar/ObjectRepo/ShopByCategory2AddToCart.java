package com.SataSundar.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SastaSundar.genricLib.Utility;

public class ShopByCategory2AddToCart 
{
	@FindBy(xpath = "//span[text()='Shop by Category']")
	WebElement shopByCategory;

	@FindBy(linkText = "View All")
	WebElement viewAllLink;
	
	public WebElement getViewAllLink() {
		return viewAllLink;
	}

	public WebElement getShopByCategory() {
		return shopByCategory;
	}
	
	//business logic
	public void shopByCategoryMouseHover(WebDriver driver)
	{
		Utility.mouseHoverAction(driver, getShopByCategory());
	}
	
}
