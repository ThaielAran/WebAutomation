package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	@FindBy(id="password")
	private WebElement passInput;
	
	@FindBy(id="user-name")
	private WebElement userInput;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	public HomePage(WebDriver driver, String url) {
		super(driver);
		this.driver.get(url);
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void setUserText(String text) {
		this.userInput.sendKeys(text);
	}
	public void setPassText(String text) {
		this.passInput.sendKeys(text);
	}
	public InventoryPage clickLogin() {
		this.loginButton.click();
		return new InventoryPage(driver);
	}
}