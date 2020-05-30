Feature: OrangeHRM Modules
@LoginSingleData
Scenario: Valiadate Login Module
When I open OrangeHRMS URL on chrome
And I enter username in  and password
When I click Login Button
Then Verify dash text contains in url
When I close the browser
@scenariowithDatatable
Scenario Outline: Login with multiple data
When I open OrangeHRMS URL on "<Browser>"
    And I enter "<UserName>" in usernameField
    And I enter "<Password>" in passwordField
    When clicking Login Button
    Then I Should verify dashboard in url
    When Closingbrowser
    Examples:
    |Browser|UserName|Password|
    |chrome|Admin|Qedge123!@#|
    |firefox|Admin1|Qedge123!@#|
    |chrome|Admin2|Qedge123!@#|
    |firefox|Admin|Qedge123!@#|
    |firefox|Admin|Qedge123!@#|
    |chrome|Admin|Qedge123!@#|