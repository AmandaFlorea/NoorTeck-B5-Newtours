Feature: Newtour feature pages

  Scenario: User able to login with correct credentials
    Given User is on login page
    When User enters username
    And User enters password
    And User Clicks sumbit button
    Then User recieves Login Successful

    
    Scenario: User is able to Register information
    Given User is on Register Page
    When User enters Personal Information in all fields
    And User Clicks on Submit Button
    Then User Recieves Registration Verified
    
    Scenario: User is Able to choose flight
    Given User is on Flights Page
    When User is able to enter flight details
    And User is able to Click continue
    Then User Recieves Flight Finder Message