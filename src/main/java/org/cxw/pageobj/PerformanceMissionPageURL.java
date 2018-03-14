package org.cxw.pageobj;

import org.cxw.setup.Common;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class PerformanceMissionPageURL extends SetUp {

    WebDriver driver = driver = getDriver();
    Common cmn = new Common();

    public void clickLeftNavMissions() {
        By leftNavMission = By.xpath("html/body/div[1]/aside/div/ul/li[4]/a/span[2]");
        driver.findElement(leftNavMission).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void clickLeftNavProjectTeam() {
        By leftNavProjectTeam = By.xpath("html/body/div[1]/aside/div/ul/li[4]/ul/li[1]/a");
        driver.findElement(leftNavProjectTeam).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void clickPerfMissionBtn() {
        By btnPerfMission = By.xpath("html/body/div[1]/div[3]/main/div/div[2]/div[1]/div/button");
        driver.findElement(btnPerfMission).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public void typePerfMissiontitle() {
        By txtPerfMissionTitle = By.xpath(".//input[@id='title']");
        String rand = cmn.generateUUID().toString().substring(0,8);
        driver.findElement(txtPerfMissionTitle).sendKeys("Test Mission: "+ rand);
    }

    public void selectDistrbutionType(String type) {
        By radioDistribType = By.xpath(".//*[@id='distributionType"+ type +"']");
        driver.findElement(radioDistribType).click();
    }

    public void clickSaveMission() {
        By btnPerfMissionSave = By.xpath(".//button[contains(text(),'Save')]");
        driver.findElement(btnPerfMissionSave).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void selectAction() {
        By checkBoxChooseAction = By.xpath(".//*[@id='updateForm']//input[@name='selectedAction']");
        driver.findElement(checkBoxChooseAction).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void gotoStepTwo() {
        By stepTwo = By.xpath(".//*[@id='step-two']");
        driver.findElement(stepTwo).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void typeParticipantInstructions() {
        By txtParticipantInstructions = By.xpath(".//div[contains(@id,'taTextElement') and @placeholder='Enter detailed instructions for users']");
        driver.findElement(txtParticipantInstructions).sendKeys("Participation Instruction");
    }

    public void selectMediaUpload() {
        By checkBoxMediaInstructions = By.xpath(".//div[@class='mediaUpload']//div[@class='checkbox']//label[contains(text(),'Enable Media Upload')]");
        driver.findElement(checkBoxMediaInstructions).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void typeMediaInstructions() {
        By txtMediaInstructions = By.xpath(".//div[contains(@id,'taTextElement') and contains(@placeholder,'what kind of media to upload')]");
        driver.findElement(txtMediaInstructions).sendKeys("Media Instructions");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void gotoStepThree() {
        By stepThree = By.xpath(".//button[@id='step-three']");
        driver.findElement(stepThree).click();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    public void typeThankYouMessage() {
        By txtThankMessage = By.xpath(".//div[@id='thankYouMessage']//div[contains(@id,'taTextElement')]");
        driver.findElement(txtThankMessage).sendKeys("Thank You");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    public void gotoStepFive() {
        By stepFive = By.xpath(".//*[@id='step-five']");
        driver.findElement(stepFive).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickGenerateURL() {
        By btnGenerateURL = By.xpath(".//button[@class='btn btn-primary']/span[contains(text(),'Generate URL')]");
        driver.findElement(btnGenerateURL).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void gotoURLmission() {
        By btnCopyURL = By.xpath(".//button[contains(text(),'Copy Link')]");
        driver.findElement(btnCopyURL).click();
        //Write down the text in the clipboard
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println(Keys.chord(Keys.LEFT_CONTROL, "v"));
    }
}
