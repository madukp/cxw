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
		driver.findElement(txtProjectName).click();
		
		By txtProjectLeader = By.xpath("//div[@id='projectLeader' and @name='projectLeader']");
		driver.findElement(txtProjectName).click();
		
		
		
	}

}
