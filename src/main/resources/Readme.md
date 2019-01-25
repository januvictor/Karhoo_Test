I have chosen Cucumber Java framework to execute this scenerio to verify the page navigation.
Implemented the solution using page factory as we can change the element locators alone to execute this program if any UI changes occur.
Have used dependency injection to pass the object whenever its needed.
Setup step will initialize system property and will launch the chrome driver
Teardown will quit all the windows once the test is completed
Runner clas generates the html report on the status of the test case
This project can be extendable to more scenerio for test suite.
