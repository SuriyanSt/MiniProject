$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Checking the Booking functionality of and Adactin Application",
  "description": "",
  "id": "checking-the-booking-functionality-of-and-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-and-adactin-application;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"\u003cusername\u003e\" In the Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cpassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click the Login Button And Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "checking-the-booking-functionality-of-and-adactin-application;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "checking-the-booking-functionality-of-and-adactin-application;login-functionality;;1"
    },
    {
      "cells": [
        "suriyan098",
        "suriya75"
      ],
      "line": 10,
      "id": "checking-the-booking-functionality-of-and-adactin-application;login-functionality;;2"
    },
    {
      "cells": [
        "suriyan1234",
        "suriyan@1234"
      ],
      "line": 11,
      "id": "checking-the-booking-functionality-of-and-adactin-application;login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1062501,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-and-adactin-application;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"suriyan098\" In the Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"suriya75\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click the Login Button And Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 9232955500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "suriyan098",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_the_Username_Field(String)"
});
formatter.result({
  "duration": 122626399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "suriya75",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 58316100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_Click_the_Login_Button_And_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 610953799,
  "status": "passed"
});
formatter.after({
  "duration": 306800,
  "status": "passed"
});
formatter.before({
  "duration": 148701,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login Functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-and-adactin-application;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user Must Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user Enter The \"suriyan1234\" In the Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"suriyan@1234\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Click the Login Button And Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_Must_Launch_The_Url()"
});
formatter.result({
  "duration": 2496546500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "suriyan1234",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_the_Username_Field(String)"
});
formatter.result({
  "duration": 58799800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "suriyan@1234",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 64423500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_Click_the_Login_Button_And_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1364946700,
  "status": "passed"
});
formatter.after({
  "duration": 211501,
  "status": "passed"
});
formatter.before({
  "duration": 395400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search Hotel Functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-and-adactin-application;search-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user Select The \"Sydney\" In The Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user Select The \"Hotel Sunshine\" In The Hotels Field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Select The \"Double\" In The HotelType Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select The \"3 - Three\" In The Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Enter The \"12/06/2022\" In The Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Enter The \"15/06/2022\" In The Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Click The Search Button And Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 17
    }
  ],
  "location": "Stepdefination.user_Select_The_In_The_Location_Field(String)"
});
formatter.result({
  "duration": 98275700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 17
    }
  ],
  "location": "Stepdefination.user_Select_The_In_The_Hotels_Field(String)"
});
formatter.result({
  "duration": 96550800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Double",
      "offset": 17
    }
  ],
  "location": "Stepdefination.user_Select_The_In_The_HotelType_Field(String)"
});
formatter.result({
  "duration": 93689700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3 - Three",
      "offset": 17
    }
  ],
  "location": "Stepdefination.user_Select_The_In_The_Number_Of_Rooms_Field(String)"
});
formatter.result({
  "duration": 84299500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12/06/2022",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_The_Check_In_Date_Field(String)"
});
formatter.result({
  "duration": 57604499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15/06/2022",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_The_Check_Out_Date_Field(String)"
});
formatter.result({
  "duration": 59122000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_Click_The_Search_Button_And_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 892885500,
  "status": "passed"
});
formatter.after({
  "duration": 63600,
  "status": "passed"
});
formatter.before({
  "duration": 47500,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Select Hotel Functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-and-adactin-application;select-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "user Select The Select Button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user Click the Continue Button And Navigates To The Book A Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.user_Select_The_Select_Button()"
});
formatter.result({
  "duration": 55384000,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.user_Click_the_Continue_Button_And_Navigates_To_The_Book_A_Hotel_page()"
});
formatter.result({
  "duration": 973887400,
  "status": "passed"
});
formatter.after({
  "duration": 53400,
  "status": "passed"
});
formatter.before({
  "duration": 46800,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Book a Hotel functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-and-adactin-application;book-a-hotel-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "user Enter The \"Suriyan\" In The Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user Enter The \"Sun\" In The Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Enter The \"Chennai\" In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Enter The \"9876541230123654\"In The Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Select The \"VISA\" In Credit Card Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Select The \"March\" In the Expiry Month Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Select The \"2020\" In the Expiry Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter The \"123\" In The Cvv Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Click The Booking Now Button And Navigate To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Suriyan",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_The_Firstname_Field(String)"
});
formatter.result({
  "duration": 83666801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sun",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_The_Lastname_Field(String)"
});
formatter.result({
  "duration": 67992099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chennai",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_The_Billing_Address_Field(String)"
});
formatter.result({
  "duration": 57742300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9876541230123654",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_The_Credit_Card_No_Field(String)"
});
formatter.result({
  "duration": 70179199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 17
    }
  ],
  "location": "Stepdefination.user_Select_The_In_Credit_Card_Field(String)"
});
formatter.result({
  "duration": 90322700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "March",
      "offset": 17
    }
  ],
  "location": "Stepdefination.user_Select_The_In_the_Expiry_Month_Field(String)"
});
formatter.result({
  "duration": 82464600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2020",
      "offset": 17
    }
  ],
  "location": "Stepdefination.user_Select_The_In_the_Expiry_Year_Field(String)"
});
formatter.result({
  "duration": 81331701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Stepdefination.user_Enter_The_In_The_Cvv_Field(String)"
});
formatter.result({
  "duration": 58073101,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefination.click_The_Booking_Now_Button_And_Navigate_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 50670099,
  "status": "passed"
});
formatter.after({
  "duration": 645999,
  "status": "passed"
});
formatter.before({
  "duration": 49900,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Booking Confirmation Functionality",
  "description": "",
  "id": "checking-the-booking-functionality-of-and-adactin-application;booking-confirmation-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "user Click the Logout Button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefination.user_Click_the_Logout_Button()"
});
formatter.result({
  "duration": 628588300,
  "status": "passed"
});
formatter.after({
  "duration": 55900,
  "status": "passed"
});
});