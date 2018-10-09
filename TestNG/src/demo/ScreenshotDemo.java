package demo;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	
	WebDriver driver;
	@BeforeTest
public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Apeksha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");
		
	}
	@Test
	public void ScreenshotDemo() throws IOException{
		try{
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
   WebElement radio =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
	radio.click();
WebElement passenger=	driver.findElement(By.name("passCount"));
Select passdropdown=new Select(passenger);
passdropdown.selectByIndex(1);

WebElement departingfrom=driver.findElement(By.name("fromPort"));
Select departingdropdown=new Select(departingfrom);
departingdropdown.selectByVisibleText("Seattle");

WebElement on=driver.findElement(By.name("fromMonth"));
Select ondropdown=new Select(on);
ondropdown.selectByVisibleText("August");

WebElement onday=driver.findElement(By.name("fromDay"));
Select ondaydropdown=new Select(onday);
ondaydropdown.selectByVisibleText("11");

WebElement first=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
first.click();
driver.findElement(By.name("findFlights")).click();

 WebElement depart   =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input"));
depart.click();

driver.findElement(By.name("reserveFlights")).click();
driver.findElement(By.name("passFirst0")).sendKeys("APEKSHA");
driver.findElement(By.name("creditnumber")).sendKeys("98798579");
driver.findElement(By.name("billAddress1")).sendKeys("VIDISHA");
driver.findElement(By.name("buyFlights")).click();
driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)"));
	
		}
		catch(Exception e){
		takescreenshot();
		
	} 
	}
	private void takescreenshot() throws IOException {
		File gg	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(gg, new File("C:\\Users\\Apeksha\\Newtours"+(new Random().nextInt())+".jpg"));
		
	}
	@AfterTest
	public void closeBrowser(){
		driver.close();
		
	}
}
