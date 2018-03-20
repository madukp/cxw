package org.cxw.pageobj;

import org.cxw.setup.Common;
import org.cxw.setup.SetUp;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientPage {

    private WebDriver driver = SetUp.driver;
    private WebDriverWait wait = SetUp.wait;
    private Common cmn = new Common();

    public void clickLeftNavAdministration() {
        By leftNavAdministration = By.xpath(".//a[contains(text(),'Administration')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavAdministration));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(leftNavAdministration).click();
        System.out.println("clickLeftNavAdministration");
    }

    public void clickLeftNavClients() {
        By leftNavClients = By.xpath(".//a[contains(text(),'Clients')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavClients));
        driver.findElement(leftNavClients).click();
        System.out.println("clickLeftNavClients");
    }

    public void clickCreateNewClientBtn() {
        By btnCreateNewClient = By.xpath("//button[contains(text(),'Create New Client')]");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(btnCreateNewClient).click();
        System.out.println("clickCreateNewClientBtn");
    }

    public void fillClientDetails() {
        String rand = cmn.generateUUID().toString().substring(0, 5);
        By txtClientName = By.xpath(".//*[@id='name']");
        driver.findElement(txtClientName).sendKeys("TestClient " + rand);
        System.out.println("typeClientName: TestClient " + rand);

        By txtPendoName = By.xpath(".//*[@id='shortName']");
        driver.findElement(txtPendoName).sendKeys("T" + rand.substring(0, 3));
        System.out.println("typePendoName");

        By txtStreet1 = By.xpath(".//*[@id='streetAddress1']");
        driver.findElement(txtStreet1).sendKeys("19 Crosby");
        System.out.println("typeStreet1");

        By txtStreet2 = By.xpath(".//*[@id='streetAddress2']");
        driver.findElement(txtStreet2).sendKeys("Suite 160");
        System.out.println("typeStreet1");

        By txtCity = By.xpath(".//*[@id='city']");
        driver.findElement(txtCity).sendKeys("Medlind");
        System.out.println("typeCity");

        By dropDownState = By.xpath(".//*[@id='state']/div/span");
        driver.findElement(dropDownState).click();
        System.out.println("expandSateDropdown");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        By state = By.xpath(".//*[@id='state']/ul");
        driver.findElement(state).click();
        System.out.println("selectSate");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        By txtZipCode = By.xpath(".//*[@id='zipcode']");
        driver.findElement(txtZipCode).sendKeys("12345");
        System.out.println("typeZipCode");
    }

    public void selectClientSubLevel(String level) {
        By dropDownSubLevel = By.xpath(".//*[@id='subLevel']/div/span");
        driver.findElement(dropDownSubLevel).click();
        System.out.println("expandSubLevelDropdown");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        By subLevel = By.xpath(".//*[contains(text(),'" + level + "')]");
        driver.findElement(subLevel).click();
        System.out.println("selectSubLevel");
    }


    public void selectMissionLimitType(String type) {

        //TODO: Select Mission type based on the parameter

        By txtMissionsPurchased = By.xpath(".//*[@id='missionsPurchased']");
        driver.findElement(txtMissionsPurchased).sendKeys("10");
        System.out.println("typeMissionLimit");

        By txtUploadedMedia = By.xpath(".//*[@id='uploadedMediaPurchased']");
        driver.findElement(txtUploadedMedia).sendKeys("125");
        System.out.println("typeMediaFilesLimit");

        By txtMediaRetention = By.xpath(".//*[@id='mediaRetention']");
        driver.findElement(txtMediaRetention).sendKeys("320");
        System.out.println("typeMediaRetentionLimit");
    }

    public void typeTermsAndRules() {
        By txtTerms = By.xpath(".//*[@id='texteditor']//div[contains(@id,'taTextElement')]");
        driver.findElement(txtTerms).sendKeys("Test Terms ans Conditions");
        System.out.println("typeTermsCondition");

        By txtRules = By.xpath(".//*[@id='rulescond']");
        //TODO: Add any text to the default Rules of Conduct
    }


    public void clickSaveClient() {
        By btnSaveClient = By.xpath(".//button[contains(text(),'Save')]");
        driver.findElement(btnSaveClient).click();
        System.out.println("clickSaveClient");
    }
}
