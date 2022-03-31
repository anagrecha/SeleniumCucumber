Feature: feature to test Login functionality

  Scenario: Check login is successful with valid credentials
  
    Given User is on login Page
    When User enters username and password
    And clicks on the login button
    Then user is navigated to the Home Page
    

    
