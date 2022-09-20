package com.resusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch(String browser) {
		switch (browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		case "IE Browser":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		default:
			break;
		}
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public void getUrl(String url) {
		driver.get(url);
	}
	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public WebElement id(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}
	public WebElement name(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}
	public WebElement xpath(String tagName, String attributeName, String attributeValue) {
		WebElement element = driver.findElement(By.xpath("//"+tagName+"[@"+attributeName+"='"+attributeValue+"']"));
		return element;
	}
	public void sendKeys(WebElement element,String text) {
		element.sendKeys(text);
	}
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public void click(WebElement element) {
		element.click();
	}
	public void clear(WebElement element) {
		element.clear();
	}
	public WebElement explicitWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
		return until;
	}
	







}
