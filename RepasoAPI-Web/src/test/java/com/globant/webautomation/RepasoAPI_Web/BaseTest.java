package com.globant.webautomation.RepasoAPI_Web;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.HomePage;

public class BaseTest {
	protected static MyDriver driver;
	public MyDriver getDriver() {
		return driver;
	}


	HomePage homePage;
	
	public BaseTest() {
		super();
	}
	@Before
	public void setUp() {
		driver= new MyDriver();
	}
	@After
	public void tearDown() {
		driver.getDriver().close();
	}
	
	
	public static HomePage getHomePage(){
		return new HomePage(driver.getDriver(), "https://www.wikipedia.org");
	}
}
