@regression @signUp
Feature: Sign Up
  Scenario: sign up new account
    Given User login page
    When User click sign up
    And User input full name
    And User input email
    And User input nomor hp
    And User select business type
    And User input password
    And User input business ID
    And User click button create account
    Then Verify register account success

  Scenario: sign up with registered email
    Given User login page
    When User click sign up
    And User input full name
    And User input registered email
    And User input nomor hp
    And User select business type
    And User input password
    And User input business ID
    And User click button create account
    Then Verify register account failed
