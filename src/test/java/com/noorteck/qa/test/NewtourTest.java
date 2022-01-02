package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://demo.guru99.com/test/newtours/";

		CommonUI commonUIObj = new CommonUI();
		ObjInitialize obj = new ObjInitialize();
		NewtourTest testObj = new NewtourTest();

		commonUIObj.openBrowser("chrome");
		commonUIObj.navigate(url);

		obj.initializeClassObj();
		testObj.homePageTestCaseOne();
		// testObj.registerTestCaseTwo();
		//testObj.flightsTestCaseThree();

		commonUIObj.quitBrowser();

	}

	public void homePageTestCaseOne() {

		homeObj.clickSignOn();
		signOnObj.enterUserName("tutorial");
		signOnObj.enterPassword("tutorial");
		signOnObj.clickSubmitButton();
		signOnObj.LoginSuccessfullyDisplayed();
		signOnObj.LoginThankYou();

	}

	public void registerTestCaseTwo() {

		homeObj.clickRegister();
		registerObj.enterFirstName("Jane");
		registerObj.enterLastName("Doe");
		registerObj.enterPhoneNumber("123-456-1236");
		registerObj.enterEmail("janeDoe@gmail.com");
		registerObj.enterAddress("456 mulberry lane");
		registerObj.enterCity("Haymarket");
		registerObj.enterState("VA");
		registerObj.enterZipCode("22456");
		registerObj.selectCountry( "El Salvador");
		registerObj.enterUserName("janeDoe@gmail.com");
		registerObj.enterPassword("password123");
		registerObj.enterConfirmPassword("password123");
		registerObj.clickSubmitButton();
		registerObj.verifyRegister();

	}
	
	public void flightsTestCaseThree() {
		
		homeObj.clickFlights();
		flightsObj.clickOneWayRadioButton();
		flightsObj.selectPassengerDropDown("3");
		flightsObj.selectArrivingInDropDown("New York");
		flightsObj.selectMonthArriving("January");
		flightsObj.selectDayArriving("5");
		flightsObj.selectReturnInDropDown("London");
		flightsObj.selectMonthReturn("January");
		flightsObj.selectDayReturn("31");
		flightsObj.selectFirstClass();
		flightsObj.selectAirLine("Unified Airline");
		flightsObj.clickContinue();
		flightsObj.flightFinderMessage();
	}
	
	
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FORGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT
 * FORGET ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */