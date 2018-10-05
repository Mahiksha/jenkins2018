package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.cssSelector("body > form > select > option:nth-child(1)")).click();
		driver.findElement(By.cssSelector("body > form > select > option:nth-child(2)")).click();
		driver.findElement(By.cssSelector("body > form > select > option:nth-child(3)")).click();
		driver.findElement(By.cssSelector("body > form > select > option:nth-child(4)")).click();
       driver.findElement(By.xpath("/html/body/form/input")).click();
        // submits.click();
		
		
		
		


	}

}
