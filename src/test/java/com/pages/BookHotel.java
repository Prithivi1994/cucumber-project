package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resusable.BaseClass;

public class BookHotel extends BaseClass {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),'Book A Hotel ')]")
	public WebElement bookHotel;
	
	@FindBy(id="first_name")
	public WebElement firstName;
	
	@FindBy(id="last_name")
	public WebElement lastName;
	
	@FindBy(id="address")
	public WebElement address;
	
	@FindBy(id="cc_num")
	public WebElement cardNumber;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	public WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	public WebElement expiryYear;
	
	@FindBy(id="cc_cvv")
	public WebElement cvvNumber;
	
	@FindBy(id="book_now")
	public WebElement btnBookNow;
	
	public WebElement getBookHotel() {
		return bookHotel;
	}
	
	
	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}


	public WebElement getExpiryYear() {
		return expiryYear;
	}


	public WebElement getCvvNumber() {
		return cvvNumber;
	}


	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	public String verifyBookHotel() {
		String text = getText(getBookHotel());
		return text;
	}
	
	public void hotelBooking(String firstName,String lastName,String billingAddress,String cardNum,
			String cardType,String expiryMonth, String expiryYear,String cvv) {
		sendKeys(getFirstName(), firstName);
		sendKeys(getLastName(), lastName);
		sendKeys(getAddress(), billingAddress);
		sendKeys(getCardNumber(), cardNum);
		sendKeys(getCardType(), cardType);
		sendKeys(getExpiryMonth(), expiryMonth);
		sendKeys(getExpiryYear(), expiryYear);
		sendKeys(getCvvNumber(), cvv);
		getBtnBookNow().click();	
	}
	
	

}
