package com.globant.SeleniumExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class ExampleTest extends TestCase{
	
	WebDriver driver = null;
	
	public void testSelenium () {
		String driverPath = "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver= new ChromeDriver();

		driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement message = driver.findElement(By.className("display-6"));
        System.out.println(message.getText());
        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        textBox.sendKeys("Selenium");
        submitButton.click();
        
        
        
	}
}
