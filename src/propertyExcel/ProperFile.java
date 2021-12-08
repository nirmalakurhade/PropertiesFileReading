package propertyExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProperFile {
	static WebDriver driver = null;
	
@Test
	public static void Testmail() throws NullPointerException, IOException {
		Properties property = new Properties();
		String projectpath =System.getProperty("user");
		FileInputStream fis = new FileInputStream("E:\\sada\\propertyxl\\abcd.properties");
		property.load(fis);
		String browser = property.getProperty("browser");
		System.out.println(browser);
		String actText = driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		System.out.println("acttext=" + actText);
		Assert.assertEquals(actText, "Java By Kiran");
	}
		
	
	}
	


