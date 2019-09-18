package org.greens.tec.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLogin extends BaseClass {
	public HotelLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement textUserName;


	@FindBy(id="password")
	private WebElement textpass;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTextUserName() {
		return textUserName;
	}

	public WebElement getTextpass() {
		return textpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	
	
	
	
}




