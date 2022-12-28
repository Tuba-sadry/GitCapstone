Feature: Retail Account Page

Background: 

Given User is on retail website 

When User click on Sign in option 

And User enter email 'ihateteacher1@tek.com' and password 'Tek@123450' 

And User click on login button 

And User should be logged in into Account 
When User click on Account option

 @account
Scenario: Verify User can update Profile Information  

And User update Name 'emilie' and Phone '07863367' 

And User click on Update button  

Then user profile information should be updated

@Change
 Scenario: Verify User can Update password 
 
And User enter below information 
|previousPassword| newPassword|confirmPassword|
|Tek@12345 |Tek@12389 |Tek@12389 |
And User click on Change Password button 
Then a message should be displayed ‘Password Updated Successfully’

@payment
Scenario: Verify User can add a payment method
When User click on Account option
And User click on Add a payment method link
And User fill Debit or credit card information
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|0987654321098765 | emily |11 |2022 |786 |
And User click on Add your card button
Then a message should be displayed ‘Payment Method added successfully’

 @edit
 Scenario: Verify User can edit Debit or Credit card 
When User click on Account option 
And User select the payment Card
And User click on Edit option of card section
And user edit information with below data 
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|1234567892345612 | emily|12|2022 |786 |
And user click on Update Your Card button 
Then a message should be displayed ‘Payment Method updated Successfully’
 
 @remove
 Scenario: Verify User can remove Debit or Credit card 
When User click on Account option 
And User select the payment Card
And User click on remove option of card section
Then payment details should be removed

@adress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName     | phoneNumber | streetAddress | apt | city       | state    | zipCode |

      | United States | Billie Eilish |  5713220193 | seminaryTower  | 333 | Alexandria | Virginia |   22195 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully
 
 @updateaddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user update new address form with below information
      | country       | fullName      | phoneNumber | streetAddress | apt | city    | state | zipCode |       

      | United States | Ghizal sadat |  5713426754 | fairfoxdrive  | 303 | FiarFox | Virgina | 22321 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’
 
 @editAddress
 Scenario: Verify User can remove Address from Account 
When User click on Account option 
And User click on remove option of Address section
Then Address details should be removed
 
 
 
 
 
 
 

 