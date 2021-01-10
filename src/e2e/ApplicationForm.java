package e2e;

import org.openqa.selenium.WebDriver;

import components.Browser;
import constants.ConstStrings;

public class ApplicationForm {
	static WebDriver driver;
	
	static Browser browser = new Browser(driver);

	public static void main(String[] args) {
		// Opens the chrome driver with the mentioned configuration
		driver = browser.openChrome();	
		
		// Opens the main website
		driver.get(ConstStrings.url);
	}
}
