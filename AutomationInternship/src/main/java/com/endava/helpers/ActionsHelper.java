package com.endava.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public enum ActionsHelper {
	INSTANCE;

	WaitHelper waitHelper = WaitHelper.INSTANCE;

	public void clickOn(By element) {
		waitHelper.waitForElementVisibility(element, 30);
		waitHelper.waitForElementToBeClickable(element, 30);
		findElement(element).click();
	}

	public void sendTextToField(By element, String text){
		waitHelper.waitForElementVisibility(element, 30);
		findElement(element).sendKeys(text);

	}

	public String readTextFromField(By element){
		waitHelper.waitForElementVisibility(element, 30);
		return findElement(element).getText();

	}

	public String getElementAttribute(By element, String attribute){
		waitHelper.waitForElementVisibility(element, 30);
		return findElement(element).getAttribute(attribute);
	}

	public WebElement findElement(By element){
		return DriverHelper.getDriver().findElement(element);
	}

	public static void scroll(){
		JavascriptExecutor js = (JavascriptExecutor) DriverHelper.getDriver();
		js.executeScript("window.scrollBy(0,1000)");
	}


}
