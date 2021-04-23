package com.endava.tests;

import com.endava.helpers.ConfigHelper;
import org.testng.annotations.Test;

import com.endava.screens.HomeScreen;
import com.endava.screens.RegistrationScreen;

public class AP001Test extends BaseTest {

	@Test
	public void openAutomationPracticeWebsite() {
		startApplication(ConfigHelper.INSTANCE.getURL());
		HomeScreen homeScreen = new HomeScreen();
		RegistrationScreen registrationScreen = homeScreen.initiateRegistration();
		registrationScreen.verifyCreateAccountButtonIsPresent();
	}
}
