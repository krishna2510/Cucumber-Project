package org.stepdef;

import java.util.List;

import org.base.Base;
import org.locators.BookingPage;
import org.locators.ConfirmationPage;
import org.locators.LoginPage;
import org.locators.SearchHotelPage;
import org.locators.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneDAndTwoD extends Base{
	
	 LoginPage l;
	 SearchHotelPage s;
	 SelectHotel h;
	 ConfirmationPage c;
	 

	@Given("User is on Adacitin login page")
	public void user_is_on_Adacitin_login_page() {
	    getDriver();
	    loadUrl("https://adactinhotelapp.com/");
	    maximizeWindow();
	}

	@When("User enters the valid UserName and PassWord")
	public void user_enters_the_valid_UserName_and_PassWord(io.cucumber.datatable.DataTable dataTable) {
	     l = new LoginPage();
	     List<List<String>> asLists = dataTable.asLists();
	     List<String> list = asLists.get(0);
	     String string = list.get(0);
	     
	    String string2 = list.get(1);
	    l.login(string, string2);
	    
	}

	@Then("User should click on login button")
	public void user_should_click_on_login_button() {
	   
	}

	@When("User is on Search hotel page enter the Location,Hotels,Number of rooms,Check in date,Check out date,Adults per room")
	public void user_is_on_Search_hotel_page_enter_the_Location_Hotels_Number_of_rooms_Check_in_date_Check_out_date_Adults_per_room(io.cucumber.datatable.DataTable dataTable) {
	   SearchHotelPage s = new SearchHotelPage();
	   List<List<String>> asLists = dataTable.asLists();
	   List<String> list = asLists.get(0);
	   String string3 = list.get(0);
	   
	   String string4 = list.get(1);
	   String string5 = list.get(2);
	   String string6 = list.get(3);
	   String string7 = list.get(4);
	   String string8 = list.get(5);
	   s.search(string3, string4, string5, string6, string7, string8);
	   
	}

	@Then("User should click on Search button")
	public void user_should_click_on_Search_button() {
	    
	    
	}

	@Then("user should click on First button and Continue button")
	public void user_should_click_on_First_button_and_Continue_button() {
		 h = new SelectHotel();
	     h.select();
	}

	@When("User is on Book a hotel page enter the First name,Last name,Billing address,Credit card number,Credit card type,Expiry date,Expiry year,cvv number")
	public void user_is_on_Book_a_hotel_page_enter_the_First_name_Last_name_Billing_address_Credit_card_number_Credit_card_type_Expiry_date_Expiry_year_cvv_number(io.cucumber.datatable.DataTable dataTable) {
	     BookingPage b = new BookingPage();
	     List<List<String>> asLists = dataTable.asLists();
	     List<String> List = asLists.get(0);
	     String string6 = List.get(0);
	     String String7 = List.get(1);
	     String string8 = List.get(2);
	     String string9 = List.get(3);
	     String string10 = List.get(4);
	     String string11 = List.get(5);
	     String string12 = List.get(6);
	     String string13 = List.get(7);
	    b.booking(string6, String7, string8, string9, string10, string11, string12, string13);
	}

	@Then("User Should note the Order no")
	public void user_Should_note_the_Order_no() {
	     
	     
	}


}
