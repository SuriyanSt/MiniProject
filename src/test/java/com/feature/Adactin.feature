Feature: Checking the Booking functionality of and Adactin Application
Scenario Outline: Login Functionality
Given user Must Launch The Url
When user Enter The "<username>" In the Username Field
And user Enter The "<password>" In The Password Field
Then user Click the Login Button And Navigates To The Search Hotel Page

Examples:
|username|password|
|suriyan098|suriya75|
|suriyan1234|suriyan@1234|

Scenario:Search Hotel Functionality
When user Select The "Sydney" In The Location Field
And user Select The "Hotel Sunshine" In The Hotels Field
And user Select The "Double" In The HotelType Field
And user Select The "3 - Three" In The Number Of Rooms Field
And user Enter The "12/06/2022" In The Check In Date Field
And user Enter The "15/06/2022" In The Check Out Date Field
Then user Click The Search Button And Navigates To The Select Hotel Page

Scenario: Select Hotel Functionality
When user Select The Select Button 
Then user Click the Continue Button And Navigates To The Book A Hotel page

Scenario: Book a Hotel functionality 
When user Enter The "Suriyan" In The Firstname Field
And user Enter The "Sun" In The Lastname Field
And user Enter The "Chennai" In The Billing Address Field
And user Enter The "9876541230123654"In The Credit Card No Field
And user Select The "VISA" In Credit Card Field
And user Select The "March" In the Expiry Month Field
And user Select The "2020" In the Expiry Year Field
And user Enter The "123" In The Cvv Field
Then Click The Booking Now Button And Navigate To The Booking Confirmation Page



Scenario: Booking Confirmation Functionality
When user Click the Logout Button



