package com.endava.tests;

import com.endava.helpers.ActionsHelper;
import com.endava.models.Gender;
import com.endava.screens.HomeScreen;
import com.endava.screens.RegistrationPersonalInformationScreen;
import com.endava.screens.RegistrationScreen;
import org.testng.annotations.Test;

public class AP003Test extends BaseTest {
    String emailAddress = "m_elena26@yahoo.com";
    String firstName = "Elena";
    String lastName = "Bizau";
    String password = "pa1225525s";
    Gender gender = Gender.MRS;
    String day = "29";
    String month = "3";
    String year = "1997";
    String company = "Co0";
    @Test

    public void openAutomationPracticeWebsite() {
        startApplication("http://automationpractice.com/");
        HomeScreen homeScreen = new HomeScreen();
        RegistrationScreen registrationScreen = homeScreen.initiateRegistration();
        registrationScreen.enterEmailAddress(emailAddress);
        registrationScreen.initiateCreateAccount();
        RegistrationPersonalInformationScreen registrationPersonalInformationScreen = registrationScreen.initiateCreateAccount();
        registrationPersonalInformationScreen.verifyEmailAddress(emailAddress);
        ActionsHelper.scroll();
//        registrationPersonalInformationScreen.completeForm();
        registrationPersonalInformationScreen.chooseGender(gender);
        registrationPersonalInformationScreen.verifyGender(gender);
        registrationPersonalInformationScreen.enterFirstName(firstName);
        registrationPersonalInformationScreen.verifyFirstName(firstName);
        registrationPersonalInformationScreen.enterLastName(lastName);
        registrationPersonalInformationScreen.verifyLastName(lastName);
        registrationPersonalInformationScreen.enterPassword(password);
        registrationPersonalInformationScreen.verifyPassword(password);
        registrationPersonalInformationScreen.chooseDay(day);
        registrationPersonalInformationScreen.chooseMonth(month);
        registrationPersonalInformationScreen.chooseYear(year);
        registrationPersonalInformationScreen.signUpNewsletter();
        registrationPersonalInformationScreen.verifyNewsletter();
        registrationPersonalInformationScreen.receiveOffers();
        registrationPersonalInformationScreen.verifyOffers();
        //'Your Address' section
        registrationPersonalInformationScreen.verifyFirstNameFromAddress();
        registrationPersonalInformationScreen.verifyLastNameFromAddress();
        registrationPersonalInformationScreen.enterCompany(company);
        registrationPersonalInformationScreen.verifyCompanyText(company);

    }
}