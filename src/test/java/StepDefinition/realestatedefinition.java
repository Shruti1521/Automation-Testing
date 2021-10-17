package StepDefinition;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		driver.findElement(By.name("log")).sendKeys("mohankrishna176@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("Secret@123&&");
		System.out.println("Usename and password is entered");
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
	   System.out.println("clicked on login");
   }
   catch(Exception e) {
	   System.out.println("Not able to click on sign in button"+e);
	   Assert.fail();
   }
}


@Then("User navigates to the dashboard")
public void user_navigates_to_the_dashboard() {
	try {
		String expectedtitle=driver.getTitle();
		String actualtitle="Dashboard ‹ Real Estate — WordPress";
		Assert.assertEquals(expectedtitle,actualtitle);
		Thread.sleep(6000);
		System.out.println("User is on Dashboard Page");
		}
	 catch(Exception e) {
		   System.out.println("Not able to see"+e);
		   Assert.fail();
}

	
	}


@When("User click on properties on the menu bar")
public void user_click_on_properties_on_the_menu_bar()  {
	 try {
		   driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/a")).click();
		   System.out.println("clicked the properties option");
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
		   System.out.println("User is on all properties page");
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click on properties on the menu bar"+e);
		   Assert.fail();
	   }
	}
  

@Then("User gets redirected to the all properties page")
public void user_gets_redirected_to_the_all_properties_page() {
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

@When("User enter the title field of {string} in the search bar")
public void user_enter_the_title_field_of_in_the_search_bar(String string) {
	try {
		driver.findElement(By.xpath("//input[@id='post-search-input']")).sendKeys("pune");
		//driver.findElement(By.xpath("//input[@id='post-search-input']")).sendKeys("Mumbai");
		System.out.println("Entered the name in search bar");
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
		System.out.println("clicked on search properties option");
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
		//Assert.assertTrue(driver.findElement(By.xpath("//tr[@id='post-12992']")).isDisplayed());
		System.out.println("user get expected result");
	   }
	   catch(Exception e) {
		   System.out.println("Not able to get title name"+e);
		   Thread.sleep(6000);
		   Assert.fail();
	   }
	}


@When("User select {string} on title field")
public void user_select_on_title_field(String string) throws InterruptedException {
	try {
		driver.findElement(By.xpath("//*[@id=\"post-12496\"]/td[1]/strong/a")).isSelected();
		System.out.println("user select the title field");
	   }
	   catch(Exception e) {
		   System.out.println("Not able to select"+e);
		   Thread.sleep(6000);
		   Assert.fail();
		   
	   }
}

@Then("User click of that title name checkbox")
public void user_click_of_that_title_name_checkbox() {
	try {
		driver.findElement(By.xpath("//*[@id=\"cb-select-12496\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}


@When("User select the bulk action")
public void user_select_the_bulk_action() {
	try {
		new Select(driver.findElement(By.id("bulk-action-selector-top"))).selectByVisibleText("Bulk Actions");
		}
		catch(Exception e) {
			System.out.println("Not able to select");
			 Assert.fail();
		}
	   
}


@Then("user click on move to trash from the drop down list")
public void user_click_on_move_to_trash_from_the_drop_down_list() {
	try {
		driver.findElement(By.xpath("//*[@id=\"bulk-action-selector-top\"]/option[3]")).click();
		Thread.sleep(3000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("User click on that apply button")
public void user_click_on_that_apply_button() {
	try {
		driver.findElement(By.xpath("//input[@id='doaction']")).click();
		Thread.sleep(1000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("user able to see the display message on screen")
public void user_able_to_see_the_display_message_on_screen() {
	try {
		System.out.println(driver.findElement(By.xpath("//div[@id='message']")).getText());
	}
	catch(Exception e)
	{
		System.out.println("e");
		Assert.fail();
	}

}

@When("User select {string} in title field section")
public void user_select_in_title_field_section(String string) throws InterruptedException {
	try {
		driver.findElement(By.xpath("//*[@id=\"post-13234\"]/td[1]/strong/a")).isSelected();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to select"+e);
		   Thread.sleep(3000);
		   Assert.fail();
		   
	   }
}

@Then("User click on the checkbox of title name")
public void user_click_on_the_checkbox_of_title_name() {
	try {
		driver.findElement(By.xpath("//input[@id='cb-select-13234']")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@When("User select bulk action")
public void user_select_bulk_action() {
	try {
		new Select(driver.findElement(By.id("bulk-action-selector-top"))).selectByVisibleText("Bulk Actions");
		}
		catch(Exception e) {
			System.out.println("Not able to select");
			 Assert.fail();
		}
}

@Then("user click on expire property of drop down list")
public void user_click_on_expire_property_of_drop_down_list() {
	try {
		driver.findElement(By.xpath("//*[@id=\"bulk-action-selector-top\"]/option[5]")).click();
		Thread.sleep(3000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("user click that apply button")
public void user_click_that_apply_button() {
	try {
		driver.findElement(By.xpath("//input[@id='doaction']")).click();
		Thread.sleep(1000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("this property add to expired properties section")
public void this_property_add_to_expired_properties_section() {
	try {
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[6]/a")).click();
		Thread.sleep(3000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@When("User select the {string} in title field")
public void user_select_the_in_title_field(String string) throws InterruptedException {
	try {
		driver.findElement(By.xpath("//*[@id=\"post-13254\"]/td[1]/strong/a")).isSelected();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to select"+e);
		   Thread.sleep(3000);
		   Assert.fail();
		   
	   }
}

@Then("User click on checkbox of that title name")
public void user_click_on_checkbox_of_that_title_name() {
	try {
		driver.findElement(By.xpath("//input[@id='cb-select-13254']")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}
@When("User select bulk actions section")
public void user_select_bulk_actions_section() {
	try {
		new Select(driver.findElement(By.id("bulk-action-selector-top"))).selectByVisibleText("Bulk Actions");
		}
		catch(Exception e) {
			System.out.println("Not able to select");
			 Assert.fail();
		}
}



@Then("User click the edit option from drop down list")
public void user_click_the_edit_option_from_drop_down_list() {
	try {
		driver.findElement(By.xpath("//*[@id=\"bulk-action-selector-top\"]/option[2]")).click();
		Thread.sleep(3000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("User click on Apply button")
public void user_click_on_Apply_button() {
	try {
		driver.findElement(By.xpath("//input[@id='doaction']")).click();
		Thread.sleep(1000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("user click the  checkbox of {string}")
public void user_click_the_checkbox_of(String string) {
	try {
		driver.findElement(By.xpath("//*[@id=\"in-property_feature-1846\"]")).click();
		Thread.sleep(1000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("user click the checkbox of {string} also")
public void user_click_the_checkbox_of_also(String string) {
	try {
		driver.findElement(By.xpath("//*[@id=\"in-region-1952\"]")).click();
		Thread.sleep(1000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("user select the author")
public void user_select_the_author() {
	try {
		new Select(driver.findElement(By.xpath("//fieldset[@class='inline-edit-col-right']//select[@name='post_author']"))).selectByVisibleText("— No Change —");
		}
		catch(Exception e) {
			System.out.println("Not able to select");
			 Assert.fail();
		}
}


@Then("user click on {string} from given drop down list")
public void user_click_on_from_given_drop_down_list(String string) {
	try {
		driver.findElement(By.xpath("//*[@id=\"bulk-edit\"]/td/fieldset[3]/div/label/select/option[20]")).click();
		Thread.sleep(1000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("user select the comment")
public void user_select_the_comment() {
	try {
		new Select(driver.findElement(By.xpath("//*[@id=\"bulk-edit\"]/td/fieldset[3]/div/div[1]/label/select"))).selectByVisibleText("— No Change —");
		}
		catch(Exception e) {
			System.out.println("Not able to select");
			 Assert.fail();
		}
}

@Then("user click the {string} option from drop down list")
public void user_click_the_option_from_drop_down_list(String string) {
	try {
		driver.findElement(By.xpath("//option[@value='open']")).click();
		Thread.sleep(1000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("user select the status")
public void user_select_the_status() {
	try {
		new Select(driver.findElement(By.xpath("//*[@id=\"bulk-edit\"]/td/fieldset[3]/div/div[2]/label/select"))).selectByVisibleText("— No Change —");
		}
		catch(Exception e) {
			System.out.println("Not able to select");
			 Assert.fail();
		}
}

@Then("user click on the {string}option from given drop down list")
public void user_click_on_the_option_from_given_drop_down_list(String string) {
	try {
		driver.findElement(By.xpath("//*[@id=\"bulk-edit\"]/td/fieldset[3]/div/div[2]/label/select/option[2]")).click();
		Thread.sleep(1000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@When("user click on the update button")
public void user_click_on_the_update_button() {
	try {
		driver.findElement(By.xpath("//input[@id='bulk_edit']")).click();
		Thread.sleep(1000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
		   
	   }  
}

@Then("message display on all properties page")
public void message_display_on_all_properties_page() {
	try {
		System.out.println(driver.findElement(By.xpath("//div[@id='message']")).getText());
	}
	catch(Exception e)
	{
		System.out.println("e");
		Assert.fail();
	}
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

@When("user checks if pagination exists")
public void user_checks_if_pagination_exists() {
	try{
		List<WebElement> pagination =driver.findElements(By.xpath("//*[@id=\"posts-filter\"]/div[1]/div[3]/span[2]")); 
		if(pagination.size()>0)
		{ 
			System.out.println("pagination exists"); 
			
		}
	}
	catch(Exception e)
	{
		System.out.println("not exists"+e);
		Assert.fail();
		}

}

@Then("user is on current page") 
public void user_is_on_current_page() { 
	try { 
		String Currentpage=driver.findElement(By.xpath("//*[@id=\"table-paging\"]/span")).getText(); 
		System.out.println("Current page is: "+Currentpage); 
		} 
	catch(Exception e) {
		System.out.println("Admin is not able to get current page"+e); 
		Assert.fail();
	} 
}

@Then("user check the next button")
public void user_check_the_next_button() {
	try{
		WebElement NextButton= driver.findElement(By.xpath("//*[@id=\"posts-filter\"]/div[1]/div[3]/span[2]/a[1]"));
			 NextButton.click();				  
		 }
	catch(Exception e)
	{
		System.out.println("21.Some exception found: "+e);
		Assert.fail();
	}
}
@Then("user click on last page button and navigate to last page")
public void user_click_on_last_page_button_and_navigate_to_last_page() {
	try {
		WebElement lastpage= driver.findElement(By.xpath("//*[@id=\"posts-filter\"]/div[1]/div[3]/span[2]/a[2]")); 
		lastpage.click();
		Thread.sleep(2000); 
		System.out.println("Admin is on the last page");
		} 
	catch (Exception e) {
		System.out.println("Admin is not able to navigate on last page"+e);
		Assert.fail();
	}
}

@Then("user click on first page button and redirect to first page")
public void user_click_on_first_page_button_and_redirect_to_first_page() {
	try {
		WebElement firstpage= driver.findElement(By.xpath("//*[@id=\"posts-filter\"]/div[1]/div[3]/span[2]/a[1]"));
		firstpage.click();
		Thread.sleep(2000);
		} 
	catch (Exception e) {
		System.out.println("Admin is unable to navigate to first page"+e);
		Assert.fail();
}

}

@Then("user count total no of items on all properties table")
public void user_count_total_no_of_items_on_all_properties_table() {
	try {
		String totalitems= driver.findElement(By.xpath("//*[@id=\"posts-filter\"]/div[1]/div[3]/span[1]")).getText();
		System.out.println("Total no of items on all properties table:"+totalitems);
		}
	catch (Exception e) {
		System.out.println("Admin is not able to count total number of items on the title bar of media table"+e);
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

@When("user click {string} from title field")
public void user_click_from_title_field(String string) {
	try {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"post-12488\"]/td[1]/strong/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		System.out.println("hovered the Accomplish ");
	}
	catch(Exception e) {
		System.out.println("user not able to click"+e);
	}
}

@Then("user click on quick edit option of that title name")
public void user_click_on_quick_edit_option_of_that_title_name() {
	try {
		driver.findElement(By.xpath("//a[@aria-label='Quick edit “Accomplish” inline']")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);
		 //Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}

@Then("user enter {string}")
public void user_enter(String hii) {
	try {
		driver.findElement(By.xpath("//tr[@id='edit-12488']//input[@name='post_name']")).sendKeys("hii");
		Thread.sleep(6000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to enter in add property section"+e);
		   Assert.fail();
	   }
}

@When("user select the month field")
public void user_select_the_month_field() throws InterruptedException {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/fieldset/div/label[1]/select")).isSelected();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to select"+e);
		   Thread.sleep(3000);
		   Assert.fail();
		   
	   }
}


@Then("user click on {string} on drop down list")
public void user_click_on_on_drop_down_list(String string) {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/fieldset/div/label[1]/select/option[6]")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);
		 //Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}

@Then("user enter the {string}")
public void user_enter_the(String date) {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/fieldset/div/label[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/fieldset/div/label[2]/input")).sendKeys("16");
		Thread.sleep(3000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to enter in add property section"+e);
		   Assert.fail();
	   }
}

@Then("user enter the {string} option")
public void user_enter_the_option(String year) {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/fieldset/div/label[3]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/fieldset/div/label[3]/input")).sendKeys("2021");
		Thread.sleep(3000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to enter in add property section"+e);
		   Assert.fail();
	   }
}

@Then("user enter {string} time")
public void user_enter_time(String hour) {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/fieldset/div/label[4]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/fieldset/div/label[4]/input")).sendKeys("10");
		Thread.sleep(3000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to enter in add property section"+e);
		   Assert.fail();
	   }
}

@Then("user enter {string} time also")
public void user_enter_time_also(String minute) {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/fieldset/div/label[5]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/fieldset/div/label[5]/input")).sendKeys("35");
		Thread.sleep(3000);
	   }
	   catch(Exception e) {
		   System.out.println("Not able to enter in add property section"+e);
		   Assert.fail();
	   }
}



@Then("user select the authorname")
public void user_select_the_authorname() throws InterruptedException {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/label[3]/select")).isSelected();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to select"+e);
		   Thread.sleep(3000);
		   Assert.fail();
	   }
		   
}

@Then("user click on {string}")
public void user_click_on(String string) {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/fieldset[1]/div/label[3]/select/option[25]")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);
		 Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}


@Then("user enter {string} if not private")
public void user_enter_if_not_private(String password) {
	try {
		WebElement password1 = driver.findElement(By.xpath("//tr[@id='edit-12488']//input[@name='post_password']"));
		password1.sendKeys("Shruti@34");
		Thread.sleep(3000);
				
				System.out.println("passowrd is entered");
	}
	   catch(Exception e) {
		   System.out.println("Not able to enter in add property section"+e);
		   Assert.fail();
		
	   }
}

@Then("user click on checkbox of feature")
public void user_click_on_checkbox_of_feature() {
	try {
		driver.findElement(By.xpath("//tr[@id='edit-12488']//input[@id='in-property_feature-1950']")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);

	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}

@Then("user click the checkbox of region field")
public void user_click_the_checkbox_of_region_field() {
	try {
		driver.findElement(By.xpath("//tr[@id='edit-12488']//input[@id='in-region-1951']")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);
		 Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}

@Then("user click on allow comment")
public void user_click_on_allow_comment() {
	try {
		driver.findElement(By.xpath("//tr[@id='edit-12488']//input[@name='comment_status']")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);
		 Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}

@Then("user select the status field")
public void user_select_the_status_field() throws InterruptedException {
	try {
		driver.findElement(By.xpath("//tr[@id='edit-12488']//select[@name='_status']")).isSelected();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to select"+e);
		   Thread.sleep(3000);
		   Assert.fail();
	   }
}

@Then("user click on the {string} option into drop down list")
public void user_click_on_the_option_into_drop_down_list(String string) {
	try {
		driver.findElement(By.xpath("//tr[@id='edit-12488']//option[@value='publish'][normalize-space()='Published']")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);
		 Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}

@Then("user click on update button")
public void user_click_on_update_button() {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-12488\"]/td/div/button[2]")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);
		 Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
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

@Then("user enter the number of item per page {string}")
public void user_enter_the_number_of_item_per_page(String number) {
	try {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='edit_property_per_page']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='edit_property_per_page']")).sendKeys(number);
		System.out.println("enter number of items per page");
}
catch(Exception e) {
	System.out.println("not able to enter number of items per page");
	Assert.fail();
}
}

@Then("user click apply button")
public void user_click_apply_button() {
	try {
		driver.findElement(By.xpath("//*[@id=\"screen-options-apply\"]")).click();
	   }
	   catch(Exception e) {
		   System.out.println("Not able to click"+e);
		   Assert.fail();
}
}
    

@Then("user navigate to all properties page and able to see in changes in pagination field")
public void user_navigate_to_all_properties_page_and_able_to_see_in_changes_in_pagination_field() {
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

@When("user click the arrow of the title field column")
public void user_click_the_arrow_of_the_title_field_column() {
	 try {
		  WebElement ele =driver.findElement(By.xpath("//th[@id='title']//a"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(ele).build().perform();
		  
		  driver.findElement(By.xpath("//*[@id=\"title\"]/a/span[2]")).click();
		  System.out.println("Able to click on the NAME heading");
		  Thread.sleep(1000);
	  }
	  catch(Exception e) {
		  System.out.println("Not able to click on the NAME heading"+e);
	  	Assert.fail();
	  }
	}


@Then("all title name arrange in ascending order")
public void all_title_name_arrange_in_ascending_order() {
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


@Then("all title name arrange in descending order")
public void all_title_name_arrange_in_descending_order() {
	 try {
		  WebElement ele =driver.findElement(By.xpath("//th[@id='title']//a"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(ele).build().perform();
		  
		  driver.findElement(By.xpath("//*[@id=\"title\"]/a/span[2]")).click();
		  System.out.println("Able to click on the NAME heading");
		  Thread.sleep(1000);
	  }
	  catch(Exception e) {
		  System.out.println("Not able to click on the NAME heading"+e);
	  	Assert.fail();
	  }
}

@When("user click on the arrow of date field")
public void user_click_on_the_arrow_of_date_field() {
	 try {
		  WebElement ele =driver.findElement(By.xpath("//th[@id='date']//a"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(ele).build().perform();
		  
		  driver.findElement(By.xpath("//*[@id=\"date\"]/a/span[2]")).click();
		  System.out.println("Able to click on the NAME heading");
		  Thread.sleep(1000);
	  }
	  catch(Exception e) {
		  System.out.println("Not able to click on the NAME heading"+e);
	  	Assert.fail();
	  }
}

@Then("all date arrange in ascending order")
public void all_date_arrange_in_ascending_order() {
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
@Then("all date arrange in descending order")
public void all_date_arrange_in_descending_order() {
	 try {
		  WebElement ele =driver.findElement(By.xpath("//th[@id='date']//a"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(ele).build().perform();
		  
		  driver.findElement(By.xpath("//*[@id=\"date\"]/a/span[2]")).click();
		  System.out.println("Able to click on the NAME heading");
		  Thread.sleep(1000);
	  }
	  catch(Exception e) {
		  System.out.println("Not able to click on the NAME heading"+e);
	  	Assert.fail();
	  }
}

@When("user click on arrow of comment field")
public void user_click_on_arrow_of_comment_field() {
	 try {
		  WebElement ele =driver.findElement(By.xpath("//th[@id='comments']"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(ele).build().perform();
		  
		  driver.findElement(By.xpath("//*[@id=\"comments\"]/a/span[2]")).click();
		  System.out.println("Able to click on the NAME heading");
	  }
	  catch(Exception e) {
		  System.out.println("Not able to click on the NAME heading"+e);
	  	Assert.fail();
	  }
}

@Then("all comments arrange in ascending")
public void all_comments_arrange_in_ascending() {
	try {
		String expectedtitle=driver.getTitle();
		String actualtitle="Properties ‹ Real Estate — WordPress";
		Assert.assertEquals(expectedtitle,actualtitle);
	}
	 catch(Exception e) {
		   System.out.println("Not able to see"+e);
		   Assert.fail();
}
}

@Then("comments should be arrange in descending order")
public void comments_should_be_arrange_in_descending_order() {
	 try {
		  WebElement ele =driver.findElement(By.xpath("//th[@id='comments']"));
		  Actions obj = new Actions(driver);
		  obj.moveToElement(ele).build().perform();
		  
		  driver.findElement(By.xpath("//*[@id=\\\"comments\\\"]/a/span[2]")).click();
		  System.out.println("Able to click on the NAME heading");
		  Thread.sleep(1000);
	  }
	  catch(Exception e) {
		  System.out.println("Not able to click on the NAME heading"+e);
	  	Assert.fail();
	  }
}

@When("user select the title field of title name")
public void user_select_the_title_field_of_title_name() {
	try {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"post-12488\"]/td[1]/strong/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		System.out.println("hovered the Accomplish ");
	}
	catch(Exception e) {
		System.out.println("user not able to click"+e);
	}
}

@Then("user click on quick edit field")
public void user_click_on_quick_edit_field() {
	try {
		driver.findElement(By.xpath("//a[@aria-label='Quick edit “Accomplish” inline']")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);
		 //Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}

@When("user enter the {string} in password field")
public void user_enter_the_in_password_field(String password1) {
	try {
		WebElement password = driver.findElement(By.xpath("//tr[@id='edit-12488']//input[@name='post_password']"));
		password.sendKeys("Shruti@34");
		//password.sendKeys("Shrutip@6786");
		Thread.sleep(3000);
	    System.out.println("passowrd is entered");
	 // Get the typed value
	 		String typedValue = password.getAttribute("value");
	  
	 		// Get the length of typed value
	 		int size = typedValue.length();
	  
	 		// Assert with expected
	 		if (size <= 10) {
	 			System.out.println("password functionality is working fine.");
	 		}
	  
	 		else {
	 			System.out.println("No limit is set.");
	 			Assert.fail();
	 		}
	}
	   catch(Exception e) {
		   System.out.println("Not able to enter in add property section"+e);
		   Assert.fail();
		
	   }
}

@Then("user click the update button")
public void user_click_the_update_button() {
	try {
		driver.findElement(By.xpath("//tr[@id='edit-12488']//button[@type='button'][normalize-space()='Update']")).click();
		System.out.println("clicked on view option");
		Thread.sleep(3000);
		 Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}


@When("user select title")
public void user_select_title() {
	try {
		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='welcome@123']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		System.out.println("hovered the Accomplish ");
	}
	catch(Exception e) {
		System.out.println("user not able to click"+e);
	}
}

@Then("user click on quick edit which is below the title")
public void user_click_on_quick_edit_which_is_below_the_title() {
	try {
		driver.findElement(By.xpath("//*[@id=\"post-12471\"]/td[1]/div[3]/span[2]/a")).click();
		System.out.println("clicked on quick edit");
		Thread.sleep(1000);
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}


@Then("user enter {string} in title block")
public void user_enter_in_title_block(String titlename) {
    try {
    	driver.findElement(By.xpath("//*[@id=\"edit-12471\"]/td/fieldset[1]/div/label[1]/span[2]/input")).clear();
    	driver.findElement(By.xpath("//*[@id=\"edit-12471\"]/td/fieldset[1]/div/label[1]/span[2]/input")).sendKeys("@#$%&*&&^$");
    	Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(titlename);
		boolean b = m.find();

		if (b) {
			System.out.println("Titlename contains special characters");
			Assert.fail();
		}
		System.out.println("Correct titleName Accepted");
    }
		catch(Exception e) {
			System.out.println("not name accepted"+e);
			 Assert.fail();
		}
		  
}


@Then("user click on the update button of quick edit field")
public void user_click_on_the_update_button_of_quick_edit_field() {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-12471\"]/td/div/button[2]")).click();
		System.out.println("clicked on update button");
		Thread.sleep(3000);
	
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 Assert.fail();
		 
	 }
}

@When("user select  title name on title field column")
public void user_select_title_name_on_title_field_column() {
	try {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"post-13351\"]/td[1]/strong/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		System.out.println("hovered the sunflower ");
	}
	catch(Exception e) {
		System.out.println("user not able to click"+e);
	}
}

@Then("user click on quick edit optin in title field")
public void user_click_on_quick_edit_optin_in_title_field() {
	try {
		driver.findElement(By.xpath("//*[@id=\"post-13351\"]/td[1]/div[3]/span[2]/a")).click();
		System.out.println("clicked on quick edit option");
		Thread.sleep(3000);
		 //Assert.fail();
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 
	 }
}

@When("user enter the {string} in title field")
public void user_enter_the_in_title_field(String titlename) {
	 try {
		 WebElement titlename1 = driver.findElement(By.xpath("//*[@id=\"edit-13351\"]/td/fieldset[1]/div/label[1]/span[2]/input"));
		 titlename1.clear();
		 WebElement titlename11 = driver.findElement(By.xpath("//*[@id=\"edit-13351\"]/td/fieldset[1]/div/label[1]/span[2]/input"));
	     titlename11.sendKeys("jshfbneiururfbvbejwlehfbdhfh3rhu4ghewjh8463tryuegfhgfjvfhdvwuqgfhfhqwfuwe");
	    		Thread.sleep(3000);
	    	    System.out.println("titlename is entered");
	    	 // Get the typed value
	    	 		String typedValue = titlename11.getAttribute("value");
	    	  
	    	 		// Get the length of typed value
	    	 		int size = typedValue.length();
	    	  
	    	 		// Assert with expected
	    	 		if (size <= 30) {
	    	 			System.out.println("titlename functionality is working fine.");
	    	 		}
	    	  
	    	 		else {
	    	 			System.out.println("No limit is set.");
	    	 			Assert.fail();
	    	 		}
	    	}
	    	   catch(Exception e) {
	    		   System.out.println("Not able to enter in add property section"+e);
	    		   Assert.fail();
	    		
	    	   }
}

@Then("user click of that update button")
public void user_click_of_that_update_button() {
	try {
		driver.findElement(By.xpath("//*[@id=\"edit-13351\"]/td/div/button[2]")).click();
		System.out.println("clicked on update button");
		Thread.sleep(3000);
	
	}
	 catch(Exception e) {
		 System.out.println("user not able to click"+e);
		 Assert.fail();
		 
	 }
}

}



