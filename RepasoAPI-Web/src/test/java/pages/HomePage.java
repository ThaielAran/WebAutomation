package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	@FindBy(id="searchInput")
	private WebElement input;
	
	@FindBy(className="pure-button")
	private WebElement search;
	
	
	public WebElement getSearch() {
		return search;
	}
	public WebElement getInput() {
		return input;
	}

	public HomePage(WebDriver driver) {
		super(driver);
	}
	public HomePage(WebDriver driver, String string) {
		super(driver);
		super.driver.get(string);
	}
	public ResultPage clickSearch() {
		this.search.click();
		return new ResultPage(super.getDriver());
	}
}
