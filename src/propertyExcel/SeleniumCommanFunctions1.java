package propertyExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SeleniumCommanFunctions1 {
        private static final CharSequence data = null;

		public static  WebDriver openBrowser(String brName) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	    return driver;
	
	}

	public static void openUrl(WebDriver driver, String OpenUrl) {
		driver.get(OpenUrl);
		
	}

	public static void enterText(WebDriver driver, String locName, String locValue, String data) {
		if("id".equals(locName)) {
			driver.findElement(By.id(locValue)).sendKeys(data);
			
		}
		if("xpath".equals(locName)) {
			driver.findElement(By.xpath(locValue)).sendKeys(data);
		}
	}

	public static void clickbutton(WebDriver driver, String xpathClick) {
		driver.get(xpathClick);
		}
		
	}

