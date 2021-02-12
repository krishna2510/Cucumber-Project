package org.locators;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends Base {
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="last_name")
	WebElement lastName;
	
	@FindBy(id="address")
	WebElement billingAddress;
	
	@FindBy(id="cc_num")
	WebElement ccNo;
	
	@FindBy(id="cc_type")
	WebElement ccType;
	
	@FindBy(id="cc_exp_month")
	WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	WebElement expYear;
	
	@FindBy(id="cc_cvv")
	WebElement cvvNo;
	
	@FindBy(id="book_now")
	WebElement bookBtn;

	

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}
	
	public WebElement getBookBtn() {
		return bookBtn;
	}	
	
	public void booking(String firstname,String lastname,String address,String ccno,String cctype,String expmonth,String expyear,String cvvno) {
		
		enterText(getFirstName(), firstname);
		enterText(getLastName(), lastname);
		enterText(getBillingAddress(), address);
		enterText(getCcNo(), ccno);
		selection(getCcType(), cctype);
		selection(getExpMonth(), expmonth);
		selection(getExpYear(), expyear);
		enterText(getCvvNo(), cvvno );
		click(getBookBtn());
		
	}
	
}
