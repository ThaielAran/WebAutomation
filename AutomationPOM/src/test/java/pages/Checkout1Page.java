package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout1Page extends BasePage{

	@FindBy(id="first-name")
	WebElement nameInput;
	@FindBy(id="last-name")
	WebElement surnameInput;
	@FindBy(id="postal-code")
	WebElement postInput;
	
	@FindBy(id="continue")
	WebElement continueB;
	
	public WebElement getContinueB() {
		return continueB;
	}
	public Checkout1Page(WebDriver driver) {
		super(driver);
	}
	
	public void setNameText(String text) {
		this.nameInput.sendKeys(text);
	}
	public void setSurnameText(String text) {
		this.surnameInput.sendKeys(text);
	}
	public void setPostText(String text) {
		this.postInput.sendKeys(text);
	}
	public Checkout2Page clickContinue() {
		this.continueB.click();
		return new Checkout2Page(driver);
	}
	
}
