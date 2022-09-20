package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.BookHotel;
import com.pages.LoginPage;
import com.pages.OrderId;
import com.pages.SearchHotel;
import com.pages.SelectHotel;
import com.resusable.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition extends BaseClass {

	LoginPage login;
	SelectHotel selectHotel;
	BookHotel bookHotel;

	@Given("User is on Adactin home page and verify {string}")
	public void user_is_on_adactin_home_page_and_verify(String string) {
		browserLaunch("Chrome");
		getUrl("https://adactinhotelapp.com/");
		maximizeWindow();
	}



	@When("User should perform Login by valid {string} and {string}")
	public void userShouldPerformLoginByValidAnd(String string, String string2) {
		login=new LoginPage();
		login.login(string, string2);
	}

	@Then("User should verify {string}")
	public void userShouldVerify(String string) {
		SearchHotel hotel=new SearchHotel();
		Assert.assertEquals("Verify User", string, hotel.verifyUser());
	}

	@Then("User should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userShouldEnter(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		SearchHotel hotel=new SearchHotel();
		hotel.hotelSearch(string, string2, string3, string4, string5, string6, string7, string8);
	}

	@Then("User should verify navigate to {string} page")
	public void userShouldVerifyNavigateToPage(String string) {
		selectHotel=new SelectHotel();
		Assert.assertEquals("Verify User", string, selectHotel.verifySelectHotel());
	}

	@Then("User should select hotel")
	public void userShouldSelectHotel() {
		selectHotel.hotelSelect();
	}

	@Then("User should verify {string} page")
	public void userShouldVerifyPage(String string) {
		bookHotel=new BookHotel();
		Assert.assertEquals("Verify Book Hotel", string, bookHotel.verifyBookHotel());

	}

	@Then("User should enter {string},{string},{string} and card details")
	public void user_should_enter_and_card_details(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> m = dataTable.asMaps();

		Map<String, String> map = m.get(2);

		String cardNum = map.get("Credit Card No");
		String cardType=map.get("Credit Card Type");
		String expiryMonth=map.get("Expiry Month");
		String expiryYear=map.get("Expiry Year");
		String cvv=map.get("CVV Number");
		
		

		bookHotel.hotelBooking(string, string2, string3, cardNum, cardType, expiryMonth, expiryYear, cvv);

	}
	@Then("User should get Order id and verify {string}")
	public void userShouldGetOrderIdAndVerify(String string) {
		OrderId order=new OrderId();
		String verifyOrderId = order.verifyOrderId();

		System.out.println(verifyOrderId);

	}

	@When("User should perform Login by {string} and {string}")
	public void user_should_perform_login_by_and(String string, String string2) {
		login=new LoginPage();
		login.invalidPassword(string, string2);
	}

	@Then("User should verify error message")
	public void user_should_verify_error_message() {
		String errorMessage = login.errorMessage();
		System.out.println(errorMessage);
	}




}
