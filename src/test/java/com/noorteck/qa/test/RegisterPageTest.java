package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class RegisterPageTest extends CommonUI{
	
	
	public static void main(String[] args) {
		
	
	String url = "http://demo.guru99.com/test/newtours/";
	
	CommonUI commonUIObj = new CommonUI();
	ObjInitialize obj  = new ObjInitialize();
	RegisterPageTest regTestObj = new RegisterPageTest();
	
	
	commonUIObj.openBrowser("chrome");
	commonUIObj.navigate(url);
	
	obj.initializeClassObj();
	
	regTestObj.registerTestCase2();
	commonUIObj.quitBrowser();
}
	
	public void registerTestCase2(){
		
		homeObj.clickRegister();
		registerObj.enterFirstName("Jane");
		registerObj.enterLastName("Doe");
		registerObj.enterPhoneNumber("123-456-1236");
		registerObj.enterEmail("janeDoe@gmail.com");
		registerObj.enterAddress("456 mulberry lane");
		registerObj.enterCity("Haymarket");
		registerObj.enterState("VA");
		registerObj.enterZipCode("22456");
		registerObj.selectCountry("El Salvador");
		registerObj.enterUserName("janeDoe@gmail.com");
		registerObj.enterPassword("password123");
		registerObj.enterConfirmPassword("password123");
		registerObj.clickSubmitButton();
		registerObj.verifyRegister();
		
		
	}
	
}