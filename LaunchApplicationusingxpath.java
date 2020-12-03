package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplicationusingxpath 
{
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
	driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	driver.findElementByXPath("//a[contains(text(), 'CRM')]").click();
}
}