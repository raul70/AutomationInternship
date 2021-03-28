package com.endava.tests;
import com.endava.screens.ContactUsScreen;
import org.testng.annotations.Test;

import com.endava.screens.HomeScreen;
import com.endava.screens.RegistrationScreen;

public class AP002Test extends BaseTest{

    @Test
    public void openAutomationPracticeWebsite() {
        startApplication("http://automationpractice.com/");
        HomeScreen homeScreen = new HomeScreen();
        ContactUsScreen contactUsScreen = homeScreen.clickContactUs();
        contactUsScreen.clickSubmit();
        contactUsScreen.verifyErrorMessage();

    }


}
