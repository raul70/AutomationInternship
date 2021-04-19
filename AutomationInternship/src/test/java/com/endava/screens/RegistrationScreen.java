package com.endava.screens;

import com.endava.helpers.ActionsHelper;
import org.openqa.selenium.By;

import com.endava.helpers.WaitHelper;

public class RegistrationScreen extends BaseScreen{

	private static final By createAccount = By.id("SubmitCreate");
	private static final By emailAddress = By.id("email_create");


	public RegistrationScreen verifyCreateAccountButtonIsPresent() {
		waitHelper.waitForElementVisibility(createAccount, 30);
		return this;
	}

	public RegistrationScreen enterEmailAddress(String email){
		actionsHelper.sendTextToField(emailAddress, email);
		return this;
	}

	public RegistrationPersonalInformationScreen initiateCreateAccount(){
		actionsHelper.clickOn(createAccount);
		return new RegistrationPersonalInformationScreen();
	}

}
