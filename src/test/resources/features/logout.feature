@wip @SEAMLES10-455
Feature: Logout Functionality

  Background:
    Given user is on the login page
    Given user enters "Employee70" as username
    Given user enters "Employee123" as password
    Given user clicks login button
    Given user should login successfully

  @SEAMLES10-456 @wip
  Scenario: User can logout
    When clicks avatar icon
    And user clicks logout link
    Then verify user is on the login page

  @SEAMLES10-457 @wip
  Scenario:User can not go to home page again by clicking step back button
    When clicks avatar icon
    And user clicks logout link
    And user trys navigating back
    Then verify user is on the login page