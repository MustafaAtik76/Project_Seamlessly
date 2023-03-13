@wip
Feature: Login Functionality

  Background:
    Given user is on the login page


  @SEAMLESS10-84
  Scenario: Positive test case-1
    When user enters "Employee70" as username
    And user enters "Employee123" as password
    And user clicks login button
    Then user should login successfully

  @SEAMLESS10-85
  Scenario: Positive test case-2
    When user enters "Employee70" as username
    And user enters "Employee123" as password
    And user clicks Enter Key
    Then user should login successfully



  @SEAMLESS10-86
  Scenario:
    When user enters "Patron" as username
    And user enters "Employee123" as password
    And user clicks login button
    Then Wrong username or password Message Displayed

  @SEAMLESS10-87
  Scenario:
    When user enters "Employee70" as username
    And user enters "Patron123" as invalidPassword
    And user clicks login button
    Then Wrong username or password Message Displayed


  @SEAMLESS10-88
  Scenario:
    When user enters "Patron" as username
    And user enters "Patron123" as invalidPassword
    And user clicks login button
    Then Wrong username or password Message Displayed

@SEAMLESS10-89
  Scenario:
    When user enters "Employee70" as username
    And user enters "" as no password
    And user clicks login button
    Then Please Fill Out Password Field Displayed

  @SEAMLESS10-90
  Scenario: Negative Test (blank credentials)
    When user enters "" as no username
    And user enters "Employee123" as password
    And user clicks login button
    Then Please Fill Out UserName Field Displayed

  @SEAMLESS10-91
  Scenario: Negative Test (blank credentials)
    When user enters "" as no username
    And user enters "" as password
    And user clicks login button
    Then Please Fill Out UserName Field Displayed



  @SEAMLESS10-117
  Scenario:
    When user enters "Employee123" as password
    Then password type is dotForm By Default

  @SEAMLESS10-118
  Scenario:
    When user enters "Employee123" as password
    And user clicks eye icon
    Then password is visible


  @SEAMLESS10-119
  Scenario:
    When user enters "Employee70" as username
    And user enters "Employee123" as password
    And user clicks login button
    And user Clicks Forgot Password Button
    Then reset Password Button Is Displayed

  @SEAMLESS10-120
  Scenario:
    Then user Can See userName Placeholder
    Then user can see password placeholder