package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("apeksha.rt@gmail.com");;
		driver.findElement(By.id("pass")).sendKeys("apeksha");
		driver.findElement(By.id("loginbutton")).click();
		String expectedErrorMessage= "The email or phone number you’ve entered doesn’t match any account. Sign up for an account.";
		String ActualErrorMessage = driver.findElement(By.cssSelector("#globalContainer > div.uiContextualLayerPositioner._572t.uiLayer > div > div > div")).getText();	
		if(expectedErrorMessage.equals(ActualErrorMessage)){
			System.out.println("test is passed");}
		else{
			System.out.println("test is failed");
		}
			driver.close();
			//TODAY IS SUNDAY
			//TOMMORROW IS MONDAY
			
		
	
		
		// TODO Auto-generated method stub

	}

}
