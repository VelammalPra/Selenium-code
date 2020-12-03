package seleniumpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElementByXPath("//input[@id ='username']").sendKeys("hari.radhakrishnan@testleaf.com");
driver.findElementByXPath("//input[@id ='password']").sendKeys("India$123");
driver.findElementByXPath("//input[@class = 'button r4 wide primary']").click();
driver.findElementByXPath("//div[@class = 'slds-icon-waffle']").click();
driver.findElementByXPath("//p[text()='Service Console']").click();
Thread.sleep(2000);
driver.findElementByXPath("//a[@title='Products']").click();
driver.findElementByXPath("//div[@title='New']").click();
driver.findElementByXPath("//input[@class = ' input']").sendKeys("testing product");
driver.findElementByXPath("(//span[text()='Active'])[2]/following::input").click();
driver.findElementByXPath("(//span[text() = 'Save'])[2]").click();
Thread.sleep(2000);
driver.findElementByXPath("//div[@title = 'New Contact']").click();
WebElement we = driver.findElementByXPath("//a[@class = 'select']");
Select dropdown = new Select(we);
dropdown.deselectByIndex(2);
driver.findElementByXPath("//input[@class = 'firstName compoundBorderBottom form-element__row input']").sendKeys("Velammal");;
driver.findElementByXPath("//input[@class = 'lastName compoundBLRadius compoundBRRadius form-element__row input']").sendKeys("Arasu");


	}

}
