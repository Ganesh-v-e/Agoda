@home
Feature: To validate the functionality of the Agoda Page

  Scenario: Check whether the URL is ridirecting to the home page
    Given User launches the browser
    Then User should navigate to the home page and close the browser

  Scenario: Check whether the name agoda is present with logo at top left corner of the page
    Given User launches the browser
    When User should verify the logo
    Then User should navigate to the home page and close the browser

  Scenario: Check whether the Flight + Hotel button is present also verify if it redirecting to the respective page
    Given User launches the browser
    When User Should verify the Flight + Hotel button
    And User should click the Flight + Hotel button
    Then User should navigate to the Flight + Hotel page and close the browser

  Scenario: Check whether the Hotels & Homes button is present also verify if it redirecting to the respective page
    Given User launches the browser
    When User Should verify the Hotels & Homes button
    And User should click the Hotels & Homes button
    Then User should navigate to the Hotels & Homes page and close the browser

  Scenario: Check whether the Flights button is present also verify if it redirecting to the respective page
    Given User launches the browser
    When User Should verify the Flights button
    And User should click the Flights button
    Then User should navigate to the Flights page and close the browser

  Scenario: Check whether the Todays deals button is present also verify if it redirecting to the respective page
    Given User launches the browser
    When User Should verify the Todays deals button
    And User should click the Todays deals button
    Then User should navigate to the Todays deals page and close the browser

  @run
  Scenario: Check whether the Apartments button is present also verify if it redirecting to the respective page
    Given User launches the browser
    When User Should verify the Apartments button
    And User should click the Apartments button
    Then User should navigate to the Apartments page and close the browser

  @run1
  Scenario: Check whether the Activities button is present also verify if it redirecting to the respective page
    Given User launches the browser
    When User Should verify the Activities button
    And User should click the Activities button
    Then User should navigate to the Activities page and close the browser
