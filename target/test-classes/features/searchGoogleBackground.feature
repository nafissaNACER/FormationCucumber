@Test_Background
Feature: Searching in google

  Background: init
    Given lanch Broweser
    When maximise my browzer
    Then print hello massage

  Scenario: Finding Selenium Tutorials
    Given I am on the Google search page
    When I search for "Autom"
    Then the page title should start with "autom"
    And number of result equal to 30
    And result equal 23

  Scenario Outline: Searching in google
    Given I am on the Google search page
    When I search for "<search_word>"
    Then the page title should start with "<verif_search_word>"
    And number of result equal to 10
    And result equal 23

    Examples:
      | search_word | verif_search_word |
      | Selenium    | selenium          |
      | Grid        | grid              |
      | Smile       | smile             |
      | Smile       | smile             |