package org.cxw.pageobj;

import org.cxw.setup.Common;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientPage extends SetUp {

	//final static Logger logger = Logger.getLogger(ClientPage.class);
	WebDriver driver = super.getDriver();
	WebDriverWait wait = super.getWait();
	Common cmn = new Common();

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
		System.out.println("clickLeftNavClients");
		driver.findElement(leftNavClients).click();
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
		String rand = cmn.generateUUID().toString().substring(0,3);
		By txtClientName = By.xpath(".//*[@id='name']");
		driver.findElement(txtClientName).sendKeys("TestClient "+ rand);

		By txtPendoName = By.xpath(".//*[@id='shortName']");
		driver.findElement(txtPendoName).sendKeys("T" + rand);

		By txtStreet1 = By.xpath(".//*[@id='streetAddress1']");
		driver.findElement(txtStreet1).sendKeys("19 Crosby");

		By txtStreet2 = By.xpath(".//*[@id='streetAddress2']");
		driver.findElement(txtStreet2).sendKeys("Suite 160");

		By txtCity = By.xpath(".//*[@id='city']");
		driver.findElement(txtCity).sendKeys("Medlind");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		By dropDownState = By.xpath(".//*[@id='state' AND @name='state']");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(dropDownState));
		//Select dropDown = new Select(driver.findElement(dropDownState));
		//dropDown.selectByVisibleText("Alabama");

		driver.findElement(dropDownState).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//By dropDownItemState = By.xpath(".//a[@class='ui-select-choices-row-inner']/span[Contains(text(),'Alabama')]");
		By dropDownItemState = By.xpath(".//*[@id='ui-select-choices-row-2-0']/a");
		//By dropDownItemState = By.xpath(".//span[contains(text(),'Alabama')]");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(dropDownItemState));
		driver.findElement(dropDownItemState).click();

		By txtZipCode = By.xpath(".//*[@id='zipcode']");
		driver.findElement(txtZipCode).sendKeys("12345");

		By txtTerms = By.xpath("");
		driver.findElement(txtTerms).sendKeys("Test Terms ans Conditions");

		By txtRules = By.xpath(".//*[@id='rulescond']");
		//TODO: Add any text to the default Rules of Conduct
    }

	public void selectClientSubLevel(String level) {
		By dropDownSubLevel = By.xpath(".//*[@id='subLevel']");
		driver.findElement(dropDownSubLevel).click();
		By dropDownItemSubLevel = By.xpath(".//a[@class='ui-select-choices-row-inner']/span[contains(text(),'"+ level +"')]");
		driver.findElement(dropDownItemSubLevel).click();
	}


	public void selectMissionLimitType(String type) {
		By txtMissionsPurchased = By.xpath(".//*[@id='missionsPurchased']");
		//TODO: Select Mission type based on the parameter

		By txtUploadedMedia = By.xpath(".//*[@id='uploadedMediaPurchased']");
		driver.findElement(txtUploadedMedia).sendKeys("125");

		By txtMediaRetention = By.xpath(".//*[@id='mediaRetention']");
		driver.findElement(txtMediaRetention).sendKeys("320");
	}


	public void clickSaveClient() {
		By btnSaveClient = By.xpath(".//button[contains(text(),'Save')]");
		driver.findElement(btnSaveClient).click();
	}
}
