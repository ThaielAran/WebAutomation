package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage{

	@FindBy(id="firstHeading")
	private WebElement titulo;
	
	
	public WebElement getTitulo() {
		return titulo;
	}


	public ResultPage(WebDriver webDriver) {
		super(webDriver);
	}

}
