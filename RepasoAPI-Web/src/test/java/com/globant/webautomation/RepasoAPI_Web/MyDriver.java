package com.globant.webautomation.RepasoAPI_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
	private WebDriver driver;

	public MyDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	public WebDriver getDriver() {
		return this.driver;
	}
	
}

