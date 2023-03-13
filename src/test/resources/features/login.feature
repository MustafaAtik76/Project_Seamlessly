Feature: Login Functionality

AC1-User can login with valid credentials (either clicking on the "Login button" or hitting the "Enter" key from the keyboard as the last step)

(TC1): Verify that user can login with valid credentials (clicking on the "Login button") 


  @SEAMLESS10-357
  Scenario: Positive test case-1
  Given user is on the login page
    When user enters "Employee70" as username
        And user enters "Employee123" as password
    And user clicks login button
    Then user should login successfully

    @SEAMLESS10-358
    Scenario: Positive test case-2
    Given user is on the login page
    When user enters "Employee70" as username
    And user enters "Employee123" as password
    And user clicks Enter Key
    Then user should login successfully

    @SEAMLESS10-359
    Scenario Outline: Negative wrong credentials
    Given user is on the login page
    When user enters "<username>" to username field
    And user enters "<password>" to password field
    And user clicks login button
    Then Wrong username or password Message Displayed
    Examples:
    | username | password |
    | Patron | Employee123|
    |Employee70| Patron123|
    |Patron|Patron123|

    @SEAMLESS10-89 @wip
    Scenario: Negative blank credentials
    Given user is on the login page
     When user leave blank "<username>" to username field
    And user leave blank "<password>" to password field
    And user clicks login button
    Then Please Fill Out Password Field Displayed
 Examples:
    | username | password   |
    |           |Employee123|
    |Employee70|            |
    |           |           |