package org.stepdefinition;

import org.poj.Fbloginpojo;
import org.poj.PojoBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostiveandNegativeoffb extends PojoBase {

	Fbloginpojo f;
	@Given("User to launch the browser and maximize the window")
	public void user_to_launch_the_browser_and_maximize_the_window() {
           launchBrowser();
           WindowMaximize();
	}

	@When("user to launch the url of facebookapplication")
	public void user_to_launch_the_url_of_facebookapplication() {
             launchUrl("https://en-gb.facebook.com/");
	}

	@When("to pass the email {string} in the email feild")
	public void to_pass_the_email_in_the_email_feild(String em) {
          f =  new Fbloginpojo();
          passText(em, f.getEmail());
	}

	@When("to pass the password {string} in the password feild")
	public void to_pass_the_password_in_the_password_feild(String pass) {
          f = new Fbloginpojo();
          passText(pass, f.getPassword());
	}

	@When("to click the login button")
	public void to_click_the_login_button() {
        f = new Fbloginpojo();
        clickBtn(f.getLogin());
	}

	@Then("user to close the browser")
	public void user_to_close_the_browser() {
           closeEntireBrowser();
	}

}
