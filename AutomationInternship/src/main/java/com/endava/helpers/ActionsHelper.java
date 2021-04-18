package com.endava.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public enum ActionsHelper {
	INSTANCE;

	WaitHelper waitHelper = WaitHelper.INSTANCE;

	public void clickOn(By element) {
		waitHelper.waitForElementVisibility(element, 30);
		waitHelper.waitForElementToBeClickable(element, 30);
		getDriver().findElement(element).click();
	}

	public void sendTextToField(By element, String text){
		waitHelper.waitForElementVisibility(element, 30);
		clearText(element);
        getDriver().findElement(element).sendKeys(text);

	}

	public String readTextFromField(By element){
		waitHelper.waitForElementVisibility(element, 30);
		return getDriver().findElement(element).getText();

	}

	public String getElementAttribute(By element, String attribute){
		waitHelper.waitForElementVisibility(element, 30);
		return getDriver().findElement(element).getAttribute(attribute);
	}

	private WebDriver getDriver(){
		return DriverHelper.getDriver();
	}


	public static void scroll(){
		JavascriptExecutor js = (JavascriptExecutor) DriverHelper.getDriver();
		js.executeScript("window.scrollBy(0,1000)");
	}

	public static void clearText(By element){
		DriverHelper.getDriver().findElement(element).clear();
	}

}
