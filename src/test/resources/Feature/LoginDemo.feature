Feature: Test Login functionality

  Scenario Outline: Login is successful
    Given Browser is open for test
    And User is in login page
    When User enters <username> and <password>
    And User clicks on Login button
    Then User is navigated to the Home Page

    Examples: 
      | username | password |
      | Aditi    |    12345 |
      | Aanya    |    12345 |
