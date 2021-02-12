package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.SlowLoadableComponent;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepRunner {
	WebDriver driver;
	
	@Given("User is on Adacitin login page")
	public void user_is_on_Adacitin_login_page() {
	    System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Cucumbr1Pro\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://adactinhotelapp.com/");
	    driver.manage().window().maximize();
	}
	
	@When("User enters the valid {string} and {string}")
	public void user_enters_the_valid_and(String string, String string2) {
		WebElement usertxt = driver.findElement(By.id("username"));
		usertxt.sendKeys(string);
		
		WebElement passTxt = driver.findElement(By.id("password"));
		passTxt.sendKeys(string2);
		    
	}

	@Then("User should click on login button")
	public void user_should_click_on_login_button() {
		WebElement btn = driver.findElement(By.id("login"));
		btn.click();
	    
	}
	
	@When("User is on Search hotel page enter the {string},{string},{string},{string},{string},{string}")
	public void user_is_on_Search_hotel_page_enter_the(String string, String string2, String string3, String string4, String string5, String string6) {
	    WebElement Location = driver.findElement(By.id("location"));
	    Select sel = new Select(Location);
	    sel.selectByVisibleText(string);
	    
	    WebElement Hotels = driver.findElement(By.id("hotels"));
	    Select sel1 = new Select(Hotels);
	    sel1.selectByVisibleText(string2);
	    
	    WebElement noOfRoom = driver.findElement(By.id("room_nos"));
	    Select sel2 = new Select(noOfRoom);
	    sel2.selectByVisibleText(string3);
	    
	    WebElement checkInDate = driver.findElement(By.id("datepick_in"));
	    checkInDate.clear();
	    checkInDate.sendKeys(string4);
	    
	    WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
	    checkOutDate.clear();
	    checkOutDate.sendKeys(string5);
	    
	    WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
	    Select sel3 = new Select(adultsPerRoom);
	    sel3.selectByVisibleText(string6);
	    
	}

	@Then("User should click on Search button")
	public void user_should_click_on_Search_button() {
	    WebElement ser = driver.findElement(By.id("Submit"));
	    ser.click();
	}

	@Then("user should click on First button and Continue button")
	public void user_should_click_on_First_button_and_Continue_button() {
	    WebElement radio = driver.findElement(By.id("radiobutton_1"));
	    radio.click();
	    
	    WebElement cont = driver.findElement(By.id("continue"));
	    cont.click();
	    
	}

	@When("User is on Book a hotel page enter the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_is_on_Book_a_hotel_page_enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    WebElement firstName = driver.findElement(By.id("first_name"));
	    firstName.sendKeys(string);
	    
	    WebElement lastName = driver.findElement(By.id("last_name"));
	    lastName.sendKeys(string2);
	    
	    WebElement billingAddress = driver.findElement(By.id("address"));
	    billingAddress.sendKeys(string3);
	    
	    WebElement creditCardNo = driver.findElement(By.id("cc_num"));
	    creditCardNo.sendKeys(string4);
	    
	    WebElement ccType = driver.findElement(By.id("cc_type"));
	    Select sel4 = new Select(ccType);
	    sel4.selectByVisibleText(string5);
	    
	    WebElement expiryDte = driver.findElement(By.id("cc_exp_month"));
	    Select sel5 = new Select(expiryDte);
	    sel5.selectByVisibleText(string6);
	    
	    WebElement expiryYr = driver.findElement(By.id("cc_exp_year"));
	    Select sel6 = new Select(expiryYr);
	    sel6.selectByVisibleText(string7);
	    
	    WebElement cvvNo = driver.findElement(By.id("cc_cvv"));
	    cvvNo.sendKeys(string8);
	    
	    
	}

	@Then("User Should note the Order no")
	public void user_Should_note_the_Order_no() throws InterruptedException {
		
		WebElement bkBtn = driver.findElement(By.id("book_now"));
		bkBtn.click();
		Thread.sleep(8000);
		
		WebElement book = driver.findElement(By.id("order_no"));
		String s8 = book.getText();
		System.out.println("Booking No : "+ s8);
	    
	}

}
