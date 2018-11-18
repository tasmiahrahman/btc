package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitation {
	WebDriver dr;
	@Given("^open Browser$")
	public void open_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasmiah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr= new ChromeDriver();
	
	}

	
	@Given("^Navigate to Facebook Url$")
	public void navigate_to_Facebook_Url() throws Throwable {
	   dr.get("https://www.facebook.com/");
	}

	@When("^User type UserId on user Id text box$")
	public void user_type_UserId_on_user_Id_text_box() throws Throwable {
		dr.findElement(By.id("email")).sendKeys("Myeamil");
	}

	@When("^User type password on password box$")
	public void user_type_password_on_password_box() throws Throwable {
	  dr.findElement(By.id("pass")).sendKeys("Mypass"); 
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   dr.findElement(By.id("u_0_2")).click();
	}

	@Then("^User should be in profile page$")
	public void user_should_be_in_profile_page() throws Throwable {
	   System.out.println("I am in Profile page");
	}
	@When("^User type invalid UserId on user Id text box$")
	public void user_type_invalid_UserId_on_user_Id_text_box() throws Throwable {
	   
	}

	@When("^User type invalid password on password box$")
	public void user_type_invalid_password_on_password_box() throws Throwable {
	   
	}

	@Then("^User should not  be able to login profile page$")
	public void user_should_not_be_able_to_login_profile_page() throws Throwable {
	   
	}
	@When("^User type \"([^\"]*)\" on user Id text box# multipal sets of value$")
	public void user_type_on_user_Id_text_box_multipal_sets_of_value(String arg1) throws Throwable {
		dr.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^User type \"([^\"]*)\" on password box# multipal sets of value$")
	public void user_type_on_password_box_multipal_sets_of_value(String arg1) throws Throwable {
		dr.findElement(By.id("pass")).sendKeys(arg1);  
	}
	@When("^User will check login button is enabled or not$")
	public void user_will_check_login_button_is_enabled_or_not() throws Throwable {
	    
	}

	@Then("^Based on the result user should get return true or false\\.$")
	public void based_on_the_result_user_should_get_return_true_or_false() throws Throwable {
	   System.out.println("user is profile page for git"); 
	   System.out.println("This is tasmiah's branch");
	}

}
