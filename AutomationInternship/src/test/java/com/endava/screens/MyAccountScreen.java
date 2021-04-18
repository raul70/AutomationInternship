package com.endava.screens;

import com.endava.helpers.ActionsHelper;
import com.endava.helpers.WaitHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyAccountScreen {

    WaitHelper waitHelper = WaitHelper.INSTANCE;
    ActionsHelper actionsHelper = ActionsHelper.INSTANCE;

    public static final By wellcomeText = By.xpath("//p[@class='info-account']");

    public MyAccountScreen(){
       waitHelper.waitForElementVisibility(wellcomeText, 10);
    }

    public MyAccountScreen verifyAccountMessage(String text){
        String extractedText = actionsHelper.readTextFromField(wellcomeText);
        Assert.assertEquals(extractedText, text);
        return this;
    }
}
