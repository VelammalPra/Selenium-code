package seleniumpractise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Postman {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.postman.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElementByXPath("//a[@class = 'Header__NavBarItem-sc-59e0yl-3 Header__DashboardButton-sc-59e0yl-11 hdBSFY pingdom-transactional-check__sign-in-button align-middle']").click();
driver.findElementByXPath("//input[@id = 'username']").sendKeys("DhivyaTestleaf");
driver.findElementByXPath("//input[@id = 'password']").sendKeys("India@123");
driver.findElementByXPath("//button[@type = 'submit']").click();
driver.findElementByXPath("//div[@class = 'btn btn-primary btn-small create-new-button']").click();
driver.findElementByXPath("//div[text() = \"Collection\"]").click();
driver.findElementByXPath("//input[@class = 'input input-box collection-modal-name-input']").sendKeys("collection");
WebDriverWait wait = new WebDriverWait(driver, Duration .ofSeconds(30));
WebElement description = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class = 'view-lines'])[2]")));
description.sendKeys("testing");
driver.findElementByXPath("//div[@class = 'btn btn-primary']").click();
driver.findElementByXPath("//div[@class = 'btn btn-text learn-more-link']").click();
driver.findElementByXPath("//input[@class = 'input input-box addrequest__request-name']").sendKeys("velammal");
driver.findElementByXPath("(//div[@class = 'view-lines'])[2]").sendKeys("test");
driver.findElementByXPath("//span[@class = 'content']").click();



	}

}
