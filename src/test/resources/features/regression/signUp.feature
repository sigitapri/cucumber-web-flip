@regression @signUp
Feature: Sign Up
  Scenario: sign up new account for sole proprietorship
    Given User login page
    When User click sign up
    And User input full name
    And User input email
    And User input nomor hp
    And User select business type sole proprietorship
    And User input password
    And User input business ID
    And User click button create account
    Then Verify register account success

  Scenario: sign up new account for business entity
    Given User login page
    When User click sign up
    And User input full name
    And User input email
    And User input nomor hp
    And User select business type business entity
    And User input busniness name
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
    And User select business type sole proprietorship
    And User input password
    And User input business ID
    And User click button create account
    Then Verify register account failed

  Scenario: sign up with invalid email format
    Given User login page
    When User click sign up
    And User input full name
    And User input invalid email format
    And User input nomor hp
    Then Verify message invalid email format and radio business type disable or not clickable

  Scenario: sign up with invalid password format
    Given User login page
    When User click sign up
    And User input full name
    And User input email
    And User input nomor hp
    And User select business type sole proprietorship
    And User input business ID
    And User input password less than 8 character
    And User click button create account
    And Verify messsage password required at least 8 char shown
    And User input invalid password format
    And User input business ID
    And User click button create account
    Then Verify alert error invalid password shown

  Scenario: sign up with business id more than 15 char
    Given User login page
    When User click sign up
    And User input full name
    And User input email
    And User input nomor hp
    And User select business type sole proprietorship
    And User input password
    And User input business ID more than 15 char
    And User click button create account
    Then Verify messsage ID required at least less than 15 character shown

