package com.noorteck.qa.utils;

import com.noorteck.qa.pages.FlightsPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SignOnPage;

public class ObjInitialize extends Constants {

	// initialize each page class objects here..
	public void initializeClassObj() {
		homeObj = new HomePage();
		signOnObj = new SignOnPage();
		registerObj = new RegisterPage();
		flightsObj = new FlightsPage();

	}

}
