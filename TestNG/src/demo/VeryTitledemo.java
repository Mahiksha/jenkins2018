package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class VeryTitledemo {
	WebDriver driver = null;
	@BeforeTest
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","C://Users//Apeksha//Downloads//chromedriver_win32//chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
		

		@Test
		public void verifytitle(){
			 //@SuppressWarnings("unused")
			String expectedtitle = "Facebook - Log In or Sign Up";
	//		 @SuppressWarnings("unused")
			String actualtitle = driver.getTitle();
			 Assert.assertEquals(actualtitle, expectedtitle);
	
		}
		@AfterTest
		public void closeBrowser(){
			driver.close();
		}
		
		
	}
	
	



