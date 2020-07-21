$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/calci.feature");
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
  "name": "Open windows calculator application",
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
  "name": "validate the result \"256.0761605460376\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CalciSteps.open_windows_calculator_application()"
});
formatter.result({
  "duration": 3132244000,
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
  "duration": 5557129200,
  "status": "passed"
});
formatter.match({
  "location": "CalciSteps.user_clicks_square_root_button()"
});
formatter.result({
  "duration": 747007400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "256.0761605460376",
      "offset": 21
    }
  ],
  "location": "CalciSteps.validate_the_result(String)"
});
formatter.result({
  "duration": 430785300,
  "status": "passed"
});
});