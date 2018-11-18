Feature: Validate Login Credential
Background: Given Open Browser 
And Navigate to Facebook Url
@Smoke 
Scenario: Login to profile page with valid credentials #note       

When User type UserId on user Id text box
And User type password on password box
And User click on login button 
Then User should be in profile page
@Regression
Scenario: Login  with invalid credentials

When User type invalid UserId on user Id text box
And User type invalid password on password box
And User click on login button 
Then User should not  be able to login profile page
@Intregration
Scenario: Verify log in button is enable
When User will check login button is enabled or not
Then Based on the result user should get return true or false.


