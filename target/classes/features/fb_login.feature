Feature: verifying login functionality

Background: 
Given Open the login page 
When Enter username and password
And click on Login button 
 
@Valid 
Scenario: verifying Valid Criditional 
Then Open homepage 

@Invalid
Scenario: Verifying Valid Username and Invaild password
Then Its Should be show Error 
  

