package org.locators;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends Base {
	
	public ConfirmationPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_no")
	WebElement orderId;

	public WebElement getOrderId() {
		return orderId;
	}
	
	public void confirm() {
		
		getValue(getOrderId(), "value");

	}
	
}
