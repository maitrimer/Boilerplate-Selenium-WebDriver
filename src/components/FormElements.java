package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selectors.FormSelectors;

public class FormElements {
	WebDriver driver;
	
	public FormElements(WebDriver driver) {
		this.driver = driver;
	}
	
	Elements setElements = new Elements();
	
	// Waits for the elements to visible
	public void waitForFirstNameToVisible() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(FormSelectors.firstNameTxt)));
	}

	// Gets the Form elements
	public WebElement getFirstName() {
		waitForFirstNameToVisible();
		return this.driver.findElement(By.id(FormSelectors.firstNameTxt));
	}
	
	public WebElement getLastName() {
		return this.driver.findElement(By.id(FormSelectors.lastNameTxt));
	}
	
	public WebElement getEmail() {
		return this.driver.findElement(By.id(FormSelectors.emailTxt));
	}
	
	public WebElement getMobile() {
		return this.driver.findElement(By.id(FormSelectors.mobileNoTxt));
	}
	
	public WebElement getAddress() {
		return this.driver.findElement(By.id(FormSelectors.addressTxt));
	}
	
	public WebElement getMaleGender() {
		return this.driver.findElement(By.xpath(FormSelectors.maleRdBtn));
	}
	
	public WebElement getFemaleGender() {
		return this.driver.findElement(By.xpath(FormSelectors.femaleRdBtn));
	}
	
	public WebElement getOtherGender() {
		return this.driver.findElement(By.xpath(FormSelectors.otherRdBtn));
	}
	
	// Sets the details in elements
	public void setFirstName(String eleTxt) {
		WebElement firstName = getFirstName();
		setElements.setTextBox(firstName, eleTxt);
	}
	
	public void setLastName(String eleTxt) {
		WebElement lastName = getLastName();
		setElements.setTextBox(lastName, eleTxt);
	}
	
	public void setEmail(String eleTxt) {
		WebElement email = getEmail();
		setElements.setTextBox(email, eleTxt);
	}
	
	public void setMobile(String eleTxt) {
		WebElement mobile = getMobile();
		setElements.setTextBox(mobile, eleTxt);
	}
	
	public void setAddress(String eleTxt) {
		WebElement address = getAddress();
		setElements.setTextBox(address, eleTxt);
	}
	
	public void setGender(Enums.Gender value) {
		WebElement male = getMaleGender();
		WebElement female = getFemaleGender();
		WebElement other = getOtherGender();
		
		if(value == Enums.Gender.MALE) {
			setElements.selectRadioButton(male);
		} else if(value == Enums.Gender.FEMALE) {
			setElements.selectRadioButton(female);
		} else {
			setElements.selectRadioButton(other);
		}
	}
}
