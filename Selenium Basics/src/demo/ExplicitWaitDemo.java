package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	public static void main(String []args){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
	
	driver.findElement(By.cssSelector("#start > button")).click();
	String expectedText="Hello World!";
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
	String actualText=driver.findElement(By.cssSelector("#finish > h4")).getText();
	if (expectedText.equals(actualText)){
		System.out.println("test is passed");
	}
	else{
		System.out.println("test is failed");
	}
driver.close();	

	}
} 
