package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resusable.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUser;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	@FindBy(xpath="//b[contains(text(),'Invalid')]")
	private WebElement errorMessage;
	

	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getErrorMessage() {
		return errorMessage;
	}
	

	
	public void login(String userName, String password) {
		sendKeys(getTxtUser(), userName);
		sendKeys(getTxtPass(), password);
		getBtnLogin().click();
	}
	public void invalidPassword(String userName, String password) {
		sendKeys(getTxtUser(), userName);
		sendKeys(getTxtPass(), password);
		getBtnLogin().click();
	}
	public String errorMessage() {
		String text = getText(getErrorMessage());
		return text;
	}
	
	
	
}
