package com.globant.webautomation.PageObjectModeling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public MyDriver(String browser) {
		if("firefox".equals(browser)) {
			driver= new FirefoxDriver();
		}else {
			String path=System.getProperty("user.dir");
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
	}
}
