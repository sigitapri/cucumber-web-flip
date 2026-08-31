@regression @addToCart
Feature: Add to cart
  Background:
    Given Login logo is displayed
    And User input registered username
    And User input valid password
    When User click login button
    Then Verify success login

  Scenario: Add to cart sauce labs backpack
    Given User on homepage
    And User click item sauce labs backpack
    And User click button add to cart
    When User open cart container
    Then User verify item added to cart

  Scenario: Add to cart sauce labs backpack and tshiert
    Given User on homepage
    And User click add to cart multiple item
    And User click button add to cart
    Then User verify count item added to cart

  Scenario: Add to cart sauce labs fleece jacket
    Given User on homepage
    And User click item sauce labs fleece jacket
    And User click button add to cart
    When User open cart container
    Then User verify item added to cart

  Scenario: Add to cart sauce labs backpack
    Given User on homepage
    And User click item sauce labs backpack
    And User click button add to cart
    When User open cart container
    Then User verify item added to cart


