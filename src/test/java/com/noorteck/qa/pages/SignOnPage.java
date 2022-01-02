package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignOnPage extends CommonUI{
	
	// inspect elements and store values
	@FindBy(name = "userName")
	WebElement usernameField;
	
	@FindBy(name = "password")
	WebElement passwordField; 
	
	@FindBy(name = "submit")
	WebElement submitButton; 
	
	@FindBy(linkText = "Login Successfully")
	WebElement loginSuccessful; 
	
	
	@FindBy(linkText = " Thank you for Loggin. ")
	WebElement thankyouMessage;
	
	
	// create class constructor
	public SignOnPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	// create methods to interact
	
	public void enterUserName(String username) {
		enter(usernameField, username);
		
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void clickSubmitButton() {
		click(submitButton);
	}
	
	public void LoginSuccessfullyDisplayed() {
		isDisplayed(loginSuccessful);
	}
	
	public void LoginThankYou() {
		isDisplayed(thankyouMessage);
	}
	

}
