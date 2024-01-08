@Feature1
Feature: To Validate The Login Functionality of FaceBook Application

Background:
Given To Launch The Chrome Browser and Maximise Window
When to launch the url of facebookapplication

@Regression
Scenario: TO Validate The Login with Valid Username and Invalid Password
And To Pass The valid Username In Email Field
And To Pass The Valid Password In Password Feild 
And To click The Login button
And To check wheather navigate to the login page or not 
Then To close the browser

@Smoke
Scenario Outline: to validate the positive and negative combination of functionality
And to pass the email "<emailfeild>" in the email feild 
And to pass the password "<passwordfield>" in the password feild
And to click the login button 
Then user to close the browser

Examples:
|emailfeild            |passwordfield|
|subithr@gmail.com     |12135        |
|pavit@gmail.com       |pavi         |
|shri@gmail.com        |shrimn       |
|tamil@gmail.com       |tamil        |
|dharsh@gmail.com      |dharsh       | 
|raji@gmail.com        |raji         |


