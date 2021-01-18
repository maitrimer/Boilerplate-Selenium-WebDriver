package components;

import org.openqa.selenium.WebElement;

public class Elements {
	
	public void setTextBox(WebElement element, String strngTxt) {
		element.sendKeys(strngTxt);
	}
}
