package com.endava.tests;

import org.testng.annotations.Test;

import com.endava.screens.ContactUsScreen;
import com.endava.screens.HomeScreen;

public class AP0002Test extends BaseTest {

	@Test
	public void verifyContactUsFormValidations() {
		startApplication("http://automationpractice.com/");
		HomeScreen homeScreen = new HomeScreen();
		ContactUsScreen contactUsScreen = homeScreen.navigateToContactUs();
		contactUsScreen = contactUsScreen.submitContactUsForm();
		contactUsScreen.verifyValidationErrorIsDisplayed();
	}
}
