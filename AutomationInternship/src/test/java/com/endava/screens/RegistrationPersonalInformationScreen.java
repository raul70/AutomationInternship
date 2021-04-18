package com.endava.screens;

import com.endava.helpers.ActionsHelper;
import com.endava.helpers.DriverHelper;
import com.endava.helpers.WaitHelper;
import com.endava.models.Gender;
import com.sun.deploy.security.SelectableSecurityManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPersonalInformationScreen {
    WaitHelper waitHelper = WaitHelper.INSTANCE;
    ActionsHelper actionsHelper = ActionsHelper.INSTANCE;

    public static final By emailAddress = By.id("email");
    public static final By mrsGender = By.xpath("//div[@id='uniform-id_gender2']");
    public static final By mrGender = By.xpath("//div[@id='uniform-id_gender1']");
    public static final By mrsGenderAssert = By.xpath("//div[@id='uniform-id_gender2']/span");
    public static final By mrGenderAssert = By.xpath("//div[@id='uniform-id_gender2']/span");
    public static final By firstName = By.id("customer_firstname");
    public static final By lastName = By.id("customer_lastname");
    public static final By password = By.id("passwd");
    public static final By passAssert = By.xpath("//div[contains(@class,'form-error') and contains(@class,'password')]");
    public static final By day = By.id("days");
    public static final By month = By.id("months");
    public static final By year = By.id("years");
    public static final By newsletter = By.id("uniform-newsletter");
    public static final By newsletterAssert = By.xpath("//div[@id='uniform-newsletter']/span");
    public static final By offers = By.id("uniform-optin");
    public static final By offersAssert = By.xpath("//div[@id='uniform-optin']/span");

    //'Your Address' section
    public static final By firstNameAddress = By.xpath("//input[@id='firstname']");
    public static final By lastNameAddress = By.xpath("//input[@id='lastname']");
    public static final By company = By.id("company");
    public static final By address = By.id("address1");
    public static final By city = By.id("city");
    public static final By state = By.id("id_state");
    public static final By phone = By.id("phone_mobile");
    public static final By aliasAddress = By.id("alias");
    public static final By submitButton = By.id("submitAccount");
    public static final By zipCode = By.id("postcode");



    public void verifyEmailAddress(String text) {
        waitHelper.waitFor(5000);
        String extractedAttribute = actionsHelper.getElementAttribute(emailAddress, "value");
        Assert.assertEquals(extractedAttribute, text);
    }

    public void chooseGender(Gender gender) {
        By elementToClick;

        if (gender == Gender.MRS) {
            elementToClick = mrsGender;
        } else {
            elementToClick = mrGender;
        }
        actionsHelper.clickOn(elementToClick);


    }

    public void verifyGender(Gender gender) {
        By elementToAssert;
        if (gender == Gender.MRS) {
            elementToAssert = mrsGenderAssert;
        } else {
            elementToAssert = mrGenderAssert;
        }
        String extractedClass = actionsHelper.getElementAttribute(elementToAssert, "class");
        Assert.assertEquals(extractedClass, "checked");

    }

    public void enterFirstName(String firstNameText) {
        actionsHelper.sendTextToField(firstName, firstNameText);
    }

    public void verifyFirstName(String firstNameText) {
        waitHelper.waitFor(1000);
//        String extractedFirstName = actionsHelper.readTextFromField(firstName);
        String extractedFirstName = actionsHelper.getElementAttribute(firstName, "value");
        Assert.assertEquals(extractedFirstName, firstNameText);
    }

    public void enterLastName(String lastNameText) {
        actionsHelper.sendTextToField(lastName, lastNameText);
    }

    public void verifyLastName(String lastNameText) {
        waitHelper.waitFor(1000);
//        String extractedLastName = actionsHelper.readTextFromField(lastName);
        String extractedLastName = actionsHelper.getElementAttribute(lastName, "value");
        Assert.assertEquals(extractedLastName, lastNameText);
    }

    public void chooseDay(String dayValue) {
        Select drpDays = new Select(DriverHelper.getDriver().findElement(day));
        drpDays.selectByValue(dayValue);
        waitHelper.waitFor(2000);
    }

    public void chooseMonth(String monthValue) {
        Select drpMonth = new Select(DriverHelper.getDriver().findElement(month));
        drpMonth.selectByValue(monthValue);
        waitHelper.waitFor(2000);
    }

    public void chooseYear(String yearValue) {
        Select drpYear = new Select(DriverHelper.getDriver().findElement(year));
        drpYear.selectByValue(yearValue);
        waitHelper.waitFor(2000);
    }

    public void signUpNewsletter() {
        actionsHelper.clickOn(newsletter);
    }

    public void verifyNewsletter() {
        String className = actionsHelper.getElementAttribute(newsletterAssert, "class");
        Assert.assertEquals(className, "checked");
    }

    public void receiveOffers() {
        actionsHelper.clickOn(offers);
    }

    public void verifyOffers() {
        String className = actionsHelper.getElementAttribute(offersAssert, "class");
        Assert.assertEquals(className, "checked");
    }

    public void enterPassword(String passwordText) {
        actionsHelper.sendTextToField(password, passwordText);
    }

    public void verifyPassword(String passwordText) {
        String error = "required password form-group form-error";
        String text = actionsHelper.getElementAttribute(password, "value");
        if (passwordText.length() >= 5) {
            Assert.assertEquals(text, passwordText);
        } else {
            String className = actionsHelper.getElementAttribute(passAssert, "class");
            Assert.assertEquals(className, error);
        }

    }

    //'Your Address' Section

    public void verifyFirstNameFromAddress(){
        if(actionsHelper.readTextFromField(firstNameAddress).equals(actionsHelper.getElementAttribute(firstName, "value"))){
            Assert.assertEquals(firstNameAddress, firstName);
        }
    }

    public void verifyLastNameFromAddress(){
        if(actionsHelper.readTextFromField(lastNameAddress).equals(actionsHelper.getElementAttribute(lastName, "value"))){
            Assert.assertEquals(lastNameAddress, lastName);
        }
    }

    public void enterCompany(String companyText){
        actionsHelper.sendTextToField(company, companyText);
    }

    public void verifyCompanyText(String companyText) {

        Assert.assertTrue(companyText.length() >= 3);
        Assert.assertEquals(companyText, actionsHelper.getElementAttribute(company, "value"));
        waitHelper.waitFor(2000);
    }
    public RegistrationPersonalInformationScreen enterAddress(String addressText){
        actionsHelper.sendTextToField(address, addressText);
        return this;
    }
    public RegistrationPersonalInformationScreen enterCity(String cityText){
        actionsHelper.sendTextToField(city, cityText);
        return this;
    }

    public void chooseState(String stateValue) {
        Select drpState = new Select(DriverHelper.getDriver().findElement(state));
        drpState.selectByValue(stateValue);
        waitHelper.waitFor(2000);
    }

    public RegistrationPersonalInformationScreen enterPhoneNumber(String phoneNumber){
        actionsHelper.sendTextToField(phone, phoneNumber);
        return this;
    }

    public RegistrationPersonalInformationScreen enterAlisAddress(String alias){
        actionsHelper.sendTextToField(aliasAddress, alias);
        return this;
    }

   public MyAccountScreen submitWithSuccess(){
        actionsHelper.clickOn(submitButton);
        return new MyAccountScreen();
   }

    public RegistrationPersonalInformationScreen enterZipCode(String zipCodeText) {
        actionsHelper.sendTextToField(zipCode, zipCodeText);
        return this;
    }
}





