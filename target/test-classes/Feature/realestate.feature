Feature: Automation Testing of Real Estate Website

  Background: Verify login functionality
    Given User is on the my login page of real estate site
    When User enter "mohankrishna176@gmail.com" and "Secret@123&&"
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
      #| Mumbai |  
      

  Scenario Outline: verify move to trash using bulk action functionality
    When User select "<titlename>" on title field
    Then User click of that title name checkbox 
    When User select the bulk action
    Then user click on move to trash from the drop down list 
    Then User click on that apply button
    Then user able to see the display message on screen
    
    
    Examples: 
      | titlename |
      | Hopes |  
      
      
  Scenario Outline: Verify expire property using bulk action functionality
     When User select "<titlename>" in title field section
     Then User click on the checkbox of title name
     When User select bulk action 
     Then user click on expire property of drop down list
     Then user click that apply button 
     Then this property add to expired properties section
     
     Examples: 
     | titlename |
     | jalgaon |
    
 
  Scenario Outline: verify the edit using bulk action functionality  
      When User select the "<titlename>" in title field
      Then User click on checkbox of that title name
      When User select bulk actions section
      Then User click the edit option from drop down list
      Then User click on Apply button
      Then user click the  checkbox of "<feature>"
      Then user click the checkbox of "<region>" also
      Then user select the author 
      And user click on "<authorname>" from given drop down list
      Then user select the comment
      And user click the "<comment>" option from drop down list
      Then user select the status 
      And user click on the "<status>"option from given drop down list
      When user click on the update button 
      Then message display on all properties page
      
   		Examples: 
   		| titlename | feature | region | authorname | comment | status |
			| Automation | 2Bhk land | Description TestingU | Sneha Shet (Sneha) | Allowed | Published |
   		
  
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
    

  Scenario: Verify pagination functionality on all properties page
    When user checks if pagination exists
    Then user is on current page
    Then user check the next button
    And user click on last page button and navigate to last page
    Then user click on first page button and redirect to first page
    Then user count total no of items on all properties table
    
    
   
    Scenario Outline: verify the trash functionality on all properties page
      When user click on trash option 
      Then User get the trash property of "<title name>"
      When user click on empty trash
      Then user will able to see display message that property permenantly deleted
      
      
      Examples:
      | title name |
      | Hello Kitty |
      
    
   Scenario Outline: Verify the  quick edit section
     When user click "<title>" from title field
     Then user click on quick edit option of that title name
     Then user enter "<slug>"
     When user select the month field
     Then user click on "<month>" on drop down list
     Then user enter the "<date>"
     Then user enter the "<year>" option
     Then user enter "<hour>" time
     And user enter "<minute>" time also
     Then user select the authorname
     And user click on "<author>"
     Then user click on checkbox of feature
     Then user click the checkbox of region field 
     Then user click on allow comment
     Then user select the status field
     And user click on the "<statusfield>" option into drop down list
     Then user click on update button
    
     Examples:
   | title | slug | month |date | year | hour | minute | author | statusfield |
   | Accomplish | hii | 06-Jun |16 | 2021 | 10 | 35 | simran gupta (admin) | Published |
   
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
  #| mrunmayee | mrunmayee@gmail.com | hello | PQR |
     
   
     Scenario: Verify the column functionality in screen options
       When user click on screen options
       Then user click on checkbox of Author
       Then user click on the apply button
       Then user able see the author section is disable on all properties page
       
 
   Scenario Outline: verify the number of item per page of pagination functionaliy
    When user click on the screen options
    Then user enter the number of item per page "<number>"
    Then user click apply button
    And user navigate to all properties page and able to see in changes in pagination field
    
    Examples:
    | number |
    | 100 |
    
  
    Scenario: verify the Sorting functionality in title,date,comments field
      When user click the arrow of the title field column
      Then all title name arrange in ascending order
      Then all title name arrange in descending order
      When user click on the arrow of date field
      Then all date arrange in ascending order
      Then all date arrange in descending order
      When user click on arrow of comment field
      Then all comments arrange in ascending 
      Then comments should be arrange in descending order
    

   
    Scenario Outline: bug-verify passowrd field accepted more than 10 characters
    When user select the title field of title name
    Then user click on quick edit field 
    When user enter the "<password1>" in password field
    Then user click the update button 
    
    Examples:
    | password1 |
    | Shruti@34 |
   # | Shrutip@6786 |
   
     
     Scenario Outline: bug-verify title field accepted special characters
        When user select title
    		Then user click on quick edit which is below the title 
    		Then user enter "<titlename>" in title block
    		Then user click on the update button of quick edit field
    		
    		Examples:
    		| titlename |
    		#| welcome@123 |
    		| @#$%&*&&^$ | 
    		
    		
    @tag1
    Scenario Outline: bug-verify title field accepted more than 30 characters
    When user select  title name on title field column
    Then user click on quick edit optin in title field 
    When user enter the "<titlename>" in title field
    Then user click of that update button 
    
    Examples:
    | titlename |
   # | sunflower |
 		| jshfbneiururfbvbejwlehfbdhfh3rhu4ghewjh8463tryuegfhgfjvfhdvwuqgfhfhqwfuwe |
  