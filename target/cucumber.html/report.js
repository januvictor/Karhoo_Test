$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Karhoo.feature");
formatter.feature({
  "line": 1,
  "name": "Test case to navigate to vacancies",
  "description": "This feature tests the navigation from the home page to vacancies page",
  "id": "test-case-to-navigate-to-vacancies",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11034032277,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Navigating to bamboohr vacancies from Homepage",
  "description": "",
  "id": "test-case-to-navigate-to-vacancies;navigating-to-bamboohr-vacancies-from-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "The URL in QA Test Environment",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Navigates from the homepage to the Karhoo team pagee",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Clicks the apply buttons",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Checks that you are on the bamboohr vacancies pages",
  "keyword": "Then "
});
formatter.match({
  "location": "KarhooSteps.theURLInQATestEnvironment()"
});
formatter.result({
  "duration": 15093410323,
  "status": "passed"
});
formatter.match({
  "location": "KarhooSteps.navigatesFromTheHomepageToTheKarhooTeamPagee()"
});
formatter.result({
  "duration": 3349135862,
  "status": "passed"
});
formatter.match({
  "location": "KarhooSteps.clicksTheApplyButtons()"
});
formatter.result({
  "duration": 485808516,
  "status": "passed"
});
formatter.match({
  "location": "KarhooSteps.checksThatYouAreOnTheBamboohrVacanciesPages()"
});
formatter.result({
  "duration": 4981127202,
  "status": "passed"
});
formatter.after({
  "duration": 1458838518,
  "status": "passed"
});
});