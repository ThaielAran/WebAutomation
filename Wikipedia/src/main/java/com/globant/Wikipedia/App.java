package com.globant.Wikipedia;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App{
    public static void main( String[] args ){
    	
    	WebDriver driver = null;
   		String driverPath = "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\chromedriver.exe";
   		System.setProperty("webdriver.chrome.driver", driverPath);
   		driver= new ChromeDriver();
   		String input="Microsoft";
   		
   		driver.navigate().to("https://wikipedia.org/");
   		WebElement textInput = driver.findElement(By.name("search"));
   		textInput.sendKeys(input);
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		WebElement searchButton = driver.findElement(By.className("suggestion-highlight"));
   		searchButton.click();
   		
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		
   		WebElement header = driver.findElement(By.id("firstHeading"));
   		System.out.println("Header equals input: "+ input.equals(header.getText()));
   		
   		List<WebElement> links = driver.findElements(By.tagName("a"));
   		
   		for(WebElement link : links) {
   			System.out.println(link.getText());
   		}
   		
    	}
}
