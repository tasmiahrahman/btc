Feature: Login validation
Scenario Outline: login Credintial# multipal sets of scenario


Given open Browser
And Navigate to Facebook Url
When User type "<UserId>" on user Id text box# multipal sets of value
And User type "<password>" on password box# multipal sets of value
And User click on login button 
Then User should be in profile page

Examples:
|UserId|password|
|User1|moh123|
|User2|nafe56|



