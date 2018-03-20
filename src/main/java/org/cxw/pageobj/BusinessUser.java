package org.cxw.pageobj;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.cxw.setup.Common;
import org.cxw.setup.PropertyFile;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessUser extends SetUp {

    WebDriver driver = super.getDriver();
    //WebDriverWait wait = super.getWait();
	
	// Test Comment 1
	
	// Test Comment 2

    public void CreateBusinessUser(){

        // navigate to Create Business User Page

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {}


        WebElement administrationMenuItem = driver.findElement(By.xpath("//div[1]/aside/div/ul/li[1]/a"));
        administrationMenuItem.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        WebElement BusinessUserSubmenu = driver.findElement(By.xpath("//a[contains(text(),'Business Users')]"));
        BusinessUserSubmenu.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        WebElement CreateBusinessUserButton = driver.findElement(By.xpath("//button[contains(text(),'Create New Business User')]"));
        CreateBusinessUserButton.click();


        // creating a new business user

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        WebElement BUTitle = driver.findElement(By.xpath("//*[@id='title' and @placeholder='Enter Title ...']"));
        BUTitle.sendKeys("Ms");

        WebElement BUFirstName = driver.findElement(By.xpath("//*[@id='firstName' and @placeholder='Enter First Name ...']"));
        BUFirstName.sendKeys("Ann");

        WebElement BULastName = driver.findElement(By.xpath("//*[@id='lastName' and @placeholder='Enter Last Name ...']"));
        BULastName.sendKeys("Brown");

        WebElement BUEmail = driver.findElement(By.xpath("//*[@id='email' and @name='email']"));
        BUEmail.sendKeys("spcicx@gmail.com");

        WebElement BURole = driver.findElement(By.xpath("//div[@id='role' and @name='role']"));
        BURole.click();

        WebElement BURoleSelect = driver.findElement(By.xpath("//span[contains(text(),'Client Admin')]"));
        BURoleSelect.click();

        WebElement SaveBUButton = driver.findElement(By.xpath("//button[@class='btn btn-primary' and contains(text(),'Save')]"));
        SaveBUButton.click();


    }

    //Search a business user

    public static void SearchBusinessUser(){

        // navigate Business User  List Page

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {}


        WebElement administrationMenuItem = getDriver().findElement(By.xpath("//div[1]/aside/div/ul/li[1]/a"));
        administrationMenuItem.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        WebElement BusinessUserSubmenu = getDriver().findElement(By.xpath("//a[contains(text(),'Business Users')]"));
        BusinessUserSubmenu.click();





    }

}
