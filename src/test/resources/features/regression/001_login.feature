@regression @login
Feature: Login
  Scenario: User login with account
    Given Login logo is displayed
    When User input registered username
    And User input valid password
    And User click login button
    Then Verify success login