$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/File.feature");
formatter.feature({
  "name": "Jqueryui home page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "screenshot",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "i verify screenshot on page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.PageStepDefination.i_verify_screenshot_on_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it took screenshot page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.PageStepDefination.it_took_screenshot_page()"
});
formatter.result({
  "status": "passed"
});
});