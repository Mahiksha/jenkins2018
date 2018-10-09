package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MultipleBrowserDemo {
@Test
public void CrossBrowser(){
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Apeksha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	
	
	System.setProperty("webdriver.microsoftedge.driver","MicrosoftWebDriver.exe");
  WebDriver driver=new EdgeDriver();
	
	
	//System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
	//WebDriver driver=new InternetExplorerDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	//MULTIPLEBROWSER NAME
	
}
}
