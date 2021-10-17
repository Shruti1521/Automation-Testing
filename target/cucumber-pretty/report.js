$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/realestate.feature");
formatter.feature({
  "name": "Automation Testing of Real Estate Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "bug-verify title field accepted more than 30 characters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "user select  title name on title field column",
  "keyword": "When "
});
formatter.step({
  "name": "user click on quick edit optin in title field",
  "keyword": "Then "
});
formatter.step({
  "name": "user enter the \"\u003ctitlename\u003e\" in title field",
  "keyword": "When "
});
formatter.step({
  "name": "user click of that update button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "titlename"
      ]
    },
    {
      "cells": [
        "jshfbneiururfbvbejwlehfbdhfh3rhu4ghewjh8463tryuegfhgfjvfhdvwuqgfhfhqwfuwe"
      ]
    }
  ]
});
formatter.background({
  "name": "Verify login functionality",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the my login page of real estate site",
  "keyword": "Given "
});
formatter.match({
  "location": "realestatedefinition.user_is_on_the_my_login_page_of_real_estate_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"mohankrishna176@gmail.com\" and \"Secret@123\u0026\u0026\"",
  "keyword": "When "
});
formatter.match({
  "location": "realestatedefinition.user_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "realestatedefinition.user_click_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "realestatedefinition.user_navigates_to_the_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on properties on the menu bar",
  "keyword": "When "
});
formatter.match({
  "location": "realestatedefinition.user_click_on_properties_on_the_menu_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on all properties",
  "keyword": "And "
});
formatter.match({
  "location": "realestatedefinition.user_click_on_all_properties()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User gets redirected to the all properties page",
  "keyword": "Then "
});
formatter.match({
  "location": "realestatedefinition.user_gets_redirected_to_the_all_properties_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "bug-verify title field accepted more than 30 characters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "user select  title name on title field column",
  "keyword": "When "
});
formatter.match({
  "location": "realestatedefinition.user_select_title_name_on_title_field_column()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on quick edit optin in title field",
  "keyword": "Then "
});
formatter.match({
  "location": "realestatedefinition.user_click_on_quick_edit_optin_in_title_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"jshfbneiururfbvbejwlehfbdhfh3rhu4ghewjh8463tryuegfhgfjvfhdvwuqgfhfhqwfuwe\" in title field",
  "keyword": "When "
});
formatter.match({
  "location": "realestatedefinition.user_enter_the_in_title_field(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.fail(Assert.java:96)\r\n\tat StepDefinition.realestatedefinition.user_enter_the_in_title_field(realestatedefinition.java:1463)\r\n\tat ✽.user enter the \"jshfbneiururfbvbejwlehfbdhfh3rhu4ghewjh8463tryuegfhgfjvfhdvwuqgfhfhqwfuwe\" in title field(file:src/test/java/Feature/realestate.feature:212)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click of that update button",
  "keyword": "Then "
});
formatter.match({
  "location": "realestatedefinition.user_click_of_that_update_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});