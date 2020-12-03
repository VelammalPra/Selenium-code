package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByXPath("//button[@type='submit']").click();
		driver.findElementByLinkText("FLIGHTS").click();
		Set<String> setofHandles = driver.getWindowHandles();
		List<String>listofHandles = new ArrayList<String>(setofHandles);
		String secondWinRef = listofHandles.get(1);
		driver.switchTo().window(secondWinRef);
		String title = driver.getTitle();
		System.out.println(title);
		String firstWinRef = listofHandles.get(0);
		driver.switchTo().window(firstWinRef);
		driver.close();
		
		
		
	}

}
