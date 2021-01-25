package com.walmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.qa.base.TestBase;
import com.walmart.qa.pages.HomePage;
import com.walmart.qa.pages.ShopGrocery;

public class HomePageTest extends TestBase{
	
	HomePage homepage;
	ShopGrocery shopgrocery;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		homepage = new HomePage();
	}
	
	@Test(priority=1)
	public void validateHomePageTitleTest() {
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Online Shopping Canada: Everyday Low Prices at Walmart.ca!");
	}
	
	@Test(priority=2)
	public void validateWalmartImageTest() {
		boolean flag = homepage.validateWalmartImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void validateShopGroceryTest() {
		shopgrocery = homepage.validateShopGrocery();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
