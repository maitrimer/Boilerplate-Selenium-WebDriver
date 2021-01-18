package components;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver driver;
	
	public Browser(WebDriver driver) {
		Browser.driver = driver;
	}

	public WebDriver openChrome() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		Browser.driver = new ChromeDriver();
		setBrowserConfig();
		return driver;
	}

	private void setBrowserConfig() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
