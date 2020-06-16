package com.SastaSundar.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.SastaSundar.genricLib.Base;
import com.SataSundar.ObjectRepo.OrderMedicine_AddToCart;

public class OrderMedicine_AddToCartTest extends Base
{
	OrderMedicine_AddToCart medicine;
	@Test
	public void addToCartMedicineTest() throws Exception
	{
		medicine = PageFactory.initElements(driver, OrderMedicine_AddToCart.class);
		Thread.sleep(4000);
		medicine.clickOrderMedicine();
		Reporter.log("clicked on order by medicine lick",true);
		Thread.sleep(4000);
		medicine.searchMedicine();
		Reporter.log("clicked on search field",true);
		
		String result = medicine.getShowingResults().getText();
		System.out.println(result);
		
		medicine.getAddButton().click();
		Reporter.log("clicked add button",true);
		
		String actul = driver.findElement(By.xpath("//a[contains(text(),'Exzilor ')]")).getText();
		System.out.println(actul);
		Assert.assertTrue(actul.contains("Exzilor"));
		Reporter.log("medicine added to cart",true);
		
	}
}
