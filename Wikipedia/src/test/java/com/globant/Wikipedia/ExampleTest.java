package com.globant.Wikipedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {

	WebDriver driver = null;

	
	public void testSelenium () {
		String driverPath = "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver= new ChromeDriver();

		driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
	}

}
