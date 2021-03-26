package com.endava.screens;

import org.openqa.selenium.By;

import com.endava.helpers.ActionsHelper;
import com.endava.helpers.WaitHelper;

public class HomeScreen {

	private ActionsHelper actionsHelper = ActionsHelper.INSTANCE;
	private WaitHelper waitHelper = WaitHelper.INSTANCE;
	// elements
	private static final By signInButton = By.className("login");
	private static final By imageContainer = By.id("homeslider");

	public HomeScreen() {
		waitHelper.waitForElementVisibility(imageContainer, 30);
	}

	public RegistrationScreen initiateRegistration() {
		actionsHelper.clickOn(signInButton);
		return new RegistrationScreen();
	}
}
