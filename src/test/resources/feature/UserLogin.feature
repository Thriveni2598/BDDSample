Feature: User Login Functionality

#Scenario: Valid Login
#Given User is on login Page
#When User enters credentials
#Then Should display home page

#Scenario: Invalid Login
#Given User is on login  page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display home page

#Scenario Outline: Valid Login
#Given User is on login page
#When User enters "<username>" and "<password>"
#Then Should display home page

#Examples:
 #| username | password |
 #| tomsmith | SuperSecretPassword!|
 #| tomsmith1| SuperSecretPassword!|
 #| tomsmith2| SuperSecretPassword!|
 
Scenario: Valid Login
Given: User is on login Page
When User enters credentials
 | tosmith | SuperSecretPassword!|
Then Should display home page
 |You logged into a secure area! x|