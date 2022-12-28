Feature: Sign In Feature

 
 
@firstTest
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'ihateteacher@tek.com' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

 
    
    @signUpTest
    Scenario: Verify User can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
    | name     | email                   | password | confirmPassword |
    | panthers | panthers2354@tekschool.us | Tek@2342  | Tek@2342          |
    And User click on SignUp button
    Then User should be logged into account page
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     