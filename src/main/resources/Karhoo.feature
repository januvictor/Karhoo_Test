Feature: Test case to navigate to vacancies
  This feature tests the navigation from the home page to vacancies page
  Scenario: Navigating to bamboohr vacancies from Homepage

    Given The URL in QA Test Environment
    When Navigates from the homepage to the Karhoo team pagee
    And Clicks the apply buttons
    Then Checks that you are on the bamboohr vacancies pages
