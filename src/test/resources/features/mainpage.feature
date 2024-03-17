Feature: Search Functionality of the Google Search Engine

  As a user of the Google website
  I want to be able to search specific Website
  So that I can view the search result

  Background:
    Given I am on the Google Website

  Scenario Outline: Search for some website and Click the first link
    Given I have entered "<keyword>" in the search box
    When I click on the Search button
    Then I should see the expected "<first result>" to be first in the result

    Examples:
      | keyword        |  first result              |
      | github         |  https://github.com        |
      | amazon         |  https://www.amazon.com    |
      | stackoverflow  |  https://stackoverflow.com |
      | java           |  https://www.java.com      |

