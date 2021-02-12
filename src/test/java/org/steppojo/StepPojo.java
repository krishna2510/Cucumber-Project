package org.steppojo;

import org.base.Base;
import org.locators.BookingPage;
import org.locators.ConfirmationPage;
import org.locators.LoginPage;
import org.locators.SearchHotelPage;
import org.locators.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepPojo extends Base{
	
	LoginPage l;
	SearchHotelPage s;
	SelectHotel h;
	BookingPage b;
	ConfirmationPage c;

	@Given("User is on Adacitin login page")
	public void user_is_on_Adacitin_login_page() {
	    
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximizeWindow();
	}

	@When("User enters the valid {string} and {string}")
	public void user_enters_the_valid_and(String string, String string2) {
	   l = new LoginPage();
	  l.login(string, string2);
	}

	@Then("User should click on login button")
	public void user_should_click_on_login_button() {
	    
	}

	@When("User is on Search hotel page enter the {string},{string},{string},{string},{string},{string}")
	public void user_is_on_Search_hotel_page_enter_the(String string, String string2, String string3, String string4, String string5, String string6) {
	   s = new SearchHotelPage();
	   s.search(string, string2, string3, string4, string5, string6);
	}

	@Then("User should click on Search button")
	public void user_should_click_on_Search_button() {
	   
	}

	@Then("user should click on First button and Continue button")
	public void user_should_click_on_First_button_and_Continue_button() {
		 h = new SelectHotel();
		 h.select();
	    
	}

	@When("User is on Book a hotel page enter the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_is_on_Book_a_hotel_page_enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   b = new BookingPage();
	   b.booking(string, string2, string3, string4, string5, string6, string7, string8);
	}

	@Then("User Should note the Order no")
	public void user_Should_note_the_Order_no() {
	    c = new ConfirmationPage();
	    c.confirm();
	}

}
