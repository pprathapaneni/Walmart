package com.walmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.ShopGrocery;

public class ShopGroceryTest extends TestBase{
	
	HomePage homepage;
	ShopGrocery shopgrocery;
	
	public ShopGroceryTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		homepage = new HomePage();
		shopgrocery = homepage.validateShopGrocery();
	}
	
	@Test(priority=1)
	public void validateShopGroceryTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Walmart Grocery Delivery &amp; Pickup: Order Groceries online | Walmart Canada");
	}
	
	@Test(priority=2)
	public void validateGroceryOptionsTest() {
		shopgrocery.validateGroceryOptions();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
