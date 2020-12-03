package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehoveractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(3000);
		WebElement Men = driver.findElementByXPath("(//span[@class='catText'])[6]");
		Actions builder = new Actions(driver);
		builder.moveToElement(Men).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("(//span[text()='Shirts'])[2]").click();
		WebElement firstproduct = driver.findElementByXPath("//img[@class='product-image ']");
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(firstproduct).perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text()[normalize-space()='Quick View']]").click();
		driver.close();
		
	}

}
