package week6.day1;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Preandpost {
	@BeforeTest
	public void setFileName()
	{
		excelFileName = "CreateLead";
	}
	@Test(dataProvider = "FetchData")
	public void createLead(String compname, String firstname, String lastname) {
		
		//@Test
		//driver.findElementByLinkText("Leads1").click();//failing create lead to check dependsOnMethods
		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(compname);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastname);
		driver.findElementByName("submitButton").click();
	
}//to create common data provider move this to base class
	//@DataProvider(name ="FetchData")
//public String[][] sendData() throws IOException{
	//ReadDataFromExcel red = new ReadDataFromExcel();
	//String[][]data = red.readExcel();
	//return data;
		
	}
//	}





