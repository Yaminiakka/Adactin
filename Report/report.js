$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactinproject.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality for adactin application",
  "description": "",
  "id": "login-functionality-for-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Sucessfull login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;sucessfull-login-into-the-adactin-application-with-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enter \"\u003cusername\u003e\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enter \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "login-functionality-for-adactin-application;sucessfull-login-into-the-adactin-application-with-valid-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "login-functionality-for-adactin-application;sucessfull-login-into-the-adactin-application-with-valid-credential;;1"
    },
    {
      "cells": [
        "aarthyrajeev",
        "abc123"
      ],
      "line": 19,
      "id": "login-functionality-for-adactin-application;sucessfull-login-into-the-adactin-application-with-valid-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 203620,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"tamlmani\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter \"8B4J34\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_stepDefinition.user_enter_application_url()"
});
formatter.result({
  "duration": 3884701311,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tamlmani",
      "offset": 12
    }
  ],
  "location": "ILogin_stepDefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 154217237,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8B4J34",
      "offset": 12
    }
  ],
  "location": "ILogin_stepDefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 98854308,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_stepDefinition.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 1410033138,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Sucessfull login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;sucessfull-login-into-the-adactin-application-with-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user enter \"aarthyrajeev\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user enter \"abc123\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_stepDefinition.user_enter_application_url()"
});
formatter.result({
  "duration": 558664777,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aarthyrajeev",
      "offset": 12
    }
  ],
  "location": "ILogin_stepDefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 109749219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 12
    }
  ],
  "location": "ILogin_stepDefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 86366151,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_stepDefinition.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 961353220,
  "status": "passed"
});
formatter.after({
  "duration": 193357,
  "status": "passed"
});
formatter.before({
  "duration": 92778,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"tamlmani\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter \"8B4J34\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_stepDefinition.user_enter_application_url()"
});
formatter.result({
  "duration": 767152536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tamlmani",
      "offset": 12
    }
  ],
  "location": "ILogin_stepDefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 105823783,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8B4J34",
      "offset": 12
    }
  ],
  "location": "ILogin_stepDefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 128270033,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_stepDefinition.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 1155335505,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "sucessful search into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;sucessful-search-into-the-adactin-application-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Searchhotel"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user select the location",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user select the hotels",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user select roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user select roomno",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user click submitbutton",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user click select radio button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user click contiue button",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "user enter firstname",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user enter lastname",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user enter address",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user enter creditcardno",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user enter creditcardtype",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user enter expmon ofcreditcard",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user enter expyear ofcreditcard",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user enter cvv",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user enter booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user click logout in the paymentpage",
  "keyword": "Then "
});
formatter.match({
  "location": "JSearch_stepDefinition.user_select_the_location()"
});
formatter.result({
  "duration": 3240026307,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_stepDefinition.user_select_the_hotels()"
});
formatter.result({
  "duration": 149217047,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_stepDefinition.user_select_roomtype()"
});
formatter.result({
  "duration": 152860042,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_stepDefinition.user_select_roomno()"
});
formatter.result({
  "duration": 129229019,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_stepDefinition.user_click_submitbutton()"
});
formatter.result({
  "duration": 1842802766,
  "status": "passed"
});
formatter.match({
  "location": "KConfirmation_stepDefinition.user_click_select_radio_button()"
});
formatter.result({
  "duration": 98736898,
  "status": "passed"
});
formatter.match({
  "location": "KConfirmation_stepDefinition.user_click_contiue_button()"
});
formatter.result({
  "duration": 3248194102,
  "status": "passed"
});
formatter.match({
  "location": "LPaymentstepDefinition.user_enter_firstname()"
});
formatter.result({
  "duration": 170376714,
  "status": "passed"
});
formatter.match({
  "location": "LPaymentstepDefinition.user_enter_lastname()"
});
formatter.result({
  "duration": 72791337,
  "status": "passed"
});
formatter.match({
  "location": "LPaymentstepDefinition.user_enter_address()"
});
formatter.result({
  "duration": 95987615,
  "status": "passed"
});
formatter.match({
  "location": "LPaymentstepDefinition.user_enter_creditcardno()"
});
formatter.result({
  "duration": 151098892,
  "status": "passed"
});
formatter.match({
  "location": "LPaymentstepDefinition.user_enter_creditcardtype()"
});
formatter.result({
  "duration": 123597442,
  "status": "passed"
});
formatter.match({
  "location": "LPaymentstepDefinition.user_enter_expmon_ofcreditcard()"
});
formatter.result({
  "duration": 116305296,
  "status": "passed"
});
formatter.match({
  "location": "LPaymentstepDefinition.user_enter_expyear_ofcreditcard()"
});
formatter.result({
  "duration": 127230996,
  "status": "passed"
});
formatter.match({
  "location": "LPaymentstepDefinition.user_enter_cvv()"
});
formatter.result({
  "duration": 82502706,
  "status": "passed"
});
formatter.match({
  "location": "LPaymentstepDefinition.user_enter_booknow_button()"
});
formatter.result({
  "duration": 6079046910,
  "status": "passed"
});
formatter.match({
  "location": "LPaymentstepDefinition.user_click_logout_in_the_paymentpage()"
});
formatter.result({
  "duration": 1236037239,
  "status": "passed"
});
formatter.after({
  "duration": 114536,
  "status": "passed"
});
});