package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resusable.BaseClass;

public class OrderId extends BaseClass {
	public OrderId() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderId;
	
	public WebElement getOrderId() {
		return orderId;
	}
	
	public String verifyOrderId() {
		WebElement webElement = explicitWait(getOrderId());
		String orderId = getAttribute(webElement);
		return orderId;

	}

}
