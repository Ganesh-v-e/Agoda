$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature%20Files/home.feature");
formatter.feature({
  "name": "To validate the functionality of the Agoda Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@home"
    }
  ]
});
formatter.scenario({
  "name": "Check whether the Flights button is present also verify if it redirecting to the respective page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@home"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeStepDefinition.user_launches_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should verify the Flights button",
  "keyword": "When "
});
formatter.match({
  "location": "HomeStepDefinition.user_Should_verify_the_Flights_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the Flights button",
  "keyword": "And "
});
formatter.match({
  "location": "HomeStepDefinition.user_should_click_the_Flights_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to the Flights page and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStepDefinition.user_should_navigate_to_the_Flights_page_and_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});