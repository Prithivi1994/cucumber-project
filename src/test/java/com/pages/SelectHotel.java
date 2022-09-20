package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resusable.BaseClass;

public class SelectHotel extends BaseClass{
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),'Select Hotel ')]")
	private WebElement welcomeText;
	
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	public WebElement getWelcomeText() {
		return welcomeText;
	}
	
	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	public String verifySelectHotel() {
		String text = getText(getWelcomeText());
		return text;
	}
	public void hotelSelect() {
		getRadioButton().click();
		getContinueBtn().click();
		
	}

}
