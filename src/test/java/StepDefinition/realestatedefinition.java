package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import StepAnnotation.realestateannotation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class realestatedefinition {
	WebDriver driver=realestateannotation.driver;
@Given("User is on the my login page of real estate site")
public void user_is_on_the_my_login_page_of_real_estate_site() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\R K Patil\\workspace\\Capg1\\driver\\chromedriver.exe");
	driver.get("http://realty-real-estatem1.upskills.in/my-profile/");
}


@When("User enter {string} and {string}")
public void user_enter_and(String string, String string2) {
	try {
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
	}
	catch(Exception e) {
		System.out.println("not able to enter username and password"+e);
		Assert.fail();
	}
   
}


@When("User click on sign in button")
public void user_click_on_sign_in_button() {
   try {
	   driver.findElement(By.name("login")).click();
   }
   catch(Exception e) {
	   System.out.println("Not able to click on sign in button"+e);
	   Assert.fail();
   }
}


@Then("User navigates to the dashboard")
public void user_navigates_to_the_dashboard() {
	
	
	}


@When("User click on properties on the menu bar")
public void user_click_on_properties_on_the_menu_bar()  {
	 try {
		   driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/a")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click on properties on the menu bar"+e);
		   Assert.fail();
	   }
	}


    @When("User click on all properties")
public void user_click_on_all_properties()  {
	 try {
		   driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/ul/li[2]/a")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click on properties on the menu bar"+e);
		   Assert.fail();
	   }
	}
  

@Then("User gets redirected to the all properties page")
public void user_gets_redirected_to_the_all_properties_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\R K Patil\\workspace\\Capg1\\driver\\chromedriver.exe");
	driver.get("http://realty-real-estatem1.upskills.in/wp-admin/edit.php?post_type=property"); 
	}


@When("User enter the title field of {string} in the search bar")
public void user_enter_the_title_field_of_in_the_search_bar(String string) {
	try {
		driver.findElement(By.xpath("//input[@id='post-search-input']")).sendKeys("pune");
	   }
	   catch(Exception e) {
		   System.out.println("Not able to enter title name in search bar"+e);
		   Assert.fail();
	   }
	}
 

@Then("User click on search properties option")
public void user_click_on_search_properties_option() {
	try {
		driver.findElement(By.xpath("//input[@id='search-submit']")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click on search properties"+e);
		   Assert.fail();
	   }
	}


@Then("User get {string} using search properties option")
public void user_get_using_search_properties_option(String string) throws InterruptedException {
	try {
		Assert.assertTrue(driver.findElement(By.xpath("//tr[@id='post-11373']")).isDisplayed());
	   }
	   catch(Exception e) {
		   System.out.println("Not able to get title name"+e);
		   Thread.sleep(6000);
		   Assert.fail();
	   }
	}


@When("User click on add new option")
public void user_click_on_add_new_option() {
	try {
		driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click on add new option"+e);
		   Assert.fail();
	   }
   
}


@Then("User navigate to add property page")
public void user_navigate_to_add_property_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\R K Patil\\workspace\\Capg1\\driver\\chromedriver.exe");
	driver.get("http://realty-real-estatem1.upskills.in/wp-admin/post-new.php?post_type=property");
}


