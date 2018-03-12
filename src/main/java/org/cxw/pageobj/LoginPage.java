package org.cxw.pageobj;

import java.util.Iterator;
import java.util.Set;

import org.cxw.setup.Common;
import org.cxw.setup.PropertyFile;
import org.cxw.setup.SetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends SetUp {

	private WebElement txtUserName;
	private WebElement txtpassword;
	private WebElement btnlogin;
	private WebElement btnWelcomeOK;

	private static LoginPage lp = new LoginPage();

	public void LoginPage() {

		txtUserName = getDriver().findElement(By.xpath(".//*[@id='username']"));
		txtpassword = getDriver().findElement(By.xpath(".//*[@id='password']"));
		btnlogin = getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div/form/div[4]/div/button"));

		String username = PropertyFile.readProperty("username");
		String pass = PropertyFile.readProperty("password");

		txtUserName.sendKeys(username);
		txtpassword.sendKeys(pass);
		btnlogin.click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Set<String> windows = getDriver().getWindowHandles();
		 * 
		 * for (String window : windows) {
		 * 
		 * System.out.println(" windows " +
		 * getDriver().switchTo().window(window).getCurrentUrl());
		 * 
		 * Iterator <String> it = windows.iterator(); // String Parent =
		 * it.next(); // System.out.println(" windows " +
		 * getDriver().switchTo().window(window).getCurrentUrl()); String Child
		 * = it.next(); System.out.println(" windows " +
		 * getDriver().switchTo().window(window).getCurrentUrl());
		 * 
		 * 
		 * }
		 */
		if (getDriver().findElement(By.xpath("//div[@class='modal-body ng-scope']")).isDisplayed()) {
			getDriver()
					.findElement(By
							.xpath("//div[@class='modal-body ng-scope']//div[@class='modal-footer']//button[@class='btn btn-primary']"))
					.click();
		}

	}

	public static void testMissions() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		Common cmn = new Common();

		// String url = PropertyFile.readProperty("CreatemisURL");
		// getDriver().navigate().to(url);

		// new WebDriverWait(getDriver(), 5).until(webDriver ->
		// ((JavascriptExecutor) webDriver)
		// .executeScript("return document.readyState").equals("complete"));

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { // TODO * Auto-generated catch block
											// e.printStackTrace();
		}
		// nav to maps
		/*
		 * WebElement leftNavMap = getDriver().findElement(By.xpath(
		 * "html/body/div[1]/aside/div/ul/li[3]/a")); leftNavMap.click(); try {
		 * Thread.sleep(5000); } catch (InterruptedException e) { // TODO *
		 * Auto-generated catch block // e.printStackTrace(); } WebElement
		 * mapCreate = getDriver().findElement(By.xpath(
		 * "html/body/div[1]/aside/div/ul/li[3]/ul/li[2]/a"));
		 * mapCreate.click();
		 * 
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * * Auto-generated catch block // e.printStackTrace(); } WebElement
		 * stage1 = getDriver().findElement(By.xpath(
		 * "html/body/div[1]/div[3]/main/div/map/map-edit/div/div[1]/div/div[1]/map-edit-stage/div/button"
		 * )); stage1.click(); try { Thread.sleep(5000); } catch
		 * (InterruptedException e) { // TODO * Auto-generated catch block //
		 * e.printStackTrace(); } WebElement newTouchpoint =
		 * getDriver().findElement(By.xpath(".//*[@id='touchpointTitle']"));
		 * newTouchpoint.sendKeys("TP1"); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { // TODO * Auto-generated catch block //
		 * e.printStackTrace(); } WebElement btnsave =
		 * getDriver().findElement(By.xpath(".//div[@class='modal-footer']/*[2]"
		 * )); btnsave.click(); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { // TODO * Auto-generated catch block //
		 * e.printStackTrace(); } WebElement newAction =
		 * getDriver().findElement(By.xpath(
		 * "html/body/div[1]/div[3]/main/div/map/map-edit/div/div[2]/div/div/map-edit-touchpoint/div/button"
		 * )); newAction.click(); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { // TODO * Auto-generated catch block //
		 * e.printStackTrace(); } WebElement btnActionSave =
		 * getDriver().findElement(By.xpath(".//button[contains(text(),'Save')]"
		 * )); btnActionSave.click();
		 */

		// nav to missions

		WebElement ele = getDriver().findElement(By.xpath("html/body/div[1]/aside/div/ul/li[4]/a"));

		ele.click();
		WebElement ele2 = getDriver().findElement(By.xpath("html/body/div[1]/aside/div/ul/li[4]/ul/li[1]/a"));

		ele2.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { // TODO * Auto-generated catch block
											// e.printStackTrace();
		}



/*
		WebElement ele3 = getDriver()
				.findElement(By.xpath("html/body/div[1]/div[3]/main/div/div[2]/div[1]/div/button"));

		ele3.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { // TODO * Auto-generated catch block
											// e.printStackTrace();
		}
		WebElement ele4 = getDriver().findElement(By.xpath(".//input[@id='title']"));
		ele4.sendKeys("Test Mission" + cmn.generateUUID());

		WebElement ele5 = getDriver().findElement(By.xpath(".//*[@id='distributionTypeURL']"));
		ele5.click();

		WebElement ele6 = getDriver().findElement(By.xpath(".//button[contains(text(),'Save')]"));
		ele6.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { // TODO * Auto-generated catch block
											// e.printStackTrace();
		}

		WebElement checkboxchooseAction = getDriver()
				.findElement(By.xpath(".//*[@id='updateForm']//input[@name='selectedAction']"));
		checkboxchooseAction.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { // TODO * Auto-generated catch block
											// e.printStackTrace();
		}
		// WebElement btnNextAction =
		// getDriver().findElement(By.xpath("(.//div[@class='col-sm-12
		// section-footer']//button[contains(text(),'Next')])[1]"));

		WebElement stepTwo = getDriver().findElement(By.xpath(".//*[@id='step-two']"));

		stepTwo.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { // TODO * Auto-generated catch block
											// e.printStackTrace();
		}
		
		WebElement txtParticipantInstructions = getDriver().findElement(By.xpath(".//div[contains(@id,'taTextElement') and   @placeholder='Enter detailed instructions for users']"));
		
		txtParticipantInstructions.sendKeys( "random text");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { // TODO * Auto-generated catch block
											// e.printStackTrace();
		}
		
		*/
		
		WebElement ele11 = getDriver().findElement(By.xpath("html/body/div[1]/div[3]/main/div/div[2]/div[2]/div/aet-search/div[2]/table/tbody/tr[2]/td[8]/a[1]/span"));

		ele11.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { // TODO * Auto-generated catch block
											// e.printStackTrace();
		}
		
		
		WebElement stepThree = getDriver().findElement(By.xpath(".//*[@id='step-three']"));

		stepThree.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { // TODO * Auto-generated catch block
											// e.printStackTrace();
		}
		WebElement txtThankYouMessage = getDriver().findElement(By.xpath(".//div[@id='thankYouMessage']//div[contains(@id,'taTextElement')]"));
		txtThankYouMessage.sendKeys("Thank You ");
	
		
		
		
		
		

	}

	public static void main(String args[]) {
		setupDriver();
		lp.LoginPage();
		testMissions();
	}

}
