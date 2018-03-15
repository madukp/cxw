package org.cxw.pageobj;

import org.cxw.setup.PropertyFile;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends SetUp {

    WebDriver driver = super.getDriver();
    WebDriverWait wait = super.getWait();

    private void typeUsername(String username) {
        By txtUserName = By.xpath(".//*[@id='username']");
        System.out.println("typeUsername");
        driver.findElement(txtUserName).sendKeys(username);
    }

    private void typePassword(String pwd) {
        By txtPassword = By.xpath(".//*[@id='password']");
        System.out.println("typePassword");
        driver.findElement(txtPassword).sendKeys(pwd);
    }

    private void clickLoginButton() {
        By btnLogin = By.xpath(".//*[text()='Login']");
        System.out.println("clickLoginButton");
        driver.findElement(btnLogin).click();
    }

    private void selectDefaultClient() {
        By popPuWelcome = By.xpath("//div[@class='modal-body ng-scope']");
        System.out.println("selectDefaultClient");
        By btnOk = By.xpath("//div[@class='modal-body ng-scope']//div[@class='modal-footer']//button[@class='btn btn-primary']");
        //By btnOk = By.xpath(".//*[text()='OK']");

        wait.until(ExpectedConditions.presenceOfElementLocated(popPuWelcome));
        wait.until(ExpectedConditions.elementToBeClickable(btnOk));
        driver.findElement(btnOk).click();
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
