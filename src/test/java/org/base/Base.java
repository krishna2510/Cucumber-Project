package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Cucumbr1Pro\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();

	}
	public void loadUrl(String url) {
		driver.get(url);
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void enterText(WebElement element, String data) {
		element.sendKeys(data);

	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void close() {
		driver.close();

	}
	
	public void selection(WebElement element, String data) {
		Select sel = new Select(element);
		sel.selectByVisibleText(data);
	}
	
	public void getValue(WebElement element,String data) {
	String s =	element.getAttribute(data);
        System.out.println("Order no is : "+s);
	}
	
	
	
	
}

