package org.stepbase;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepBase extends Base{
	@Given("User is on Adacitin login page")
	public void user_is_on_Adacitin_login_page() {
	   getDriver();
	   loadUrl("https://adactinhotelapp.com/");
	   maximizeWindow();
	}

	@When("User enters the valid {string} and {string}")
	public void user_enters_the_valid_and(String string, String string2) {
		WebElement usertxt = driver.findElement(By.id("username"));
		enterText(usertxt, string);
		
		WebElement passTxt = driver.findElement(By.id("password"));
		enterText(passTxt, string2);
	}

	@Then("User should click on login button")
	public void user_should_click_on_login_button() {
		WebElement btn = driver.findElement(By.id("login"));
		click(btn);
	    
	}

	@When("User is on Search hotel page enter the {string},{string},{string},{string},{string},{string}")
	public void user_is_on_Search_hotel_page_enter_the(String string, String string2, String string3, String string4, String string5, String string6) {
		WebElement Location = driver.findElement(By.id("location"));
		selection(Location, string);
		
		WebElement Hotels = driver.findElement(By.id("hotels"));
		selection(Hotels, string2);
		
		WebElement noOfRoom = driver.findElement(By.id("room_nos"));
		selection(noOfRoom, string3);
		
		WebElement checkInDate = driver.findElement(By.id("datepick_in"));
	    enterText(checkInDate, string4);
	    
	    WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
	    enterText(checkOutDate, string5);
	    
	    WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
	    selection(adultsPerRoom, string6);
	}

	@Then("User should click on Search button")
	public void user_should_click_on_Search_button() {
		WebElement ser = driver.findElement(By.id("Submit"));
		click(ser);
	}

	@Then("user should click on First button and Continue button")
	public void user_should_click_on_First_button_and_Continue_button() {
		WebElement radio = driver.findElement(By.id("radiobutton_1"));
		click(radio);
		
		WebElement cont = driver.findElement(By.id("continue"));
		click(cont);
	}

	@When("User is on Book a hotel page enter the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_is_on_Book_a_hotel_page_enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		WebElement firstName = driver.findElement(By.id("first_name"));
		enterText(firstName, string);
		
		 WebElement lastName = driver.findElement(By.id("last_name"));
		 enterText(lastName, string2);
		 
		 WebElement billingAddress = driver.findElement(By.id("address"));
		 enterText(billingAddress, string3);
		 
		 WebElement creditCardNo = driver.findElement(By.id("cc_num"));
		 enterText(creditCardNo, string4);
		 
		 WebElement ccType = driver.findElement(By.id("cc_type"));
		 enterText(ccType, string5);
		 
		 WebElement expiryDte = driver.findElement(By.id("cc_exp_month"));
		 enterText(expiryDte, string6);
		 
		 WebElement expiryYr = driver.findElement(By.id("cc_exp_year"));
		 enterText(expiryYr, string7);
		 
		 WebElement cvvNo = driver.findElement(By.id("cc_cvv"));
		 enterText(cvvNo, string8);
	}

	@Then("User Should note the Order no")
	public void user_Should_note_the_Order_no() throws InterruptedException {
		WebElement bkBtn = driver.findElement(By.id("book_now"));
		click(bkBtn);
		Thread.sleep(8000);
		
		WebElement book = driver.findElement(By.id("order_no"));
		getValue(book, "value");
	   
	}

}
