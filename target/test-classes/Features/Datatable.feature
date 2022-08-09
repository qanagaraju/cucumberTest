Feature: Login App

#TDD frame work

Scenario Outline: verify  login
Given user start home page
When user insert "<username>" and "<password>"
Then user click submit button
Then user click signout button
Then user close browser

Examples:
|username|password|
|tester1|admin1|
|tester2|admin1|
|tester3|admin1|
|tester4|admin1|
|qatrainer|admin123|