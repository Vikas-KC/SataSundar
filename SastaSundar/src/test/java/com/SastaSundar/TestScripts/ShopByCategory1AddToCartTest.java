package com.SastaSundar.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.SastaSundar.genricLib.Base;
import com.SataSundar.ObjectRepo.ShopByCategoryAddToCart;

public class ShopByCategory1AddToCartTest extends Base
{
	ShopByCategoryAddToCart addToCart;
	@Test
	public void AddProductToCartTest() throws Exception
	{
		addToCart = PageFactory.initElements(driver, ShopByCategoryAddToCart.class);

		Thread.sleep(5000);
		addToCart.getShopByCategoryLink().click();
		Reporter.log("clicked on Shop By Category link",true);
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Face Mask, Sanitizers & Essentials")).click();
		Reporter.log("clicked Face Mask, Sanitizers & Essentials",true);
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Face Mask & Shield")).click();
		Reporter.log("clicked on Face Mask & Shield",true);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(@class,'col-md-')]/a[@displayname='Venus Face Mask Yellow V-44++ FFP1S Stapled Flat Fold C 1 Piece']")).click();
		Reporter.log("clicked on add buuton",true);
		
//		driver.findElement(By.xpath("(//img[contains(@title,'Face Mask')])[1]")).click();
//		Reporter.log("clicked on Face Mask & Shield image",true);
//		Thread.sleep(5000);
//		addToCart.getAddToCartButton().click();
//		Reporter.log("clicked on add to cart button",true);
//		
//		addToCart.getCartLink().click();
//		Reporter.log("Clicked on cart link",true);
//		
//		String actul = driver.findElement(By.xpath("//a[contains(text(),'Face Mask')]")).getText();
//		
//		Assert.assertTrue(actul.contains("Face Mask"));
//		Reporter.log("Item is added to cart successfully ",true);
	}
}
