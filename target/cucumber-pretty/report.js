$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/realestate.feature");
formatter.feature({
  "name": "Automation Testing of Real Estate Website",
  "description": "",
  "keyword": "Feature"
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
  "name": "User enter \"admin\" and \"admin@123\"",
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
  "name": "verify the Sorting functionality in title field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag12"
    }
  ]
});
formatter.step({
  "name": "user click on the arrow of the title field",
  "keyword": "When "
});
formatter.match({
  "location": "realestatedefinition.user_click_on_the_arrow_of_the_title_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able to see the in title field all tiltle name arrange in sorting order",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user click the arrow of the date field",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user able to see all dates arrange in sorting order",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});