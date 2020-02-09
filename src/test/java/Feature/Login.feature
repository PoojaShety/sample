Feature: Login to Leaftaps Application
Background:
Given Open the Chrome Browser
And Maximize the Browser
And Load the URL
And set the timeouts


Scenario Outline: TC001 Positive flow for login
And Enter the Username as <Username>
And Enter the password as <Password>
And Click on the Login Button
And Click CRM/SFA
And Click Create lead
And Enter Company Name as <Company Name>
And Enter First Name as <Fname>
And Enter Last Name as <Lname>
When Click on Create Lead
Then Verify the Create Lead 
 
 


Examples:
|Username|Password|Company Name|Fname|Lname|
|Demosalesmanager|crmsfa|hpe|Pooja|s|
|DemoCSR|crmsfa|mindtree|sharmila|m|




