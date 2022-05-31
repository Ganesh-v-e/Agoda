@loginfeature
Feature: To validate the login functionality of the page

  Background: 
    Given User launches the browser
@dummy
  Scenario Outline: Check whether user able to sign in with valid username and invalid password
    When User should click sign in button and type valid username <"username"> and invalid password <"password">
    And User should click sign in button
    Then User should navigate to invalid credential page and close the browser

    Examples: 
      | username              | password      |
      | Ganesh@gmail.com      | ganes@1278934 |
      | ganeshv5032@gmail.com | Leo@daa12345  |

  Scenario: Check whether user able to sign in with ivalid username and invalid password
    When User should click sign in button and type ivalid username and ivalid password
      | kjbbbskfdb@yahoo.com | sbhfues@124   |
      | Ganesh@gmail.com     | ganes@1278934 |
      | Leodavin@yahoo.com   | Leo@daa12345  |
    And User should click sign in button
    Then User should navigate to Invalid credential page and close the browser

  @smokevalid
  Scenario: Check whether user able to sign in with valid username and valid password
    When User should click sign in button and type valid username and valid password
      | username              | password       |
      | Ganesh@gmail.com      | ganes@1278934  |
      | ganeshv5032@gmail.com | Leodavinci@123 |
    And User should click sign in button
    Then User should navigate to home page and close the browser
