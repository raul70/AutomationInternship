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
}
