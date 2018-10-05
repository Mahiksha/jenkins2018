package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement signin =driver.findElement(By.id("nav-link-yourAccount"));
		Actions action =new Actions(driver);
		action.moveToElement(signin).build().perform();
		driver.findElement(By.linkText("Your Recommendations")).click();
		
		
		
		
		

	}

}
