package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout2Page extends BasePage{

	@FindBy(id="finish")
	private WebElement finishB;
	@FindBy(className = "summary_total_label")
	private WebElement summary;
	
	public WebElement getSummary() {
		return summary;
	}

	public WebElement getFinishB() {
		return finishB;
	}

	public Checkout2Page(WebDriver driver) {
		super(driver);
	}

	public FinishPage finishButtonClick() {
		this.finishB.click();
		return new FinishPage(driver);
	}
}
