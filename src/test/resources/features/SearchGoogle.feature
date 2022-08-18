@BACBPI-25
Feature: Searching in google

  Scenario: Finding Selenium Tutorials
    Given I am on the Google search page
    When I search for "Selenium"
    Then the page title should start with "selenium"
    And number of result equal to 30
    And result equal 23