package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition extends ObjInitialize{
	
	
	String url = "http://demo.guru99.com/test/newtours/";
	
	
	@Given("User is on Register Page")
	public void user_is_on_register_page() {
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		homeObj.clickRegister();
	}

	@When("User enters Personal Information in all fields")
	public void user_enters_personal_information_in_all_fields() {
		
		registerObj.enterFirstName("Jane");
		registerObj.enterLastName("Doe");
		registerObj.enterPhoneNumber("123-456-1236");
		registerObj.enterEmail("janeDoe@gmail.com");
		registerObj.enterAddress("456 mulberry lane");
		registerObj.enterCity("Haymarket");
		registerObj.enterState("VA");
		registerObj.enterZipCode("22456");
		registerObj.selectCountry("text","EL SALVADOR");
		registerObj.enterUserName("janeDoe@gmail.com");
		registerObj.enterPassword("password123");
		registerObj.enterConfirmPassword("password123");
	  
	}

	@When("User Clicks on Submit Button")
	public void user_clicks_on_submit_button() {
		registerObj.clickSubmitButton();
	    
	}

	@Then("User Recieves Registration Verified")
	public void user_recieves_registration_verified() {
		registerObj.verifyRegister();
		CommonUI.quitBrowser();
	}


}
