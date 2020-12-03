package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.WebElement;


public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
	    //Getting column count

List<WebElement> columns = driver.findElementsByXPath("//table[@id='table_id']//tr/th");
System.out.println("No of columns:"+columns.size());

//Getting row count
List<WebElement> row = driver.findElementsByXPath("//table[@id='table_id']//tr");
System.out.println("No of rows:"+row.size());

//getting progress value
String text = driver.findElementByXPath("//table[@id='table_id']/tbody[1]/tr[3]/td[2]").getText();
System.out.println(text);
//Check the least completed progress check		

driver.findElementByXPath("//table[@id='table_id']/tbody[1]/tr[4]/td[3]").click();
}
}
