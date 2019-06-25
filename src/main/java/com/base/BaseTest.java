package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public static WebDriver driver;

	public static void setUp(String browserName) {

		switch (browserName) {

		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//src//main//java//com.drivers//chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "FireFox":
			System.setProperty("webdrive.gecko.driver", System.getProperty("user.dir") + "geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Browser invalid");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = "http://ce515:vAmcX@1329.12@192.168.2.132:100/";
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
