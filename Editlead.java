package testngannotations;

import org.testng.annotations.Test;

public class Editlead extends Preandpost {
@Test(dependsOnMethods = "Createlead.createLead")
public void editlead() throws InterruptedException {
	driver.findElementByLinkText("Leads").click();

	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//span[text()='Phone']").click();
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);
	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	driver.findElementByLinkText("Edit").click();
	driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
	driver.findElementByName("submitButton").click();

}
}
