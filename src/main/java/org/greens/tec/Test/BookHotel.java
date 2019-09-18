package org.greens.tec.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
		
	}		
	@FindBy(id="first_name")
	private static WebElement textFirstName;
	
	@FindBy(id="last_name")
	private WebElement textLastName;
	
	@FindBy(id="address")
	private WebElement textAddress;
	
	@FindBy(id="cc_num")
	private WebElement textccnum;
	
	@FindBy(id="cc_type")
	private WebElement dropCcType ;
	
	@FindBy(id="cc_exp_month")
	private WebElement dropExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dropExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement textCvvNum;
	
	@FindBy(id="book_now")
	private WebElement clikButton;
	
	@FindBy(id="order_no")
	private WebElement getOrderNo;
	

	public WebElement getTextFirstName() {
		return textFirstName;
	}

	public WebElement getTextLastName() {
		return textLastName;
	}

	public WebElement getTextAddress() {
		return textAddress;
	}

	public WebElement getTextccnum() {
		return textccnum;
	}

	public WebElement getDropCcType() {
		return dropCcType;
	}

	public WebElement getDropExpMonth() {
		return dropExpMonth;
	}

	public WebElement getDropExpYear() {
		return dropExpYear;
	}

	public WebElement getTextCvvNum() {
		return textCvvNum;
	}

	public WebElement getClikButton() {
		return clikButton;
	}

	public WebElement getGetOrderNo() {
		return getOrderNo;
	}
	
	
	
	


}
