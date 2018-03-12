package org.cxw.pageobj;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.cxw.setup.PropertyFile;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientPage extends SetUp {

	private WebElement btnCreateClient;
	final static Logger logger = Logger.getLogger(ClientPage.class);

	public void NavigatetoClientPage() {
		
		String url = PropertyFile.readProperty("ClientURL");
		navigateToURL(url);
		btnCreateClient = SetUp.getDriver().findElement(By.xpath("html/body/div[1]/center[2]/div/ul/li[1]"));
		
		
	}

}
