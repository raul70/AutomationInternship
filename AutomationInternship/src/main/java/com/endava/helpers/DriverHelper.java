package com.endava.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverHelper {

	public static WebDriver driver = null;
	private static ChromeOptions chOptions = null;

	private static WebDriver createNewDriver() {
		if (driver == null) {
			String localDirectory = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", localDirectory + "\\src\\main\\resources\\chromedriver.exe");
			chOptions = new ChromeOptions();
			chOptions.addArguments("disable-infobars");
			chOptions.addArguments("--start-maximized");
			chOptions.addArguments("--disable-notifications");
			chOptions.addArguments("--disable-extensions");
			driver = new ChromeDriver(chOptions);
		}
		return driver;
	}

	public static void initConnection() {
		createNewDriver();
	}

	public static WebDriver setDriverToNull() {
		driver = null;
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
