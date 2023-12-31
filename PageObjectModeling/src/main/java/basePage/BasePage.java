package basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}
	
	public void waitToBeClickable(WebElement element) {
		getWait().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitElementVisibility(WebElement element) {
		getWait().until(ExpectedConditions.visibilityOf(element));
	}
	
	
	// EVITAR ESTE METODO! .sleep (esperas implícitas son mala practica)
	public void waitSomeSeconds(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
