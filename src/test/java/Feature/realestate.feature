Feature: Automation Testing of Real Estate Website

  Background: Verify login functionality
    Given User is on the my login page of real estate site
    When User enter "admin" and "admin@123"
    And User click on sign in button
    Then User navigates to the dashboard
    When User click on properties on the menu bar
    And User click on all properties
    Then User gets redirected to the all properties page
    
    
  Scenario Outline: Verify search functionality for search the properties
    When User enter the title field of "<titlename>" in the search bar
    Then User click on search properties option
    Then User get "<titlename>" using search properties option

    Examples: 
      | titlename |
      | pune |  
      
  
  Scenario Outline: Verify add new properties functionality
    When User click on add new option
    Then User navigate to add property page
    Then User enter "<name>" in add property section
    
     Examples: 
      | name |
      | dhule |  
      
  
  Scenario Outline: verify bulk action on all properties page
    When User select "<titlename>" in the title field
    Then User click on checkbox 
    When User select the option from drop down list
    Then User click on apply button
    Then User navigate to the all properties page
    
    
    Examples: 
      | titlename |
      | shirpur |  
      
 
  Scenario Outline: verify all dates on all properties page 
    When user select the "All dates"   
    Then User click the "<month year>" on drop down list
    Then User click on filter button and gets result
    
    Examples:
    | month year | 
   # | October 2021 |
   # | September 2021 |
   # | August 2021 |
   # | June 2021 |
   # | November 2020 |
    | October 2020 |
   # | September 2020 | 
   # | August 2020 |
   # | July 2020 |
    #| June 2020 |
    #| May 2020 |
    
  
  Scenario: Verify pagination on all properties page
    When user click on arrow
    Then user redirected to nextS page
   # Then user again click on arrow 
   # Then user redirected to third page
    
   
    Scenario Outline: verify the trash functionality on all properties page
      When user click on trash option 
      Then User get the trash property of "<title name>"
      When user click on empty trash
      Then user will able to see display message that property permenantly deleted
      
      
      Examples:
      | title name |
      | Hello Kitty |
      
   
   Scenario Outline: Verify the  quick edit section
     When user click on title
     Then user click on quick edit option of title field
     Then user enter "<slug>"
     When user select the month from drop down list
     Then user enter the "<date>"
     Then user enter the "<year>" option
     Then user enter "<password>" if not private
     Then user click on checkbox of feature 
     Then user click on allow comment
     Then user selct the option from the drop down list
     Then user click on update button
    
     Examples:
   | slug | date | year | password |
    | mountain | 13 | 2021 | shruti@34 |
     
   
     Scenario: Verify the column functionality in screen options
       When user click on screen options
       Then user click on checkbox of Author
       Then user click on the apply button
       Then user able see the author section is disable on all properties page
       
       

    Scenario: Verify the pagination in screen options
       When user click on the screen options
       Then user click on number of item per page option
       Then user click the apply button
       Then user able see the number of item on screen
       
   
    Scenario Outline: verify the edit functionality  
      When User select the "<titlename>" in title field
      Then User click on checkbox of that title name
      When User select the edit option from drop down list
      Then User click on Apply button
      Then user remove the title from bulk edit 
      Then user select the any checkbox of "<feature>"
      Then user select the any checkbox of "<region>" also
      Then user select the "<author>" from given drop down list
      Then user select the "<comment>" option from drop down list
      Then user select the "<status>" option from given drop down list
      When user click on the update button 
      Then user able to see the updated field
      
   		Examples: 
   		| titlename | feature | region | author | comment | status |
   		| champion |  Book_room | Region1 | Sneha Shet (Sneha) | Allowed | Published |
   		
   @tag12
  Scenario: verify the Sorting functionality in title field
    When user click on the arrow of the title field
    Then user able to see the in title field all tiltle name arrange in sorting order
    Then user click the arrow of the date field
    Then user able to see all dates arrange in sorting order
    
    
   
  
  Scenario Outline: Verify view functionality
    When user click on title name
    Then user click on view option 
    Then user navigate to that titlename property and able to see enquiry page
    Then user enter "<name>"  "<email>""<subject>""<message>" in edit field
    Then user click on send button
      
  Examples:
  | name | email | subject | message |
  | aditi | aditichavan1199@gmail.com | welcome | ABC |
  #| shruti | shrutipatil1501@gmail.com | hi | XYZ |
  #| prachi | prachipatil@gmail.com | success | MNO |
  
          
    
  