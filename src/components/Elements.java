package components;

import org.openqa.selenium.WebElement;

public class Elements {
	
	
	public void setTextBox(WebElement element, String valueTxt) {
		element.sendKeys(valueTxt);
	}
	
	public void selectRadioButton(WebElement element) {
		element.click();
	}
}
