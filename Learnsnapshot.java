package week8.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnsnapshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		//Clicking home page
		driver.findElementByXPath("//button[@id='home']").click();
		Thread.sleep(2000);
		//to capture screenshot as file
File source = driver.getScreenshotAs(OutputType.FILE);
//declare target location to keep the file
File target = new File("./snapshot/leafgroundopenhomepage.png");

//to copy that file
FileUtils.copyFile(source, target);
	}

}
