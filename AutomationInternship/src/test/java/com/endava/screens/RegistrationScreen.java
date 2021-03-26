package com.endava.screens;

import org.openqa.selenium.By;

import com.endava.helpers.WaitHelper;

public class RegistrationScreen {

	WaitHelper waitHelper = WaitHelper.INSTANCE;
	private static final By createAccount = By.id("SubmitCreate");

	public RegistrationScreen verifyCreateAccountButtonIsPresent() {
		waitHelper.waitForElementVisibility(createAccount, 30);
		return this;
	}
}
