package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinishPage extends BasePage{

	@FindBy(className = "complete-header")
	private WebElement header;
	
	public WebElement getHeader() {
		return header;
	}

	public FinishPage(WebDriver driver) {
		super(driver);
	}

	
}
