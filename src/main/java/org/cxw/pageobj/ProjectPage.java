package org.cxw.pageobj;

import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProjectPage {
	
	private WebDriver driver = SetUp.setupDriver();
	
	public void CreateProject(){
	
	//navigate to CX project
		
		   try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	        }
		
		By MenuItemCXProject = By.xpath("//a[@href='#/project' and contains(text(),'CX Projects')]");
		driver.findElement(MenuItemCXProject).click();
		
		 try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	        }
		
		By btnNewCXProject = By.xpath("//button[@class='btn create-btn btn-primary' and contains(text(),'Create New Project')]");
		driver.findElement(btnNewCXProject).click();
		
		 try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	        }
		
		By txtProjectName = By.xpath("//input[@id='projectName' and @name='name']");
		driver.findElement(txtProjectName).sendKeys("TestProject_AUT");
		
		
		By drpdwnProjectLeader = By.xpath("//div[@id='projectLeader' and @name='projectLeader']");
		driver.findElement(drpdwnProjectLeader).click();
		
		By selectProjectLeader = By.xpath("//span[contains(text(),'Ann Brown')]");
		driver.findElement(selectProjectLeader).click();
		
		By collapseProject = By.xpath("//div[@class='collapse-btn pull-right' and @ng-click='tab[1] = !tab[1]']");
		driver.findElement(collapseProject).click();
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
		
		By expandMap = By.xpath("//div[@class='collapse-btn pull-right' and @ng-click='tab[2] = !tab[2]']");
		driver.findElement(expandMap).click();
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
		
		By drpdwnSelectTemplate = By.xpath("//div[@id='stageTemplate' and @name='stageTemplate']");
		driver.findElement(drpdwnSelectTemplate).click();
		
		By SelectTemplate = By.xpath("//span[@class='ng-binding ng-scope' and contains(text(),'SPCI Template')]");
		driver.findElement(SelectTemplate).click();
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
		
		//WebElement chkbxChannel = driver.findElement(By.xpath("//input[@class='ng-valid ng-dirty ng-valid-parse ng-touched']"));
		//System.out.println(chkbxChannel.getText());
		//chkbxChannel.click();
		
		By radiobtnCurvetype = By.xpath("//button[@id='curveTypeE' and contains(text(), 'Emotion')]");
		driver.findElement(radiobtnCurvetype).click();
		
		By btnChooseImage = By.xpath("//button[@class='btn-sm btn btn-default ng-scope' and contains(text(), 'Choose File')]");
		driver.findElement(btnChooseImage).click();
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
		
		
		
		
		
		
		
		
	}

}
