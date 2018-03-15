package org.cxw.pageobj;

import org.apache.log4j.Logger;
import org.cxw.setup.PropertyFile;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class ClientPage extends SetUp {

	//final static Logger logger = Logger.getLogger(ClientPage.class);
	WebDriver driver = super.getDriver();
	WebDriverWait wait = super.getWait();

	public void clickLeftNavAdministration() {
		//By leftNavAdministration = By.xpath("html/body/div[1]/aside/div/ul/li[1]/a");
		By leftNavAdministration = By.xpath("//a[contains(@ng-click,'mainTabs[1]') AND contains(text(),'Administration')]");
		System.out.println("clickLeftNavAdministration");
		driver.findElement(leftNavAdministration).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	public void clickLeftNavClients() {
		//By leftNavClients = By.xpath("html/body/div[1]/aside/div/ul/li[1]/ul/li[1]/a");
		By leftNavClients = By.xpath("//a[contains(@class,'active') AND contains(text(),'Clients')]");
		System.out.println("clickLeftNavClients");
		driver.findElement(leftNavClients).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void clickCreateNewClientBtn() {
		By btnCreateNewClient = By.xpath("//button[contains(text(),'Create New Client')]");
		System.out.println("clickCreateNewClientBtn");
		driver.findElement(btnCreateNewClient).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

    public void fillClientDetails() {

    }

	public void clickSaveClient() {
	}
}
