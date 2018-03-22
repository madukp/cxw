package org.cxw.pageobj;

import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProjectPage {
	
	private WebDriver driver = SetUp.setupDriver();
	
	public void CreateProject(){
	
	//navigate to CX project
		
		By MenuItemCXProject = By.xpath("//a[@href='#/project' and contains(text(),'CX Projects')]");
		driver.findElement(MenuItemCXProject).click();
				
	
	}

}
