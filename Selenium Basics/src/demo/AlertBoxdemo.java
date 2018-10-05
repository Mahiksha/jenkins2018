package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.cssSelector("body > button")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();	
		driver.close();
		// TODO Auto-generated method stub

	}

}
