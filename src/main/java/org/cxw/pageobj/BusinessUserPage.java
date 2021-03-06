package org.cxw.pageobj;

import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BusinessUserPage {

    private WebDriver driver = SetUp.setupDriver();

    public void CreateBusinessUser() {

        // navigate to Create Business User Page

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
        }


        WebElement administrationMenuItem = driver.findElement(By.xpath("//div[1]/aside/div/ul/li[1]/a"));
        administrationMenuItem.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        WebElement BusinessUserSubmenu = driver.findElement(By.xpath("//a[contains(text(),'Business Users')]"));
        BusinessUserSubmenu.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        WebElement CreateBusinessUserButton = driver.findElement(By.xpath("//button[contains(text(),'Create New Business User')]"));
        CreateBusinessUserButton.click();


        // creating a new business user

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        WebElement BUTitle = driver.findElement(By.xpath("//*[@id='title' and @placeholder='Enter Title ...']"));
        BUTitle.sendKeys("Ms");

        WebElement BUFirstName = driver.findElement(By.xpath("//*[@id='firstName' and @placeholder='Enter First Name ...']"));
        BUFirstName.sendKeys("Ann");

        WebElement BULastName = driver.findElement(By.xpath("//*[@id='lastName' and @placeholder='Enter Last Name ...']"));
        BULastName.sendKeys("Brown");

        String email = "spcicx@gmail.com";
        WebElement BUEmail = driver.findElement(By.xpath("//*[@id='email' and @name='email']"));
        BUEmail.sendKeys(email);

        WebElement BURole = driver.findElement(By.xpath("//div[@id='role' and @name='role']"));
        BURole.click();

        WebElement BURoleSelect = driver.findElement(By.xpath("//span[contains(text(),'Client Admin')]"));
        BURoleSelect.click();

        WebElement SaveBUButton = driver.findElement(By.xpath("//button[@class='btn btn-primary' and contains(text(),'Save')]"));
        SaveBUButton.click();
    }

    //Search a business user

    public void SearchBusinessUser(String email) {

        // navigate Business User  List Page

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
        }


        By administrationMenuItem = By.xpath("//div[1]/aside/div/ul/li[1]/a");
        driver.findElement(administrationMenuItem).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        By businessUserSubmenu = By.xpath("//a[contains(text(),'Business Users')]");
        driver.findElement(businessUserSubmenu).click();

        By txtSearchBU = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid' and @placeholder='Search Business Users']");
        driver.findElement(txtSearchBU).sendKeys(email);

        By btnSearchBU = By.xpath("//button[@class='btn btn-default' and @ng-click='searchManager.search()']");
        driver.findElement(btnSearchBU).click();

    }


    //Edit business user

    public void EditBusinessUser(){


        By btnEditBU= By.xpath("//a[@aet-has-permission='EDIT_BUSINESS_USER' and @title='edit']");
        driver.findElement(btnEditBU).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        By drpdwnBURole = By.xpath("//div[@id='role' and @name='role']");
        driver.findElement(drpdwnBURole).click();

        By SelectBURole = By.xpath("//span[contains(text(),'General User')]");
        driver.findElement(SelectBURole).click();

        By btnSaveBU = By.xpath("//button[@class='btn btn-primary' and contains(text(),'Save')]");
        driver.findElement(btnSaveBU).click();

    }

    //Delete business user

    public void DeleteBusinessUser(String email){

        // navigate Business User  List Page

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}


        WebElement BusinessUserSubmenu = driver.findElement(By.xpath("//a[contains(text(),'Business Users')]"));
        BusinessUserSubmenu.click();

        //Search business user with the email

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}


        By txtSearchBU = By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid' and @placeholder='Search Business Users']");
        driver.findElement(txtSearchBU).sendKeys(email);

        By btnSearchBU = By.xpath("//button[@class='btn btn-default' and @ng-click='searchManager.search()']");
        driver.findElement(btnSearchBU).click();

        //Delete user
        By btnDeleteBU= By.xpath("//a[@aet-has-permission='DELETE_BUSINESS_USER' and @title='delete']");
        driver.findElement(btnDeleteBU).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        By popupDeleteBU= By.xpath("//button[@class='btn btn-default btn-danger' and contains(text(), 'Delete')]");
        driver.findElement(popupDeleteBU).click();


    }

}
