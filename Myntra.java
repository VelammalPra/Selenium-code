package seleniumpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElementByXPath("//input[@class = 'desktop-searchBar']").sendKeys("Sunglasses");
driver.findElementByXPath("//input[@class = 'desktop-searchBar']").sendKeys(Keys.ENTER);
driver.findElementByXPath("(//label[@class = 'vertical-filters-label common-customCheckbox'])[7]").click();

	}

}
