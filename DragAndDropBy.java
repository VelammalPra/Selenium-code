package week4.day1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
Point location = item4.getLocation();
int x = location.getX();
int y = location.getY();
Actions builder = new Actions(driver);
builder.dragAndDropBy(item1, x,y).perform();
}

}
