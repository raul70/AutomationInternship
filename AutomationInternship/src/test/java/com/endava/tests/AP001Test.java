package com.endava.tests;

import org.testng.annotations.Test;

import com.endava.screens.HomeScreen;
import com.endava.screens.RegistrationScreen;

public class AP001Test extends BaseTest {

	@Test
	public void openAutomationPracticeWebsite() {
		startApplication("http://automationpractice.com/");
		HomeScreen homeScreen = new HomeScreen();
		RegistrationScreen registrationScreen = homeScreen.initiateRegistration();
		registrationScreen.verifyCreateAccountButtonIsPresent();
	}
}
