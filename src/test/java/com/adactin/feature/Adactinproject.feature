Feature: Login functionality for adactin application

Background:
Given user enter application url
When user enter "tamlmani" as username
And user enter "8B4J34" as password
Then user verify the username in the homepage
    
@login
Scenario Outline: Sucessfull login into the adactin application with valid credential
Given user enter application url
When user enter "<username>" as username
And user enter "<password>" as password
Then user verify the username in the homepage


Examples:
|username|password|
|aarthyrajeev|abc123|

@Searchhotel
Scenario: sucessful search into the adactin application with valid credential
When user select the location
And user select the hotels
And user select roomtype
And user select roomno
Then user click submitbutton
When user click select radio button
Then user click contiue button
When user enter firstname
And user enter lastname
And user enter address
And user enter creditcardno
And user enter creditcardtype
And user enter expmon ofcreditcard
And user enter expyear ofcreditcard
And user enter cvv
And user enter booknow button
Then user click logout in the paymentpage