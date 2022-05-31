$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature%20Files/login.feature");
formatter.feature({
  "name": "To validate the login functionality of the page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@loginfeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Check whether user able to sign in with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@dummy"
    }
  ]
});
formatter.step({
  "name": "User should click sign in button and type valid username \u003c\"username\"\u003e and invalid password \u003c\"password\"\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User should click sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "User should navigate to invalid credential page and close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Ganesh@gmail.com",
        "ganes@1278934"
      ]
    },
    {
      "cells": [
        "ganeshv5032@gmail.com",
        "Leo@daa12345"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Check whether user able to sign in with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@loginfeature"
    },
    {
      "name": "@dummy"
    }
  ]
});
formatter.step({
  "name": "User should click sign in button and type valid username \u003c\"username\"\u003e and invalid password \u003c\"password\"\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_should_click_sign_in_button_and_type_valid_username_and_invalid_password(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//iframe[@title\u003d\u0027Universal login\u0027]\"}\n  (Session info: chrome\u003d101.0.4951.67)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.1\u0027, revision: \u0027e8fcc2cecf\u0027\nSystem info: host: \u0027DESKTOP-8BF6FE7\u0027, ip: \u0027192.168.1.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [9ca3d29227260103ed5569ce36d139a5, findElement {using\u003dxpath, value\u003d//iframe[@title\u003d\u0027Universal login\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.67, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\Homeeee\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:56514}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:56514/devtoo..., se:cdpVersion: 101.0.4951.67, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9ca3d29227260103ed5569ce36d139a5\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat org.stepdefinition.LoginPage.user_should_click_sign_in_button_and_type_valid_username_and_invalid_password(LoginPage.java:99)\r\n\tat ✽.User should click sign in button and type valid username \u003c\"username\"\u003e and invalid password \u003c\"password\"\u003e(file:src/test/resources/Feature%20Files/login.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_should_click_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should navigate to invalid credential page and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_should_navigate_to_invalid_credential_page_and_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "Check whether user able to sign in with valid username and invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@loginfeature"
    },
    {
      "name": "@dummy"
    }
  ]
});
formatter.step({
  "name": "User should click sign in button and type valid username \u003c\"username\"\u003e and invalid password \u003c\"password\"\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_should_click_sign_in_button_and_type_valid_username_and_invalid_password(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//iframe[@title\u003d\u0027Universal login\u0027]\"}\n  (Session info: chrome\u003d101.0.4951.67)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.1\u0027, revision: \u0027e8fcc2cecf\u0027\nSystem info: host: \u0027DESKTOP-8BF6FE7\u0027, ip: \u0027192.168.1.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [2676c629bd0d5a856b6f4947abfef48c, findElement {using\u003dxpath, value\u003d//iframe[@title\u003d\u0027Universal login\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.67, chrome: {chromedriverVersion: 101.0.4951.41 (93c720db8323..., userDataDir: C:\\Users\\Homeeee\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:56574}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:56574/devtoo..., se:cdpVersion: 101.0.4951.67, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2676c629bd0d5a856b6f4947abfef48c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat org.stepdefinition.LoginPage.user_should_click_sign_in_button_and_type_valid_username_and_invalid_password(LoginPage.java:99)\r\n\tat ✽.User should click sign in button and type valid username \u003c\"username\"\u003e and invalid password \u003c\"password\"\u003e(file:src/test/resources/Feature%20Files/login.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User should click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_should_click_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should navigate to invalid credential page and close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_should_navigate_to_invalid_credential_page_and_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
