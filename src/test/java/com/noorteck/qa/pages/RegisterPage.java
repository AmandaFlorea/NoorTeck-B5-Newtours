package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI {
	
	
	@FindBy(name = "firstName")
	WebElement firstNameField; 
	
	@FindBy(name = "lastName")
	WebElement lastNameField;
	
	@FindBy(name = "phone")
	WebElement phoneNumberField; 
	
	@FindBy(id = "userName")
	WebElement emailField;
	
	@FindBy(name = "address1")
	WebElement addressField;
	
	@FindBy(name = "city")
	WebElement cityField;
	
	@FindBy(name = "state")
	WebElement stateField;
	
	@FindBy(name = "postalCode")
	WebElement postalCodeField;
	
	@FindBy(name = "country")
	WebElement countryDropDown;
	
	@FindBy(id = "email")
	WebElement userNameField;
	
	@FindBy(name = "password")
	WebElement passwordField;
	
	@FindBy(name = "confirmPassword")
	WebElement confirmPasswordField;
	
	@FindBy(name = "submit")
	WebElement submitButton;
	
	@FindBy(xpath = "//*[@href='login.php']")
	WebElement registerThankYouMessage;
	
	// page class constructor
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	// create methods for interaction
	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}
	
	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	}
	
	public void enterPhoneNumber(String phoneNumber) {
		enter(phoneNumberField, phoneNumber);
	}
	
	public void enterEmail(String email) {
		enter(emailField, email);
	}
	
	public void enterAddress(String address) {
		enter(addressField, address);
	}
	
	public void enterCity(String city) {
		enter(cityField, city);
		
	}
	
	public void enterState(String state) {
		enter(stateField, state);
	}
	
	public void enterZipCode(String zipcode) {
		enter(postalCodeField, zipcode);
	}
	
	public void selectCountry(String country) {
		selectFromDropdown(countryDropDown, "text",country);
		
	}
	
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		enter(confirmPasswordField, confirmPassword );
	}
	
	public void clickSubmitButton() {
		click(submitButton);
	}
	
	public void verifyRegister() {
		isDisplayed(registerThankYouMessage);
	}
	

}
