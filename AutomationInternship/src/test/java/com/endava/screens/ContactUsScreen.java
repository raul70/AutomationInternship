package com.endava.screens;

import org.openqa.selenium.By;

import com.endava.helpers.ActionsHelper;
import com.endava.helpers.WaitHelper;

public class ContactUsScreen extends BaseScreen{

	// elements
	private static final By submitButton = By.id("submitMessage");
	private static final By validationError = By.className("alert-danger");

	public ContactUsScreen submitContactUsForm() {
		actionsHelper.clickOn(submitButton);
		return this;
	}

	public ContactUsScreen verifyValidationErrorIsDisplayed() {
		waitHelper.waitForElementVisibility(validationError, 5);
		return this;
	}
}
