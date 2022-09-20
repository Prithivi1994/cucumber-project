Feature: Adactin Hotel Booking

  Background: 
    Given User is on Adactin home page and verify "https://adactinhotelapp.com/"
    

  Scenario Outline: Booking Adactin Hotel by valid credentials
    When User should perform Login by valid "<username>" and "<password>"
    Then User should verify "Hello Prithivi123!"
    And User should enter "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
    Then User should verify navigate to "Select Hotel" page
    And User should select hotel
    Then User should verify "Book A Hotel" page
    And User should enter "<First Name>","<Last Name>","<Billing Address>" and card details
      | Credit Card No   | Credit Card Type | Expiry Month | Expiry Year | CVV Number |
      | 6234567891452637 | American Express | January      |        2022 |       1234 |
      | 9234567891452637 | VISA             | September    |        2021 |       3234 |
      | 7234567891452637 | Master Card      | March        |        2020 |       5234 |
      | 5234567891452637 | Other            | July         |        2019 |       8234 |
    Then User should get Order id and verify "Booking Confirmation"

    Examples: 
      | username    | password     | Location  | Hotels         | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address |
      | Prithivi123 | adactinhotel | Melbourne | Hotel Sunshine | Double    | 4 - Four        | 15/09/2022    | 16/09/2022     | 2 - Two         | 2 - Two           | Prithivi   | Raj       | Chennai         |
			
  Scenario Outline: Booking Adactin Hotel with credentials
    When User should perform Login by "<username>" and "<password>"
    Then User should verify error message

    Examples: 
      | username    | password     |
      | Prithivi123 | adactinhotel |
      
      
      
