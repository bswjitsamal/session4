package com.webtek.test;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.webtek.helper.Log;

public class SelTestCase {

	public WebDriver driver;

	static Random rand = new Random();
	protected static String email = rand.nextInt(100) + "@t.com";

	@BeforeClass
	@Parameters("browser")
	public void SetUp(String browser) throws Exception {
		DOMConfigurator.configure("log4j.xml");
		if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}else if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Biswajit\\Downloads\\chromedriver_win32(2)\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Biswajit\\Downloads\\IEDriverServer_x64_2.45.0\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();

		} else {

			throw new Exception("Browser is not correct");

		}

		driver.get("http://automationpractice.com/index.php");
		Log.info("Openign the browser with the given URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown() {

		captureScreen();
		driver.close();
		driver.quit();
		Log.info("Closing the browser");
	}

	public String captureScreen() {

		String path;
		try {
			WebDriver augmentedDriver = new Augmenter().augment(driver);
			File source = ((TakesScreenshot) augmentedDriver)
					.getScreenshotAs(OutputType.FILE);
			path = "./target/screenshots/" + source.getName();
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			path = "Failed to capture screenshot: " + e.getMessage();
		}
		return path;

	}

}
