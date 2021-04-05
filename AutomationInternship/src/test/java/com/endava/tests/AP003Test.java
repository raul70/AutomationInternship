package com.endava.tests;

import com.endava.screens.HomeScreen;
import com.endava.screens.RegistrationPersonalInformationScreen;
import com.endava.screens.RegistrationScreen;
import org.testng.annotations.Test;

public class AP003Test extends BaseTest {
    String emailAddress = "email@yahoo.com";
    @Test

    public void openAutomationPracticeWebsite() {
        startApplication("http://automationpractice.com/");
        HomeScreen homeScreen = new HomeScreen();
        RegistrationScreen registrationScreen = homeScreen.initiateRegistration();
        registrationScreen.enterEmailAddress(emailAddress);
        registrationScreen.initiateCreateAccount();
        RegistrationPersonalInformationScreen registrationPersonalInformationScreen = registrationScreen.initiateCreateAccount();
        registrationPersonalInformationScreen.verifyEmailAddress(emailAddress);

    }
}