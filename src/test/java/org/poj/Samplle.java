package org.poj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Samplle extends PojoBase {

	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		WindowMaximize();

		Fbloginpojo f = new Fbloginpojo();
		passText("selijum", f.getEmail());
		passText("356e35", f.getPassword());

		driver.navigate().refresh();

		passText("suvutgrej", f.getEmail());
		passText("2124672465", f.getPassword());

	}
}
