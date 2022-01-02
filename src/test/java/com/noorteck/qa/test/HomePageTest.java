package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class HomePageTest extends ObjInitialize{
	
	
	public static void main(String[] args) {
		
	
	String url = "http://demo.guru99.com/test/newtours/";
	
	CommonUI commonUIObj = new CommonUI();
	ObjInitialize obj = new ObjInitialize();
	HomePageTest testObj = new HomePageTest();
	
	commonUIObj.openBrowser("chrome");
	commonUIObj.navigate(url);
	
	obj.initializeClassObj();
	testObj.homePageTestOne();
	commonUIObj.quitBrowser();
	
	  
	}
	
	public void homePageTestOne() {
		
		homeObj.clickSignOn();
		signOnObj.enterUserName("tutorial");
		signOnObj.enterPassword("tutorial");
		signOnObj.clickSubmitButton();
		signOnObj.LoginSuccessfullyDisplayed();
		signOnObj.LoginThankYou();
		
		
	}

}
