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
	
	@FindBy(xpath = "//*[@name= 'fromDay'")
	WebElement  onDayDropDown; 
	
	@FindBy(xpath = "//*[@name = 'toPort']")
	WebElement returnInDropDown;
	
	@FindBy(xpath = "//*[@name = 'toMonth'")
	WebElement returnMonthDropDown; 
	
	@FindBy (xpath = "//*[@name = 'toDay'")
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
	
	@FindBy(linkText = "        After flight finder - No Seats Avaialble  ")
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
	
	public void selectPassengerDropDown(String numPassenger) {
		selectFromDropdown(passengersDropDown, "value", numPassenger);
		
	}

	public void selectArrivingInDropDown(String arrivingDes) {
		selectFromDropdown(arrivingInDropDown, "text", "arrivingDes");
	}
	
	public void selectMonthArriving(String arriveMonth) {
		selectFromDropdown(onMonthDropDown, "value", arriveMonth);
	}
	
	public void selectDayArriving(String arriveDay) {
		selectFromDropdown(onDayDropDown, "value", arriveDay);
	}
	
	public void selectReturnInDropDown(String returnDes) {
		selectFromDropdown(returnInDropDown, "text", returnDes);
	}
	
	public void selectMonthReturn(String returnMonth) {
		selectFromDropdown(returnMonthDropDown, "value", returnMonth);
	}
	
	public void selectDayReturn(String returnDay) {
		selectFromDropdown(returnDayDropDown, "value", returnDay);
	}
	
	public void selectFirstClass() {
		click(firstClassRadio);
	}
	public void selectAirLine(String airLine) {
		selectFromDropdown(AirlineDropDown, "text", airLine);
	}
	public void clickContinue() {
		click(continueButton);
	}
	
	public void flightFinderMessage() {
		isDisplayed(flightFinderMessage);
	}
	

}
