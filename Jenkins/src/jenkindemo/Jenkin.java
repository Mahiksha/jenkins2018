package jenkindemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jenkin {
	
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println("I love facebook");
		driver.close();
		
		
			
		
			
		
	}

}
