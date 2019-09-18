package org.greens.tec.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass{
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
		
	}		
	
	@FindBy(id="location")
	private WebElement dropLocation;
	
	@FindBy(id="hotels")
	private WebElement dropHotel;
	
	@FindBy(id="room_type")
	private WebElement dropRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dropRoomNos;
	
	@FindBy(id="datepick_in")
	private WebElement dropDatePickup ;
	
	@FindBy(id="datepick_out")
	private WebElement dropDatePickOut;
	
	@FindBy(id="adult_room")
	private WebElement dropAdultRoom;
	
	@FindBy(id="child_room")
	private WebElement dropChildRoom;
	
	@FindBy(id="Submit")
	private WebElement clikSubmit;
	

	@FindBy(id="radiobutton_2")
	private WebElement seleRadioButton;
	
	@FindBy(id="continue")
	private WebElement selContinue;

	public WebElement getDropLocation() {
		return dropLocation;
	}

	public WebElement getDropHotel() {
		return dropHotel;
	}

	public WebElement getDropRoomType() {
		return dropRoomType;
	}

	public WebElement getDropROomTypes() {
		return dropRoomNos;
	}

	public WebElement getDropDatePickup() {
		return dropDatePickup;
	}

	public WebElement getDropDatePickOut() {
		return dropDatePickOut;
	}

	public WebElement getDropAdultRoom() {
		return dropAdultRoom;
	}

	public WebElement getDropChildRoom() {
		return dropChildRoom;
	}

	public WebElement getClikSubmit() {
		return clikSubmit;
	}
	
	public WebElement getSeleRadioButton() {
		return seleRadioButton;
	}
	
	public WebElement getSelContinue() {
		return selContinue;
	}
	
	
	
	
	
}