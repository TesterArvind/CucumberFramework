$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Admin/git/CucumberFramework/ClarivateAnalyticsCucumberFramework/src/main/java/com/qa/features/calci.feature");
formatter.feature({
  "line": 1,
  "name": "Calculator Square Root Feature",
  "description": "",
  "id": "calculator-square-root-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Square root of given number.",
  "description": "",
  "id": "calculator-square-root-feature;validate-square-root-of-given-number.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open windows calculator app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter \"65575\"  value",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks square root button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate result is \"Display is 256.076160546\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CalciSteps.open_windows_calculator_app()"
});
formatter.result({
  "duration": 3041058700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "65575",
      "offset": 7
    }
  ],
  "location": "CalciSteps.enter_value(String)"
});
formatter.result({
  "duration": 10825846600,
  "status": "passed"
});
formatter.match({
  "location": "CalciSteps.user_clicks_square_root_button()"
});
formatter.result({
  "duration": 865018500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Display is 256.076160546",
      "offset": 20
    }
  ],
  "location": "CalciSteps.validate_result_is(String)"
});
formatter.result({
  "duration": 274961000,
  "status": "passed"
});
});