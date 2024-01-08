package org.stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.poj.PojoBase;

public class Hookeclass extends PojoBase{

	
	@Before
	private void precondition() {
		
      launchBrowser();
      WindowMaximize();
	}
	@After
	private void postcondition() {
		closeEntireBrowser();
	}
}
