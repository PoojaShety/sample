Feature: Delete Create lead

Background: 
Given Open the Chrome Browser
And Maximize the Browser
And Load the URL
And set the timeouts

Scenario Outline:
And Enter the Username as <Username>
And Enter the password as <Password>
And Click on the Login Button
And Click CRM/SFA
And Click on Leads 
And Click on Find Leads
And Click on Phone option in Find Leads page
And Search the phone number as <Phoneno>
And Click on the Find Leads Button
And Click on the Lead id
When Click on the Delete Button
Then verify lead is deleted


Examples:
|Username|Password|Company Name|Fname|Lname|Phoneno|
|Demosalesmanager|crmsfa|hpe|Pooja|s|456|
|DemoCSR|crmsfa|mindtree|sharmila|m|789|