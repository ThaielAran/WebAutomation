package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebDriverWait getWait() {
		return wait;
	}
	
	public boolean elementIsDisplayed(WebElement element) {
		getWait().until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
		
	}
	public void waitToBeClickable(WebElement element) {
		getWait().until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitToBeDisplayed(WebElement element) {
		getWait().until(ExpectedConditions.visibilityOf(element));
	}
}