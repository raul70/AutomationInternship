package com.endava.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import com.endava.helpers.DriverHelper;

public class BaseTest {

	public static WebDriver getDriver() {
		return DriverHelper.getDriver();
	}

	public void startApplication(String url) {
		DriverHelper.initConnection();
		getDriver().get(url);
	}

	@AfterTest
	public void closeApplication() {
		getDriver().close();
	}
}
