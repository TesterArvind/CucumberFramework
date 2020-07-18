$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/search.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search Test",
  "description": "",
  "id": "google-search-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Google Search result for Clarivate Analytics Input Test",
  "description": "",
  "id": "google-search-test;validate-google-search-result-for-clarivate-analytics-input-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on google home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Clarivate Analytics\" search box",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "\"clarivate.com\" should be the first searched result",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSearchSteps.user_opens_browser()"
});
formatter.result({
  "duration": 10438011900,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.user_is_on_google_home_page()"
});
formatter.result({
  "duration": 77855800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Clarivate Analytics",
      "offset": 13
    }
  ],
  "location": "GoogleSearchSteps.user_enters_search_box(String)"
});
formatter.result({
  "duration": 3301437200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "clarivate.com",
      "offset": 1
    }
  ],
  "location": "GoogleSearchSteps.should_be_the_first_search_result(String)"
});
formatter.result({
  "duration": 53642500,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.close_browser()"
});
formatter.result({
  "duration": 4159666100,
  "status": "passed"
});
});