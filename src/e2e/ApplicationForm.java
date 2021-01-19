package e2e;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import components.Browser;
import components.Enums;
import components.FormElements;
import constants.ConstStrings;

public class ApplicationForm {
	static WebDriver driver;
	static FormElements form;
	
	static Browser browser = new Browser(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// Opens the chrome driver with the mentioned configuration
		driver = browser.openChrome();	
		
		// Opens the main website
		driver.get(ConstStrings.url);
		
		form = new FormElements(driver);
		
		// Sets the textbox value
		form.setFirstName("Maitry");
		form.setLastName("Mer");
		form.setEmail("maitrimer@gmail.com");
		form.setMobile("0123456789");
		form.setAddress("Pune");
		form.setGender(Enums.Gender.FEMALE);
		
		// Closes the browser
		driver.close();
	}
}
