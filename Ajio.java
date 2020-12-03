package seleniumpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text() = 'Allow Location']").click();
		//Instantiate Action class
        Actions actions = new Actions(driver);
//Retrieve webelement Women to perform mouse hover
        WebElement women = driver.findElementByXPath("//a[@title = 'WOMEN']");
        //Mouse hover on women
    	actions.moveToElement(women).perform();

	}

}
