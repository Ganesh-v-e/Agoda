@runnow
Feature: To validate the functionality of the home buttons
Scenario: Check whether the country flag is available and also verify whether user to select their language when the country flag is clicked
Given User launches the browser
When User verify the country flag
And  User click the country flag and select their country flag
Then User should navigate to the Home Page with selected country flag and close the browser

