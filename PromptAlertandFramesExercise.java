package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlertandFramesExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("Velammal");
alert.accept();
String text = driver.findElementByXPath("//p[text()=\"Hello Velammal! How are you today?\"]").getText();
System.out.println(text);
if(text.contains("Velammal")) {
	System.out.println("Name is displayed");}
else {
	System.out.println("Name is not displaying");
}
driver.close();	
}
		
		
		
	}


