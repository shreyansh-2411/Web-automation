@tag
Feature: This is a feature to understand windows and how to work with them

  Background: User launches the app
    Given User launches the website on browser

  @windows_01
  Scenario: working with windows in selenium
    Given User logs into the website with account 1
    Then user should land on logged in home page
    Given working with windows in selenium