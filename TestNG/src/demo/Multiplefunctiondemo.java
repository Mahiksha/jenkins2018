package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Multiplefunctiondemo {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser){
		if(browser.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Apeksha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		}
		
		else if(browser.equals("edge")){
		System.setProperty("webdriver.microsoftedge.driver","MicrosoftWebDriver.exe");
	    driver=new EdgeDriver();
		}
		
		else if(browser.equals("IE")){
		System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
	    driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");	
	}
	@Test(priority=3)
	public void  Signin(){
	boolean SigninVisiblebutton = driver.findElement(By.id("login-submit")).isDisplayed();
		Assert.assertTrue(SigninVisiblebutton,  "true");
	}
	@Test(priority=0)
	public void VerifyText(){
		String expectedTitle="Be great at what you do";
	    String ActualTitle = driver.findElement(By.cssSelector("#regForm > h2")).getText();
	    Assert.assertEquals(ActualTitle, expectedTitle);
	}
	@Test(priority=1)
	public void Password(){
		 boolean Checkpassword =driver.findElement(By.linkText("Forgot password?")).isDisplayed();
		Assert.assertTrue( Checkpassword,"true");
	}
	@Test(priority=4)
	public void CheckPass(){
	 driver.findElement(By.linkText("Forgot password?")).click();
	}
	@Test(priority=2)
	public void Serach(){
		boolean searchbutton=driver.findElement(By.name("search")).isEnabled();
		Assert.assertFalse(searchbutton ,"false");	
	}
	@AfterTest
	public void closeBrowser(){
		//driver.close();
		driver.quit();
	}
	
	

}
