package com.endava.screens;

import org.openqa.selenium.By;

import com.endava.helpers.ActionsHelper;
import com.endava.helpers.WaitHelper;

public class HomeScreen extends BaseScreen {

	// elements
	private static final By signInButton = By.className("login");
	private static final By imageContainer = By.id("homeslider");
	private static final By contactUsButton = By.id("contact-link");

	public HomeScreen() {
		waitHelper.waitForElementVisibility(imageContainer, 30);
	}

	public RegistrationScreen initiateRegistration() {
		actionsHelper.clickOn(signInButton);
		return new RegistrationScreen();
	}

	public ContactUsScreen navigateToContactUs() {
		actionsHelper.clickOn(contactUsButton);
		return new ContactUsScreen();
	}
}
