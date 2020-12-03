package seleniumpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zoomcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@class = 'search']").click();
		driver.findElementByXPath("//div[@class = 'items']").click();
		driver.findElementByXPath("//button[@class = 'proceed']").click();
		driver.findElementByXPath("(//div[@class='text'])[2]").click();
		driver.findElementByXPath("//button[@class = 'proceed']").click();
		driver.findElementByXPath("//button[@class = 'proceed']").click();
int result = driver.findElementsByXPath("//div[@class = 'car-listing']").size();
System.out.println(result);

	}

}
