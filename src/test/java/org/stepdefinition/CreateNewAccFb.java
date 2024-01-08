package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.poj.FbcreateAccount;
import org.poj.PojoBase;
import io.cucumber.datatable.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateNewAccFb extends PojoBase{

	FbcreateAccount f;
	@Given("TO launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	    launchBrowser();
	    WindowMaximize();
	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		f = new FbcreateAccount();
	    clickBtn(f.getCreateNewAcc());
	}

	@When("To pass the first name in the name feild")
	public void to_pass_the_first_name_in_the_name_feild(DataTable d) throws InterruptedException {
	   Thread.sleep(3000);
	  Map<String, String> m = d.asMap(String.class, String.class);
	   passText(m.get("firstname2"), f.getFname());
	}

	@When("To pass the sur name in the name feild")
	public void to_pass_the_sur_name_in_the_name_feild() {
	    f = new FbcreateAccount();
	    passText("Ravi", f.getLname());
	}

	@When("To pass the emaild id in the email feild")
	public void to_pass_the_emaild_id_in_the_email_feild(DataTable d) {
		List<Map<String, String>> m = d.asMaps();
	    f = new FbcreateAccount();
	    passText(m.get(1).get("password1"), f.getMbname());
	}

	@When("To paas the password in the password feild")
	public void to_paas_the_password_in_the_password_feild() {
	   f = new FbcreateAccount();
	   passText("235465", f.getPaswrd());
	}

	@Then("close the browser")
	public void close_the_browser() {
	    //closeEntireBrowser();
	}


}
