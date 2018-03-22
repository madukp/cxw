package org.cxw.pageobj;

import org.apache.log4j.Logger;
import org.cxw.setup.PropertyFile;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait = SetUp.wait;
    final static Logger logger = Logger.getLogger(LoginPage.class);

    public void launchBrowser(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        driver =  SetUp.setupDriver();
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
        By popUpWelcome = By.xpath("//div[@class='modal-body ng-scope']");
        By btnOk = By.xpath("//div[@class='modal-body ng-scope']//div[@class='modal-footer']//button[@class='btn btn-primary']");

        wait.until(ExpectedConditions.presenceOfElementLocated(popUpWelcome));
        wait.until(ExpectedConditions.elementToBeClickable(btnOk));
        driver.findElement(btnOk).click();
        System.out.println("selectDefaultClient");
    }

    public void logout() {
        By dropDownLogout = By.xpath(".//*[@id='nav-bar']/div/ul[2]/li/a");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(dropDownLogout).click();

        By Logout = By.xpath(".//*[@id='nav-bar']/div/ul[2]/li/ul/li[3]/a");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(Logout).click();
    }
}
