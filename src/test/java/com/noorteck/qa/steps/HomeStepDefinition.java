package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinition extends ObjInitialize {

	String url = "http://demo.guru99.com/test/newtours/";

	@Given("User is on login page")
	public void user_is_on_login_page() {

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		homeObj.clickSignOn();

	}

	@When("User enters username")
	public void user_enters_username() {
		signOnObj.enterUserName("tutorial");

	}

	@When("User enters password")
	public void user_enters_password() {
		signOnObj.enterPassword("tutorial");

	}

	@When("User Clicks sumbit button")
	public void user_clicks_sumbit_button() {

		signOnObj.clickSubmitButton();

	}

	@Then("User recieves Login Successful")
	public void user_recieves_login_successful() {
		signOnObj.LoginSuccessfullyDisplayed();
		signOnObj.LoginThankYou();
		
		CommonUI.quitBrowser();

	}

}
