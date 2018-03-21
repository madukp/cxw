package org.cxw.pageobj;

import org.apache.log4j.Logger;
import org.cxw.setup.PropertyFile;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver = SetUp.driver;
    private WebDriverWait wait = SetUp.wait;
    final static Logger logger = Logger.getLogger(LoginPage.class);
    public void typeUsername(String username) {
        By txtUserName = By.xpath(".//*[@id='username']");
        driver.findElement(txtUserName).sendKeys(username);
        System.out.println(driver);
        System.out.println("typeUsername");
    }

    public void typePassword(String pwd) {
        By txtPassword = By.xpath(".//*[@id='password']");
        driver.findElement(txtPassword).sendKeys(pwd);
        System.out.println("typePassword");
    }

    public void clickLoginButton() {
        By btnLogin = By.xpath(".//*[text()='Login']");
        driver.findElement(btnLogin).click();
        System.out.println("clickLoginButton");
    }

    public void selectDefaultClient() {
        By popPuWelcome = By.xpath("//div[@class='modal-body ng-scope']");
        By btnOk = By.xpath("//div[@class='modal-body ng-scope']//div[@class='modal-footer']//button[@class='btn btn-primary']");

        wait.until(ExpectedConditions.presenceOfElementLocated(popPuWelcome));
        wait.until(ExpectedConditions.elementToBeClickable(btnOk));
        driver.findElement(btnOk).click();
        System.out.println("selectDefaultClient");
    }

    public void superAdminLogin() {
        String adminUsername = PropertyFile.readProperty("username");
        String adminPwd = PropertyFile.readProperty("password");

        typeUsername(adminUsername);
        typePassword(adminPwd);
        clickLoginButton();
    }

    public void businessUserLogin(String username, String pwd) {
        typeUsername(username);
        typePassword(pwd);
        clickLoginButton();
    }


}
