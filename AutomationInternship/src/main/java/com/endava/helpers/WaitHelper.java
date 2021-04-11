package com.endava.helpers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public enum WaitHelper {
	INSTANCE;

	private Wait<WebDriver> newWait(WebDriver driver, int timeout) {
		return new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofMillis(500));
	}

	private void waitForElement(ExpectedCondition<?> condition, int timeout) {
		newWait(DriverHelper.getDriver(), timeout).until(condition);
	}

	public void waitForElementVisibility(By element, int timeout) {
		waitForElement(ExpectedConditions.visibilityOfElementLocated(element), timeout);
	}

	public void waitForElementToBeClickable(By element, int timeout) {
		waitForElement(ExpectedConditions.elementToBeClickable(element), timeout);
	}

	public void waitForElementToBeClickable(WebElement element, int timeout) {
		waitForElement(ExpectedConditions.elementToBeClickable(element), timeout);
	}

	public void waitFor(int intervalMs){
		try{
			Thread.sleep(intervalMs);
		}
		catch (InterruptedException e){
			Thread.interrupted();
		}
	}


}
