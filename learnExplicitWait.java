package week8.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class learnExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.leafground.com/pages/TextChange.html");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement element =driver.findElementByXPath("//button[@id = \"btn\"]");
			WebDriverWait wait = new WebDriverWait(driver, Duration .ofSeconds(30));
			wait.until(ExpectedConditions.textToBePresentInElement(element, "Click ME!"));
			element.click();
					
	}

}
