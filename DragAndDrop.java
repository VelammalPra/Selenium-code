package week4.day1;

import javax.xml.ws.Action;

//import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement source = driver.findElementByXPath("//div[@id='draggable']");
		WebElement target = driver.findElementByXPath("//div[@id='draggable']/following-sibling::div[1]"); 
				Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
driver.close();
	}

}
