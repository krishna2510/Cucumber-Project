package org.locators;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends Base{
	
	public SearchHotelPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement chechInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	
	@FindBy(id="Submit")
	private WebElement serBtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return chechInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getSerBtn() {
		return serBtn;
	}
	
	public void search(String location,String hotel,String noOfRooms,String checkInDate,String chechOutDate,String adultPerRoom) {
		
		selection(getLocation(), location);
		selection(getHotels(), hotel);
		selection(getNoOfRooms(), noOfRooms);
		enterText(getCheckInDate(), checkInDate);
		enterText(getCheckOutDate(), chechOutDate);
		click(getSerBtn());
		
		

	}
	
}
