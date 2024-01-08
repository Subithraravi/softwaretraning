package org.stepdefinition;


import org.poj.Fbloginpojo;
import org.poj.PojoBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleCucumber extends PojoBase {

	Fbloginpojo f;
	@Given("To Launch The Chrome Browser and Maximise Window")
	public void to_Launch_The_Chrome_Browser_and_Maximise_Window() {
	    launchBrowser();
	    WindowMaximize();
	}
	@When("to launch the url of facebookapplication")
	public void to_launch_the_url_of_facebookapplication() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@Given("To Pass The valid Username In Email Field")
	public void to_Pass_The_valid_Username_In_Email_Field() {
	    f = new Fbloginpojo();
	    passText("selinium", f.getEmail());
	}

	@Given("To Pass The Valid Password In Password Feild")
	public void to_Pass_The_Valid_Password_In_Password_Feild() {
		f = new Fbloginpojo();
		passText("", f.getPassword());
	}

	@Given("To click The Login button")
	public void to_click_The_Login_button() {
	    f = new Fbloginpojo();
	    clickBtn(f.getLogin());
	}

	@Given("To check wheather navigate to the login page or not")
	public void to_check_wheather_navigate_to_the_login_page_or_not() {
	   System.out.println("to check your login crentials");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}


	
}
