package org.cxw.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetUp {

    public static WebDriver driver = setupDriver();
    public static WebDriverWait wait = setupWait();

    private static WebDriver setupDriver() {
        if (driver == null) {
            String driverPath = PropertyFile.readProperty("chrome.driver.path");
            System.setProperty("webdriver.chrome.driver", driverPath);

            WebDriver driver = new ChromeDriver();
            // driver = new FirefoxDriver();
            // driver.get(baseUrl);
            String baseUrl = PropertyFile.readProperty("baseURL");
            driver.get(baseUrl);
            driver.manage().window().maximize();
            return driver;
        } else {
            return driver;
        }
    }

    private static WebDriverWait setupWait() {
        return new WebDriverWait(driver, 30);
    }

    public void quitDriver() {
        driver.close();
        driver.quit();
    }

    public void navigateToURL(String url) {
        driver.get(url);
    }

    public void pauseDriver(int i) {
        driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
    }

}
