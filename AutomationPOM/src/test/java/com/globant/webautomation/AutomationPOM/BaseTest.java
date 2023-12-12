package com.globant.webautomation.AutomationPOM;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import junit.framework.TestCase;
import pages.HomePage;

public class BaseTest extends TestCase{

	MyDriver driver;
	HomePage homePage;
	
	@BeforeEach
	public void setUp() {
		driver= new MyDriver();
	}
	@AfterEach
	public void tearDown() {
		driver.getDriver().close();
	}
	
	
	public HomePage getHomePage(){
		return this.homePage= new HomePage(driver.getDriver(), "https://www.saucedemo.com/");
	}
}
