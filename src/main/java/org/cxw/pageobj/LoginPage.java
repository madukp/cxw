package org.cxw.pageobj;

import org.cxw.setup.PropertyFile;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends SetUp {

    WebDriver driver = getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);

    private void typeUsername(String username) {
        By txtUserName = By.xpath(".//*[@id='username']");
        driver.findElement(txtUserName).sendKeys(username);
    }

    private void typePassword(String pwd) {
        By txtPassword = By.xpath(".//*[@id='password']");
        driver.findElement(txtPassword).sendKeys(pwd);
    }

    private void clickLoginButton() {
        By btnLogin = By.xpath(".//*[text()='Login']");
        driver.findElement(btnLogin).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    private void selectDefaultClient() {
        By popPuWelcome = By.xpath("//div[@class='modal-body ng-scope']");
        By btnOk = By.xpath("//div[@class='modal-body ng-scope']//div[@class='modal-footer']//button[@class='btn btn-primary']");

        //wait.until(ExpectedConditions.presenceOfElementLocated(popPuWelcome));
        //driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        if (driver.findElement(popPuWelcome).isDisplayed()) {
            driver.findElement(btnOk).click();
        }
        else
            System.out.println("Could not identify the Welcome Pop-up");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void superAdminLogin() {
        String adminUsername = PropertyFile.readProperty("username");
        String adminPwd = PropertyFile.readProperty("password");

        typeUsername(adminUsername);
        typePassword(adminPwd);
        clickLoginButton();
        selectDefaultClient();
    }

    public void businessUserLogin(String username, String pwd) {
        typeUsername(username);
        typePassword(pwd);
        clickLoginButton();
        selectDefaultClient();
    }


}
