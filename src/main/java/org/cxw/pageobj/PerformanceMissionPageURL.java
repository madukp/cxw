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
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavMission));
        driver.findElement(leftNavMission).click();
        System.out.println("clickLeftNavMissions");
    }

    public void clickLeftNavProjectTeam() {
        By leftNavProjectTeam = By.xpath(".//a[contains(text(),'Project Team')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(leftNavProjectTeam));
        driver.findElement(leftNavProjectTeam).click();
        System.out.println("clickLeftNavProjectTeam");
    }

    public void clickPerfMissionBtn() {
        By btnPerfMission = By.xpath("//button[contains(text(),'Create New Performance Mission')]");
        wait.until(ExpectedConditions.elementToBeClickable(btnPerfMission));
        driver.findElement(btnPerfMission).click();
        System.out.println("clickPerfMissionBtn");
    }

    public void typePerfMissiontitle() {
        By txtPerfMissionTitle = By.xpath(".//input[@id='title']");
        String rand = cmn.generateUUID().toString().substring(0,8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(txtPerfMissionTitle));
        driver.findElement(txtPerfMissionTitle).sendKeys("Test Mission: "+ rand);
        System.out.println("txtPerfMissionTitle");
    }

    public void selectDistrbutionType(String type) {
        By radioDistribType = By.xpath(".//*[@id='distributionType"+ type +"']");
        wait.until(ExpectedConditions.elementToBeClickable(radioDistribType));
        driver.findElement(radioDistribType).click();
        System.out.println("selectDistrbutionType");
    }

    public void clickSaveMission() {
        By btnPerfMissionSave = By.xpath(".//button[contains(text(),'Save')]");
        wait.until(ExpectedConditions.elementToBeClickable(btnPerfMissionSave));
        driver.findElement(btnPerfMissionSave).click();
        System.out.println("clickSaveMission");
    }

    public void selectAction() {
        By checkBoxChooseAction = By.xpath(".//*[@id='updateForm']//input[@name='selectedAction']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkBoxChooseAction));
        driver.findElement(checkBoxChooseAction).click();
        System.out.println("selectAction");
    }

    public void gotoStepTwo() {
        By stepTwo = By.xpath(".//*[@id='step-two']");
        //wait.until(ExpectedConditions.elementToBeClickable(stepTwo));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(stepTwo).click();
        System.out.println("gotoStepTwo");
    }

    public void typeParticipantInstructions() {
        By txtParticipantInstructions = By.xpath(".//div[contains(@id,'taTextElement') and @placeholder='Enter detailed instructions for users']");
        //wait.until(ExpectedConditions.presenceOfElementLocated(txtParticipantInstructions));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(txtParticipantInstructions).sendKeys("Participation Instruction");
        System.out.println("typeParticipantInstructions");
    }

    public void selectMediaUpload() {
        By checkBoxMediaInstructions = By.xpath(".//div[@class='mediaUpload']//div[@class='checkbox']//label[contains(text(),'Enable Media Upload')]");
        //wait.until(ExpectedConditions.presenceOfElementLocated(checkBoxMediaInstructions));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(checkBoxMediaInstructions).click();
        System.out.println("selectMediaUpload");
    }

    public void typeMediaInstructions() {
        By txtMediaInstructions = By.xpath(".//div[contains(@id,'taTextElement') and contains(@placeholder,'what kind of media to upload')]");
        wait.until(ExpectedConditions.presenceOfElementLocated(txtMediaInstructions));
        driver.findElement(txtMediaInstructions).sendKeys("Media Instructions");
        System.out.println("typeMediaInstructions");
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
        //wait.until(ExpectedConditions.elementToBeClickable(stepThree));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(stepThree).click();
        System.out.println("gotoStepThree");
    }

    public void typeThankYouMessage() {
        By txtThankMessage = By.xpath(".//div[@id='thankYouMessage']//div[contains(@id,'taTextElement')]");
        //wait.until(ExpectedConditions.presenceOfElementLocated(txtThankMessage));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(txtThankMessage).sendKeys("Thank You");
        System.out.println("typeThankYouMessage");
    }

    public void gotoStepFive() {
        By stepFive = By.xpath(".//*[@id='step-five']");
        //wait.until(ExpectedConditions.elementToBeClickable(stepFive));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        driver.findElement(stepFive).click();
        System.out.println("gotoStepFive");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void clickGenerateURL() {
        By btnGenerateURL = By.xpath(".//button[@class='btn btn-primary']/span[contains(text(),'Generate URL')]");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //wait.until(ExpectedConditions.elementToBeClickable(btnGenerateURL));
        driver.findElement(btnGenerateURL).click();
        System.out.println("clickGenerateURL");

    }

    public void gotoURLmission() {
        By btnCopyURL = By.xpath(".//button[contains(text(),'Copy Link')]");
        driver.findElement(btnCopyURL).click();
        //Write down the text copied to the clipboard
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        System.out.println(Keys.chord(Keys.LEFT_CONTROL, "v"));
    }
}
