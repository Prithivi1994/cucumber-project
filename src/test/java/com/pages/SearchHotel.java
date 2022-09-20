package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resusable.BaseClass;

public class SearchHotel extends BaseClass{
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username_show")
	private WebElement welcomeText;
	
	@FindBy(id="location")
	private WebElement loaction;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement numberOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement dateIn;
	
	@FindBy(id="datepick_out")
	private WebElement dateOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(id="Submit")
	private WebElement submitBtn;
	
	public WebElement getUser() {
		return welcomeText;
	}


	
	
	public WebElement getLoaction() {
		return loaction;
	}




	public WebElement getHotels() {
		return hotels;
	}




	public WebElement getRoomType() {
		return roomType;
	}




	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}




	public WebElement getDateIn() {
		return dateIn;
	}




	public WebElement getDateOut() {
		return dateOut;
	}




	public WebElement getAdultRoom() {
		return adultRoom;
	}




	public WebElement getChildRoom() {
		return childRoom;
	}




	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	
	public String verifyUser() {
		String userText = getAttribute(getUser());
		return userText;
	}
	public void hotelSearch(String location, String hotels, String roomType,
			String noOfRooms, String dateIn,String dateOut, String adultRoom,String childRoom) {
		sendKeys(getLoaction(), location);
		sendKeys(getHotels(), hotels);
		sendKeys(getRoomType(), roomType);
		sendKeys(getNumberOfRooms(),noOfRooms);
		clear(getDateIn());
		sendKeys(getDateIn(), dateIn);
		clear(getDateOut());
		sendKeys(getDateOut(), dateOut);
		sendKeys(getAdultRoom(), adultRoom);
		sendKeys(getChildRoom(), childRoom);
		getSubmitBtn().click();
		
	}

	
	
	
	
	
	
	
	
	
	
}
