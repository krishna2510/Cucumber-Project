package org.locators;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Base {
	
	public SelectHotel() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_1")
	WebElement radio;
	
	@FindBy(id="continue")
	WebElement ctnBtn;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCtnBtn() {
		return ctnBtn;
	}
	
	public void select() {
		
		click(getRadio());
		click(getCtnBtn());

	}
}
