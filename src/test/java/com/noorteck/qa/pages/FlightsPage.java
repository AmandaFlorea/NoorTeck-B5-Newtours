package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class FlightsPage extends CommonUI{
	
	
	// inspect elements and store values
	
	@FindBy(xpath = "//*[@value ='roundtrip']")
	WebElement roundtripRadio;
	
	@FindBy(xpath = "//*[@value ='oneway']")
	WebElement oneWayRadio; 
	
	@FindBy(xpath = "//*[@name = 'passCount']")
	WebElement passengersDropDown;
	
	@FindBy(xpath = "//*[@name = 'fromPort']")
	WebElement arrivingInDropDown;
	
	@FindBy(xpath = "//*[@name = 'fromMonth']")
	WebElement onMonthDropDown;
	
	@FindBy(xpath = "//*[@name= 'fromDay']")
	WebElement  onDayDropDown; 
	
	@FindBy(xpath = "//*[@name = 'toPort']")
	WebElement returnInDropDown;
	
	@FindBy(xpath = "//*[@name = 'toMonth']")
	WebElement returnMonthDropDown; 
	
	@FindBy (xpath = "//*[@name = 'toDay']")
	WebElement returnDayDropDown; 
	
	@FindBy(xpath = "//*[@value='Coach']")
	WebElement economyClassRadio;
	
	@FindBy(xpath = "//*[@value='Business']")
	WebElement buisnessClassRadio;
	
	@FindBy(xpath = "//*[@value='First']")
	WebElement firstClassRadio;
	
	@FindBy(xpath = "//*[@name='airline']")
	WebElement AirlineDropDown; 
	
	@FindBy(xpath = "//*[@name='findFlights'] ")
	WebElement continueButton;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]")
	WebElement flightFinderMessage; 
	
	
	// create class constructor 
	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}
	
	// create methods to interact
	
	public void clickRoundTripRadioButton() {
		click(roundtripRadio);
	}
	
	public void clickOneWayRadioButton() {
		click(oneWayRadio);
		
	}
	
	public void selectPassengerDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(passengersDropDown, methodName, indexTextValue);
		
	}

	public void selectArrivingInDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(arrivingInDropDown, methodName, indexTextValue);
	}
	
	public void selectMonthArriving(String methodName, String indexTextValue) {
		selectFromDropdown(onMonthDropDown, methodName, indexTextValue );
	}
	
	public void selectDayArriving(String methodName, String indexTextValue) {
		selectFromDropdown(onDayDropDown, methodName, indexTextValue);
	}
	
	public void selectReturnInDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(returnInDropDown, methodName, indexTextValue);
	}
	
	public void selectMonthReturn(String methodName, String indexTextValue) {
		selectFromDropdown(returnMonthDropDown, methodName, indexTextValue);
	}
	
	public void selectDayReturn(String methodName, String indexTextValue) {
		selectFromDropdown(returnDayDropDown, methodName, indexTextValue);
	}
	
	public void selectFirstClass() {
		click(firstClassRadio);
	}
	public void selectAirLine(String methodName, String indexTextValue) {
		selectFromDropdown(AirlineDropDown,methodName, indexTextValue);
	}
	public void clickContinue() {
		click(continueButton);
	}
	
	public void flightFinderMessage() {
		getText(flightFinderMessage);
	}
	

}
