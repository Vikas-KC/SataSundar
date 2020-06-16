package com.SataSundar.ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopByCategoryAddToCart
{
	@FindBy(xpath = "//span[text()='Shop by Category']")
	WebElement shopByCategoryLink;
	
	@FindBy(linkText = " ADD")
	WebElement addButton;
	
	@FindBy(linkText = "Add to Cart")
	WebElement addToCartButton;
	
	@FindBy(id = "shopping_cart_item_count")
	WebElement cartLink;

	public WebElement getShopByCategoryLink() {
		return shopByCategoryLink;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getCartLink() {
		return cartLink;
	}
	
	
	
//	@FindBy(linkText = "Face Mask, Sanitizers & Essentials")
//	WebElement face;
//	
//	@FindBy(linkText = "Face Mask & Shield")
//	WebElement faceMask;
	
}
