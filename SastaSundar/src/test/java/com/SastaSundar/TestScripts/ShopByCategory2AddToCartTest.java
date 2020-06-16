package com.SastaSundar.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.SastaSundar.genricLib.Base;
import com.SastaSundar.genricLib.Utility;
import com.SataSundar.ObjectRepo.ShopByCategory2AddToCart;

public class ShopByCategory2AddToCartTest extends Base 
{
	ShopByCategory2AddToCart add;
	@Test
	public void addToCart() throws Exception
	{
		add = PageFactory.initElements(driver, ShopByCategory2AddToCart.class);
		
		Thread.sleep(4000);
		add.shopByCategoryMouseHover(driver);
		Reporter.log("mouse hovered on shop by category",true);
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[text()='Baby']/..//span[text()='Baby']/../..//a[text()='Soap & Shampoo']")).click();
		WebElement element = driver.findElement(By.xpath("//li[contains(@class,'add-plus mob-plus ')]/a[text()='Baby']"));
		Utility.mouseHoverAction(driver, element);
		Reporter.log("mouse hovered on the product",true);
		
		driver.findElement(By.xpath("//div[contains(@class,'ss-sub')]//a[text()='Soap & Shampoo']")).click();
		Reporter.log("clicked on sub product",true);
		
		add.getViewAllLink().click();
		Reporter.log("clicked on the view all link",true);
		Thread.sleep(400);
		WebElement web = driver.findElement(By.xpath("//div[@class='group-serch-box']//img[@title='Johnsons Baby Soap 50 g']"));
		System.out.println(web);
		
	}
}
