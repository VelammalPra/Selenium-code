package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	private static Object list;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.findElementByXPath("(//input[@type ='checkbox'])[3]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id ='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id ='txtStationFrom']").sendKeys("ms");
		driver.findElementByXPath("//input[@id ='txtStationFrom']").sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id ='txtStationTo']']").clear();
		driver.findElementByXPath("//input[@id ='txtStationTo']']").sendKeys("mdu");
		driver.findElementByXPath("//input[@id ='txtStationTo']']").sendKeys(Keys.TAB);
		Thread.sleep(2000);
		int rowCount = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr").size();
		List<String> listTrainNames = new ArrayList<String>();
		
for(int i =1; i <=rowCount; i++) {
	String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[" +i+"]/td[2]/a").getText();
	//System.out.println(text);
	listTrainNames.add(text);
	
}
int listSize = listTrainNames.size();



	}

}

