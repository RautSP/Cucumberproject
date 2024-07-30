 Feature: Login Test Cases

  Background: 
    Given user login in  "https://debugautomation.com/" website

  Scenario: Login with correct Username and Password
    When User insert Username  "testuser" and Password "testpassword"
    And user click on submit button
    Then user will verify homepage


