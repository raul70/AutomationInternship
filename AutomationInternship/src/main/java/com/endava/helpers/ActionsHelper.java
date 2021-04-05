package com.endava.helpers;

import org.openqa.selenium.By;

public enum ActionsHelper {
	INSTANCE;

	WaitHelper waitHelper = WaitHelper.INSTANCE;

	public void clickOn(By element) {
		waitHelper.waitForElementVisibility(element, 30);
		waitHelper.waitForElementToBeClickable(element, 30);
		DriverHelper.getDriver().findElement(element).click();
	}

	public void sendTextToField(By element, String text){
		waitHelper.waitForElementVisibility(element, 30);
		DriverHelper.getDriver().findElement(element).sendKeys(text);

	}

	public String readTextFromField(By element){
		waitHelper.waitForElementVisibility(element, 30);
		return DriverHelper.getDriver().findElement(element).getText();

	}

	public String getElementAttribute(By element, String attribute){
		waitHelper.waitForElementVisibility(element, 30);
		return DriverHelper.getDriver().findElement(element).getAttribute(attribute);
	}
}
