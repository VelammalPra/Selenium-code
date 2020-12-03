package week6.day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Preandpost {
	public static ChromeDriver driver;
	public String excelFileName;
	
	@BeforeMethod
	public void startApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	@DataProvider(name ="FetchData")
	public String[][] sendData() throws IOException{
		ReadDataFromExcel red = new ReadDataFromExcel();
		String[][]data = red.readExcel(excelFileName);
		return data;
}
}
