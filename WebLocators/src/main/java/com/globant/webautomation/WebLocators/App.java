package com.globant.webautomation.WebLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

    	WebDriver driver = null;
   		String driverPath = "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver_win32\\chromedriver.exe";
   		System.setProperty("webdriver.chrome.driver", driverPath);
   		driver= new ChromeDriver();
   		
   		driver.navigate().to("https://demoblaze.com/");
   		
   		/*SUCCESSFULL SIGNUP
   		WebElement signUpButton = driver.findElement(By.cssSelector("li.nav-item:last-child"));
   		signUpButton.click();
   		WebElement userInput = driver.findElement(By.cssSelector("#sign-username"));
   		WebElement passInput = driver.findElement(By.cssSelector("#sign-password"));
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		userInput.sendKeys("ThayAran");
   		passInput.sendKeys("12345678");
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		WebElement signUp = driver.findElement(By.cssSelector(".modal-footer :last:child"));
   		signUp.click();*/
   		
   		/*PLAYING "ABOUT US" VIDEO
   		WebElement aboutUsButton = driver.findElement(By.cssSelector("li.nav-item:nth-child(3)"));
   		aboutUsButton.click();
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   		WebElement playButton = driver.findElement(By.cssSelector(".vjs-big-play-button"));
   		playButton.click();*/
   		
   		
   		
   		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".card-block")));
   		WebElement laptopFilter = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
   		laptopFilter.click();
   		//WebElement laptop = driver.findElement(By.cssSelector(".hrefch"));
   		//laptop.click();
   		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
   		//WebElement addToCart = driver.findElement(By.cssSelector("a"));
   		//addToCart.click();
    }
}
