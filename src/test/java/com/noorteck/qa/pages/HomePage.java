package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{
	
	// inspect the elements and store the values
	@FindBy(linkText = "SIGN-ON")
	WebElement clickSignOnButton;
	
	@FindBy(xpath = "//*[@href='register.php']")
	WebElement clickRegisterButton;
	
	@FindBy(xpath = "//*[@href='reservation.php']")
	WebElement clickFlightsButton;
	
	// create the class constructor
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	// create the methods to interact
	public void clickSignOn() {
		click(clickSignOnButton);
	}
	
	public void clickRegister() {
		click(clickRegisterButton);
	}
	
	public void clickFlights() {
		click(clickFlightsButton);
	}

}
