package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

	@FindBy(id="checkout")
	private WebElement checkoutButton;
	
	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	@FindBy(id="remove-sauce-labs-backpack")
	private WebElement removeBackpackButton;
	@FindBy(id="remove-sauce-labs-bike-light")
	private WebElement removeBikeLight;
	@FindBy(id="remove-sauce-labs-bolt-t-shirt")
	private WebElement removeShirt;
	
	
	
	
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	public Checkout1Page checkingOut() {
		this.checkoutButton.click();
		return new Checkout1Page(driver);
	}

	public void removeBackpack() {
		this.removeBackpackButton.click();
	}
	public void removeBikeLight() {
		this.removeBikeLight.click();
	}
	public void removeShirt() {
		this.removeShirt.click();
	}
}
