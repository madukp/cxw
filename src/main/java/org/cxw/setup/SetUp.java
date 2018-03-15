package org.cxw.setup;

import java.util.concurrent.TimeUnit;

import com.sun.jna.platform.win32.SetupApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetUp {
	private static WebDriver driver;
	private static WebDriverWait wait;
	private static String baseUrl = PropertyFile.readProperty("baseURL");
	private static String driverPath = PropertyFile.readProperty("chrome.driver.path");
	//private static String username = PropertyFile.readProperty("username");
	//private static String password = PropertyFile.readProperty("password");

	public static void setupDriver() {

		// System.setProperty("webdriver.gecko.driver",driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);

		//if(driver == null){
		//	driver = new ChromeDriver();
		//}

		driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		// driver.get(baseUrl);
		driver.get(baseUrl );
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 30);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriverWait getWait() {
		return wait;
	}

	public static void quitDriver() {
		driver.close();
		driver.quit();
	}

	public static void navigateToURL(String url){
		driver.get(url);
	}

	public static void pauseDriver(int i) {

		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
		//driver.wait(i);
		
	}

}
