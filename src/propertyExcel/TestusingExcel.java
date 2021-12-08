package propertyExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestusingExcel {
	WebDriver driver = null;

	@Test
	public void checkproperty() throws IOException {
		FileInputStream fis = new FileInputStream("abcd.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String brType = properties.getProperty("browser");
		String url = properties.getProperty("url");

		WebDriver driver = SeleniumCommanFunctions1.openBrowser(brType);
		SeleniumCommanFunctions1.openUrl(driver, url);
		SeleniumCommanFunctions1.enterText(driver, "id", "email", "kiran@gmail.com");
		SeleniumCommanFunctions1.enterText(driver, "id", "password", "123456");
		driver.findElement(By.xpath(properties.getProperty("Clickbutton"))).click();
		driver.close();
	}

	@Test
	public void cheakTitle() throws IOException {
		FileInputStream fis = new FileInputStream("abcd.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String brType = properties.getProperty("browser");
		String url = properties.getProperty("url");
		WebDriver driver = SeleniumCommanFunctions1.openBrowser(brType);
		SeleniumCommanFunctions1.openUrl(driver, url);
		String actText = driver.findElement(By.xpath(properties.getProperty("Texttitle"))).getText();
		System.out.println("acttext=" + actText);
		Assert.assertEquals(actText, "Java By Kiran");
		driver.close();

	}

	@Test
	public void cheakmail() throws IOException {
		FileInputStream fis = new FileInputStream("abcd.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String brType = properties.getProperty("browser");
		String url = properties.getProperty("url");
		WebDriver driver = SeleniumCommanFunctions1.openBrowser(brType);
		SeleniumCommanFunctions1.openUrl(driver, url);
		String cheakmail = driver.findElement(By.xpath(properties.getProperty("mailpath"))).getText();
		String exp = "";
		Assert.assertEquals(cheakmail, exp);
		System.out.println("email_error=" + cheakmail);
		driver.close();
	}

	@Test
	public void cheakpassword() throws IOException {
    FileInputStream fis = new FileInputStream("abcd.properties");
	Properties properties = new Properties();properties.load(fis);
	String brType = properties.getProperty("browser");
	String url = properties.getProperty("url");
	WebDriver driver = SeleniumCommanFunctions1.openBrowser(brType);
	SeleniumCommanFunctions1.openUrl(driver,url);
    String cheakpassword = driver.findElement(By.xpath(properties.getProperty("passwordpath"))).getText();
	String exp = "";
	Assert.assertEquals(cheakpassword,exp);
	System.out.println("password_error="+cheakpassword);
	driver.close();
	}

	@Test
	public void singintext() throws IOException {
		FileInputStream fis = new FileInputStream("abcd.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String brType = properties.getProperty("browser");
		String url = properties.getProperty("url");
		WebDriver driver = SeleniumCommanFunctions1.openBrowser(brType);
		SeleniumCommanFunctions1.openUrl(driver, url);
		String singintext = driver.findElement(By.xpath(properties.getProperty("singinpath"))).getText();
		String exp = "Sign in to start your session";
		System.out.println("Sign in to start your session=" + singintext);
		Assert.assertEquals(singintext, exp);
		driver.close();
	}

	@Test
	public void cheakurl() throws IOException {
		FileInputStream fis = new FileInputStream("abcd.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String brType = properties.getProperty("browser");
		String url = properties.getProperty("url");
		WebDriver driver = SeleniumCommanFunctions1.openBrowser(brType);
		SeleniumCommanFunctions1.openUrl(driver, url);
		String cheakurl = driver.findElement(By.xpath(properties.getProperty("url"))).getText();
		String exp = "";
		Assert.assertEquals(cheakurl, exp);
		driver.close();

	}
	@Test
	public void cheakimage() throws IOException {
    FileInputStream fis = new FileInputStream("abcd.properties");
	Properties properties = new Properties();properties.load(fis);
	String brType = properties.getProperty("browser");
	String url = properties.getProperty("url");
	WebDriver driver = SeleniumCommanFunctions1.openBrowser(brType);
	SeleniumCommanFunctions1.openUrl(driver,url);
	String actimage = driver.findElement(By.xpath(properties.getProperty("imagepath"))).getText();
	String exp ="";
	Assert.assertEquals(actimage,exp);
	System.out.println(actimage);
	driver.close();
}
	@Test
	public void registrationpage() throws IOException {
		FileInputStream fis = new FileInputStream("abcd.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String brType = properties.getProperty("browser");
		String url = properties.getProperty("url");

		WebDriver driver = SeleniumCommanFunctions1.openBrowser(brType);
		SeleniumCommanFunctions1.openUrl(driver, url);
		SeleniumCommanFunctions1.enterText(driver, "id", "email", "kiran@gmail.com");
		SeleniumCommanFunctions1.enterText(driver, "id", "password", "123456");
		driver.findElement(By.xpath(properties.getProperty("Clickbutton"))).click();
		driver.get("file:///C:/Users/User/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/register.html");
		driver.findElement(By.id("name")).sendKeys("kiran");
		driver.findElement(By.id("mobile")).sendKeys("123456789");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.close();
	
	}
	
	
}