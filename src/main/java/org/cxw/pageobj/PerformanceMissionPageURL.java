package org.cxw.pageobj;

import org.cxw.setup.Common;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class PerformanceMissionPageURL extends SetUp {

    WebDriver driver = super.getDriver();
    WebDriverWait wait = super.getWait();
    Common cmn = new Common();

    public void clickLeftNavMissions() {
        //By leftNavMission = By.xpath("//a[@class='tab mission']");
        By leftNavMission = By.xpath(".//a[contains(text(),'Mission')]");
        //By leftNavMission = By.xpath(".//a[contains(text(),'Mission') AND @class='tab mission']");
        System.out.println("clickLeftNavMissions");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavMission));
        driver.findElement(leftNavMission).click();
    }

    public void clickLeftNavProjectTeam() {
        By leftNavProjectTeam = By.xpath(".//a[contains(text(),'Project Team')]");
        System.out.println("clickLeftNavProjectTeam");
        wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavProjectTeam));
        driver.findElement(leftNavProjectTeam).click();
    }

    public void clickPerfMissionBtn() {
        By btnPerfMission = By.xpath("//button[contains(text(),'Create New Performance Mission')]");
        System.out.println("clickPerfMissionBtn");
        wait.until(ExpectedConditions.elementToBeClickable(btnPerfMission));
        driver.findElement(btnPerfMission).click();
    }

    public void typePerfMissiontitle() {
        By txtPerfMissionTitle = By.xpath(".//input[@id='title']");
        String rand = cmn.generateUUID().toString().substring(0,8);
        System.out.println("txtPerfMissionTitle");
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtPerfMissionTitle));
        driver.findElement(txtPerfMissionTitle).sendKeys("Test Mission: "+ rand);
    }

    public void selectDistrbutionType(String type) {
        By radioDistribType = By.xpath(".//*[@id='distributionType"+ type +"']");
        System.out.println("selectDistrbutionType");
        wait.until(ExpectedConditions.elementToBeClickable(radioDistribType));
        driver.findElement(radioDistribType).click();
    }

    public void clickSaveMission() {
        By btnPerfMissionSave = By.xpath(".//button[contains(text(),'Save')]");
        System.out.println("clickSaveMission");
        wait.until(ExpectedConditions.elementToBeClickable(btnPerfMissionSave));
        driver.findElement(btnPerfMissionSave).click();
    }

    public void selectAction() {
        By checkBoxChooseAction = By.xpath(".//*[@id='updateForm']//input[@name='selectedAction']");
        System.out.println("selectAction");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkBoxChooseAction));
        driver.findElement(checkBoxChooseAction).click();
    }

    public void gotoStepTwo() {
        By stepTwo = By.xpath(".//*[@id='step-two']");
        System.out.println("gotoStepTwo");
        //wait.until(ExpectedConditions.elementToBeClickable(stepTwo));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(stepTwo).click();
    }

    public void typeParticipantInstructions() {
        By txtParticipantInstructions = By.xpath(".//div[contains(@id,'taTextElement') and @placeholder='Enter detailed instructions for users']");
        System.out.println("typeParticipantInstructions");
        //wait.until(ExpectedConditions.presenceOfElementLocated(txtParticipantInstructions));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(txtParticipantInstructions).sendKeys("Participation Instruction");
    }

    public void selectMediaUpload() {
        By checkBoxMediaInstructions = By.xpath(".//div[@class='mediaUpload']//div[@class='checkbox']//label[contains(text(),'Enable Media Upload')]");
        System.out.println("selectMediaUpload");
        //wait.until(ExpectedConditions.presenceOfElementLocated(checkBoxMediaInstructions));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(checkBoxMediaInstructions).click();
    }

    public void typeMediaInstructions() {
        By txtMediaInstructions = By.xpath(".//div[contains(@id,'taTextElement') and contains(@placeholder,'what kind of media to upload')]");
        System.out.println("typeMediaInstructions");
        wait.until(ExpectedConditions.presenceOfElementLocated(txtMediaInstructions));
        driver.findElement(txtMediaInstructions).sendKeys("Media Instructions");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void gotoStepThree() {
        //By stepThree = By.xpath(".//button[@id='step-three']");
        By stepThree = By.xpath(".//button[@class='btn btn-primary' AND contains(text(),'Next Step')]");
        System.out.println("gotoStepThree");
        //wait.until(ExpectedConditions.elementToBeClickable(stepThree));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(stepThree).click();
    }

    public void typeThankYouMessage() {
        By txtThankMessage = By.xpath(".//div[@id='thankYouMessage']//div[contains(@id,'taTextElement')]");
        System.out.println("typeThankYouMessage");
        //wait.until(ExpectedConditions.presenceOfElementLocated(txtThankMessage));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(txtThankMessage).sendKeys("Thank You");
    }

    public void gotoStepFive() {
        By stepFive = By.xpath(".//*[@id='step-five']");
        System.out.println("gotoStepFive");
        //wait.until(ExpectedConditions.elementToBeClickable(stepFive));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.findElement(stepFive).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void clickGenerateURL() {
        By btnGenerateURL = By.xpath(".//button[@class='btn btn-primary']/span[contains(text(),'Generate URL')]");
        System.out.println("clickGenerateURL");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //wait.until(ExpectedConditions.elementToBeClickable(btnGenerateURL));
        driver.findElement(btnGenerateURL).click();

    }

    public void gotoURLmission() {
        By btnCopyURL = By.xpath(".//button[contains(text(),'Copy Link')]");
        driver.findElement(btnCopyURL).click();
        //Write down the text in the clipboard
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println(Keys.chord(Keys.LEFT_CONTROL, "v"));
    }
}
