
Feature: Login Functionality

AC1-User can login with valid credentials (either clicking on the "Login button" or hitting the "Enter" key from the keyboard as the last step)

(TC1): Verify that user can login with valid credentials (clicking on the "Login button") 


  @SEAMLESS10-357 @wip
  Scenario: Positive test case-1
  Given user is on the login page
    When user enters "username" as username
    And user enters "password" as password
    And user clicks login button
    Then user should login successfully