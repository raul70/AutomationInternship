package com.endava.screens;

import com.endava.helpers.ActionsHelper;
import com.endava.helpers.WaitHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPersonalInformationScreen {
    WaitHelper waitHelper = WaitHelper.INSTANCE;
    ActionsHelper actionsHelper = ActionsHelper.INSTANCE;

    public static final By emailAddress = By.id("email");

//    public void verifyEmailAddress(String text){
//     String extractedText = actionsHelper.readTextFromField(emailAddress);
//        Assert.assertEquals(extractedText, text);
//    }
//    v

    public void verifyEmailAddress(String text){
        waitHelper.waitFor(2000);
        String extractedAttribute = actionsHelper.getElementAttribute(emailAddress, "value");
        Assert.assertEquals(extractedAttribute, text);
    }
}
