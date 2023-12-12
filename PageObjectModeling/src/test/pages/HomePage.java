package basePage;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css ="name='search'")
	private WebElement searchInput;
	
	@FindBy(css = ".cdx-search-input__end-button")
	private WebElement searchInput;
	
	public ResultPage buscar() {
		
	}

}
