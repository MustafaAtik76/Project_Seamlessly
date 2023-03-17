@wip
Feature: Logout Functionality

  Background:
    Given user is on the login page
    Given user enters "Employee70" as username
    Given user enters "Employee123" as password
    Given user clicks login button
    Given user should login successfully

  @SEAMLES- @wip
  Scenario:
    When clicks avatar icon
    And user clicks logout link
    Then verify user is on the login page

  @SEAMLES- @wip
  Scenario:
    When clicks avatar icon
    And user clicks logout link
    And user trys navigating back
    Then verify user is on the login page