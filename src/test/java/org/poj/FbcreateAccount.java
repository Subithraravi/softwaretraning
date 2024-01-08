package org.poj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FbcreateAccount extends PojoBase{
//constructor method
	public FbcreateAccount() {
		PageFactory.initElements(driver, this);
	}
	//set method 
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement CreateNewAcc;
	
	@FindBy(xpath = "//input[@aria-label='First name']")
	private WebElement Fname;
	
	@FindBy(xpath = "//input[@aria-label='Surname']")
	 private WebElement Lname;
	
	@FindBy(name = "reg_email__")
     private WebElement mbname;
	
	@FindBy(name = "reg_passwd__")
	private WebElement paswrd;

	public WebElement getCreateNewAcc() {
		return CreateNewAcc;
	}

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getMbname() {
		return mbname;
	}

	public WebElement getPaswrd() {
		return paswrd;
	}
	

}
