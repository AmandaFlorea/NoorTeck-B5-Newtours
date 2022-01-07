package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightsStepDefinition extends ObjInitialize {
	
	String url = "http://demo.guru99.com/test/newtours/";
	
	@Given("User is on Flights Page")
	public void user_is_on_flights_page() {
		
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		
		
		homeObj.clickFlights();
	  
	}

	@When("User is able to enter flight details")
	public void user_is_able_to_enter_flight_details() {
		
		flightsObj.clickOneWayRadioButton();
		flightsObj.selectPassengerDropDown("value", "3");
		flightsObj.selectArrivingInDropDown("value","New York");
		flightsObj.selectMonthArriving("value","1");
		flightsObj.selectDayArriving("value","5");
		flightsObj.selectReturnInDropDown("value","London");
		flightsObj.selectMonthReturn("value","1");
		flightsObj.selectDayReturn("value", "31");
		flightsObj.selectFirstClass();
		flightsObj.selectAirLine("text","Unified Airlines");
	   
	}

	@When("User is able to Click continue")
	public void user_is_able_to_click_continue() {
		flightsObj.clickContinue();
	}

	@Then("User Recieves Flight Finder Message")
	public void user_recieves_flight_finder_message() {
		flightsObj.flightFinderMessage();
		CommonUI.quitBrowser();
	}
	

}