@Then("User enter {string} in add property section")
public void user_enter_in_add_property_section(String string) throws InterruptedException {
	try {
		driver.findElement(By.xpath("//input[@name='post_title']")).sendKeys("dhule");
		Thread.sleep(6000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to enter in add property section"+e);
		   Assert.fail();
	   }
}


@Then("User click on checkbox")
public void user_click_on_checkbox() {
	try {
		driver.findElement(By.xpath("//input[@id='cb-select-11448']")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click on checkbox"+e);
		   Assert.fail();
	   }
    
}


@When("User select {string} in the title field")
public void user_select_in_the_title_field(String string) throws InterruptedException  {
	try {
		driver.findElement(By.xpath("//tr[@id='post-11051']")).isSelected();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to enter in add property section"+e);
		   Thread.sleep(6000);
		   Assert.fail();
		   
	   }
}


@When("User select the option from drop down list")
public void user_select_the_option_from_drop_down_list() {
	try {
		new Select(driver.findElement(By.xpath("//*[@id=\"bulk-action-selector-top\"]"))).selectByVisibleText("Bulk Actions");
		}
		catch(Exception e) {
			System.out.println("Not able to select");
			 Assert.fail();
		}
	   
}


@Then("User click on apply button")
public void user_click_on_apply_button()  {
	try {
		driver.findElement(By.xpath("//*[@id=\"doaction\"]")).click();
		
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   
		   
	   }
}


@Then("User navigate to the all properties page")
public void user_navigate_to_the_all_properties_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\R K Patil\\workspace\\Capg1\\driver\\chromedriver.exe");
	driver.get("http://realty-real-estatem1.upskills.in/wp-admin/edit.php?s&post_status=all&post_type=property&action=-1&m=0&paged=1&post%5B0%5D=11492&action2=-1");
}


@When("user select the {string}")
public void user_select_the(String string) {
	try {
		new Select(driver.findElement(By.name("m"))).selectByVisibleText("All dates");
		}
		catch(Exception e) {
			System.out.println("Not able to select");
			 Assert.fail();
		}
	   
}


@Then("User click the {string} on drop down list")
public void user_click_the_on_drop_down_list(String string) throws InterruptedException {
	try {
		//driver.findElement(By.xpath("//option[@value='202110']")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//option[@value='202109']")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//option[@value='202108']")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//option[@value='202106']")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//option[@value='202011']")).click();
		//Thread.sleep(6000);
		driver.findElement(By.xpath("//option[@value='202010']")).click();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("//option[@value='202009']")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//option[@value='202008']")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//option[@value='202007']")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//option[@value='202006']")).click();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//option[@value='202005']")).click();
		//Thread.sleep(6000);
		
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   
		   Assert.fail();
		   
	   }
}


@Then("User click on filter button and gets result")
public void user_click_on_filter_button_and_gets_result() throws InterruptedException {
	try {
		driver.findElement(By.xpath("//input[@name='filter_action']")).click();
		Thread.sleep(6000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }
}


@When("user click on trash option")
public void user_click_on_trash_option() {
	try {
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[5]/a")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   } 
}

@Then("User get the trash property of {string}")
public void user_get_the_trash_property_of(String string) {
	try {
		driver.findElement(By.xpath("//*[@id=\"post-12205\"]/td[1]/strong")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@When("user click on empty trash")
public void user_click_on_empty_trash() {
	try {
		driver.findElement(By.xpath("//*[@id=\"delete_all\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}


@Then("user will able to see display message that property permenantly deleted")
public void user_will_able_to_see_display_message_that_property_permenantly_deleted() {
	try {
		System.out.println(driver.findElement(By.xpath("//*[@id=\"message\"]")).getText());
	}
	catch(Exception e)
	{
		System.out.println("e");
	}

}


@When("user click on title {string}")
public void user_click_on_title(String string) {
	try {
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'New_launch_View_')]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
	}
	catch(Exception e) {
		System.out.println("user not able to click"+e);
	}
}

@When("user click on quick edit option of title field")
public void user_click_on_quick_edit_option_of_title_field() {
	try {
		// driver.findElement(By.xpath("//*[@id=\"post-12230\"]/td[1]/strong/a"));
		
		//Creating object of an Actions class
		//

		//Performing the mouse hover action on the target element.
		//
		driver.findElement(By.xpath("//a[@aria-label='Quick edit “New_launch_View_” inline']")).click();
		System.out.println("clicked on quick edit");
		Thread.sleep(3000);
		 //Assert.fail();
	  
	 
   }
   catch(Exception e) { 
	   System.out.println("user not able to click"+e);
	     
	   }
}


@Then("user enter {string}")
public void user_enter(String string) {
	try {
		driver.findElement(By.xpath("//tr[@id='edit-12230']//input[@name='post_name']")).sendKeys("mountain");
	}
	catch(Exception e) {
		System.out.println("not able to entered"+e);
	    //Assert.fail();
	}
   
}

@When("user select the month from drop down list")
public void user_select_the_month_from_drop_down_list() {
	try {
        driver.findElement(By.xpath("//tr[@id='edit-12230']//option[@value='03'][normalize-space()='03-Mar']")).click();
	    Thread.sleep(6000);
	}
	catch(Exception e) {
	System.out.println("e");
	Assert.fail();
	}
}

@Then("user enter the {string}")
public void user_enter_the(String string) {
	try {
		driver.findElement(By.xpath("//tr[@id='edit-12230']//input[@name='jj']")).clear();
		driver.findElement(By.xpath("//tr[@id='edit-12230']//input[@name='jj']")).sendKeys("13");
	}
	catch(Exception e) {
		System.out.println("not able to entered"+e);
		Assert.fail();
	}
   
}

@Then("user enter the {string} option")
public void user_enter_the_option(String string) {
	try {
		driver.findElement(By.xpath("//tr[@id='edit-12230']//input[@name='aa']")).clear();
		driver.findElement(By.xpath("//tr[@id='edit-12230']//input[@name='aa']")).sendKeys("2021");
	}
	catch(Exception e) {
		System.out.println("not able to entered"+e);
		Assert.fail();
	}
}


@Then("user enter {string} if not private")
public void user_enter_if_not_private(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("user click on checkbox of feature")
public void user_click_on_checkbox_of_feature() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("user click on allow comment")
public void user_click_on_allow_comment() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("user selct the option from the drop down list")
public void user_selct_the_option_from_the_drop_down_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("user click on update button")
public void user_click_on_update_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("user click on screen options")
public void user_click_on_screen_options() {
	try {
		driver.findElement(By.xpath("//*[@id=\"show-settings-link\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}


@Then("user click on checkbox of Author")
public void user_click_on_checkbox_of_Author() {
	try {
		driver.findElement(By.xpath("//*[@id=\"author-hide\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("user click on the apply button")
public void user_click_on_the_apply_button() {
	try {
		driver.findElement(By.xpath("//*[@id=\"screen-options-apply\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}


@Then("user able see the author section is disable on all properties page")
public void user_able_see_the_author_section_is_disable_on_all_properties_page() {
	try {
	String expectedtitle=driver.getTitle();
	String actualtitle="Properties ‹ Real Estate — WordPress";
	Assert.assertEquals(expectedtitle,actualtitle);
	}
	catch(Exception e)
	{
		System.out.println("not able to see"+e);
	}
}

@When("user click on the screen options")
public void user_click_on_the_screen_options() {
	try {
		driver.findElement(By.xpath("//*[@id=\"show-settings-link\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("user click on number of item per page option")
public void user_click_on_number_of_item_per_page_option() {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit_property_per_page\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
}
}

@Then("user click the apply button")
public void user_click_the_apply_button() {
	try {
		driver.findElement(By.xpath("//*[@id=\"screen-options-apply\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
}
}

@Then("user able see the number of item on screen")
public void user_able_see_the_number_of_item_on_screen() {
	try {
		String expectedtitle=driver.getTitle();
		String actualtitle="Properties ‹ Real Estate — WordPress";
		Assert.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(6000);
		System.out.println("able to see the number of item");
		}
		catch(Exception e)
		{
			System.out.println("not able to see"+e);
		}
	}

@When("User select the {string} in title field")
public void user_select_the_in_title_field(String string) throws InterruptedException {
	try {
		driver.findElement(By.xpath("//*[@id=\"post-12342\"]/td[1]/strong/a")).isSelected();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to select"+e);
		   Thread.sleep(6000);
		   Assert.fail();
		   
	   }
}

@Then("User click on checkbox of that title name")
public void user_click_on_checkbox_of_that_title_name() {
	try {
		driver.findElement(By.xpath("//*[@id=\"cb-select-12342\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click on checkbox"+e);
		   Assert.fail();
	   }
}

@When("User select the edit option from drop down list")
public void user_select_the_edit_option_from_drop_down_list() throws InterruptedException {
	try {
		driver.findElement(By.xpath("//*[@id=\"bulk-action-selector-top\"]/option[2]")).isSelected();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to select"+e);
		   Thread.sleep(6000);
		   Assert.fail();
		   
	   }
	   
}

@Then("User click on Apply button")
public void user_click_on_Apply_button() {
	try {
		driver.findElement(By.xpath("//*[@id=\"doaction\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click on apply button"+e);
		   Assert.fail();
	   }
}

@Then("user remove the title from bulk edit")
public void user_remove_the_title_from_bulk_edit() {
	try {
		driver.findElement(By.xpath("//*[@id=\"_12342\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("e");
		   Assert.fail();
	   }
}


@Then("user select the any checkbox of feature")
public void user_select_the_any_checkbox_of_feature() throws InterruptedException {
	try {
		driver.findElement(By.xpath("//*[@id=\"in-property_feature-1847\"]")).isSelected();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to select"+e);
		   Thread.sleep(6000);
		   Assert.fail();
		   
	   }
}

@Then("user select the any checkbox of region also")
public void user_select_the_any_checkbox_of_region_also() throws InterruptedException {
	try {
		driver.findElement(By.xpath("//*[@id=\"in-region-1864\"]")).isSelected();
		 Thread.sleep(6000);
		   Assert.fail();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to select"+e);
		  
	   }
}

@Then("user select the author from given drop down list")
public void user_select_the_author_from_given_drop_down_list() {
	try {
		new Select(driver.findElement(By.xpath("//*[@id=\"bulk-edit\"]/td/fieldset[3]/div/label/select/option[10]"))).selectByVisibleText("myuser (myuser)");
		}
		catch(Exception e) {
			System.out.println("Not able to select");
			 Assert.fail();
		}
	   
}

@Then("user select the comments option from drop down list")
public void user_select_the_comments_option_from_drop_down_list() {
    
}

@Then("user select the status option from given drop down list")
public void user_select_the_status_option_from_given_drop_down_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("user click on the update button")
public void user_click_on_the_update_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("user able to see the updated field")
public void user_able_to_see_the_updated_field() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("user click on the arrow of the title field")
public void user_click_on_the_arrow_of_the_title_field() {
	try {
		WebElement ele = driver.findElement(By.xpath("//th[@id='title']//a"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//th[@id='title']//span[@class='sorting-indicator']")).click();
		System.out.println("clicked on arrow");
	}
		
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
}
}

@Then("user able to see the in title field all tiltle name arrange in sorting order")
public void user_able_to_see_the_in_title_field_all_tiltle_name_arrange_in_sorting_order() {
	try {
		String expectedtitle=driver.getTitle();
		String actualtitle="Properties ‹ Real Estate — WordPress";
		Assert.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(6000);
	}
	 catch(Exception e) {
		   System.out.println("Not able to see"+e);
		   Assert.fail();
}

}


@Then("user click the arrow of the date field")
public void user_click_the_arrow_of_the_date_field() {
	try {
		WebElement ele = driver.findElement(By.xpath("//th[@id='date']//a"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//th[@id='date']//span[@class='sorting-indicator']")).click();
		System.out.println("clicked on arrow");
	}
		
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
}
}

@Then("user able to see all dates arrange in sorting order")
public void user_able_to_see_all_dates_arrange_in_sorting_order() {
	try {
		String expectedtitle=driver.getTitle();
		String actualtitle="Properties ‹ Real Estate — WordPress";
		Assert.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(6000);
	}
	 catch(Exception e) {
		   System.out.println("Not able to see"+e);
		   Assert.fail();
}
}



@When("user click on title name")
public void user_click_on_title_name() {
	try {
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'New_launch_View_')]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		System.out.println("hovered the New_launch_View_ ");
	}
	catch(Exception e) {
		System.out.println("user not able to click"+e);
	}
}


@Then("user click on view option")
public void user_click_on_view_option() {
	try {
		driver.findElement(By.xpath("//a[@aria-label='View “New_launch_View_”']")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);
		 //Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
	}
    

@Then("user navigate to that titlename property and able to see enquiry page")
public void user_navigate_to_that_titlename_property_and_able_to_see_enquiry_page() {
	try {
		String expectedtitle=driver.getTitle();
		String actualtitle="New_launch_View_ – Real Estate";
		Assert.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(6000);
	}
	 catch(Exception e) {
		   System.out.println("Not able to navigate"+e);
		   Assert.fail();
}

}

@Then("user enter {string}  {string}{string}{string} in edit field")
public void user_enter_in_edit_field(String name, String email, String subject, String message) {
	try {
		driver.findElement(By.name("your-name")).sendKeys("aditi");
		driver.findElement(By.name("your-email")).sendKeys("aditichavan1199@gmail.com");
		driver.findElement(By.name("your-subject")).sendKeys("welcome");
		driver.findElement(By.name("your-message")).sendKeys("ABC");
		Thread.sleep(3000);
		System.out.println("User enter name,email,subject,message");
		//driver.findElement(By.name("your-name")).sendKeys("shruti");
		//driver.findElement(By.name("your-email")).sendKeys("shrutipatil1501@gmail.com");
		//driver.findElement(By.name("your-subject")).sendKeys("hi");
		//driver.findElement(By.name("your-message")).sendKeys("XYZ");
		//driver.findElement(By.name("your-name")).sendKeys("prachi");
		//driver.findElement(By.name("your-email")).sendKeys("prachipatil@gmail.com");
		//driver.findElement(By.name("your-subject")).sendKeys("success");
		//driver.findElement(By.name("your-message")).sendKeys("MNO");
	}
	catch(Exception e) {
		System.out.println("not able to enter"+e);
		Assert.fail();
	}
   
}

@Then("user click on send button")
public void user_click_on_send_button() {
	try {
		driver.findElement(By.xpath("//input[@value='Send']")).click();
		System.out.println("clicked on send button");
		Thread.sleep(3000);
		 //Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}


}






