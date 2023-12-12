Feature: Search in Wikipedia from SWAPI

  Scenario Outline: Search in Wikipedia from SWAPI
    Given I am on SWAPI requesting a character id <number>
    When I search the name of that character on Wikipedia
    Then I get the article page for the requested character

    Examples: 
      |number| 
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |