package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage{

	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addBackpack;
	public WebElement getAddBackpack() {
		return addBackpack;
	}
	
	@FindBy(id="shopping_cart_container")
	private WebElement cart;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement addBikeLight;
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addShirt;
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement menu;
	@FindBy(id="logout_sidebar_link")
	private WebElement logout;
	
	
	public InventoryPage(WebDriver driver) {
		super(driver);
	}

	public void addBackpack() {
		this.addBackpack.click();
	}
	public void addBikeLight() {
		this.addBikeLight.click();
	}
	public void addShirt() {
		this.addShirt.click();
	}
	public CartPage goToCart() {
		this.cart.click();
		return new CartPage(driver);
	}
	public void openMenu() {
		this.menu.click();
	}
	public HomePage logout() {
		this.logout.click();
		return new HomePage(driver);
	}
}
