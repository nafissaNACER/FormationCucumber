@Test_outline
Feature: Searching in google

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
