package testngannotations;

import org.testng.annotations.Test;

public class Createlead extends Preandpost{
	@Test
	public void createLead() {
		
		//@Test
		//driver.findElementByLinkText("Leads1").click();//failing create lead to check dependsOnMethods
		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementByName("submitButton").click();
		
	
	}
	
	
}



