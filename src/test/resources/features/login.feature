@login
Feature: Login Feature

  Background: User launches the app
    Given User launches the website on browser

  @login_01
  Scenario: Verify user can successfully login to the website
    Given User logs into the website with account 1
    Then user should land on logged in home page

  @login_02
  Scenario: Verify if a locked out user tries to login than an error should be dispalyed
    Given User logs into the website with account 2
    Then Error message for locked out user should be displayed