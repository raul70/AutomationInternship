package com.endava.screens;

import com.endava.helpers.ActionsHelper;
import com.endava.helpers.WaitHelper;
import org.openqa.selenium.By;

public class ContactUsScreen {
    private ActionsHelper actionsHelper = ActionsHelper.INSTANCE;
    private WaitHelper waitHelper = WaitHelper.INSTANCE;

    private static final By contactForm = By.className("contact-form-box");
    private static final By errorMessage = By.xpath("//li[contains(text(),'Invalid email address.')]");
    private static final By submitButton = By.xpath("//button[@id='submitMessage']");

    public ContactUsScreen() {
        waitHelper.waitForElementVisibility(contactForm, 30);
    }

    public ContactUsScreen verifyErrorMessageWithEmptyFields() {
        waitHelper.waitForElementVisibility(submitButton, 30);
        return this;
    }

    public ContactUsScreen clickSubmit() {
        actionsHelper.clickOn(submitButton);
        return new ContactUsScreen();
    }


    public ContactUsScreen verifyErrorMessage() {
       waitHelper.waitForElementVisibility(errorMessage, 60);
        return new ContactUsScreen();
    }
}
