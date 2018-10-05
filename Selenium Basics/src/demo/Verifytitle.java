package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedTitle="Facebook - Log In or Sign Up";
		String actualTitle=driver.getTitle();
		if (expectedTitle.equals(actualTitle)){
		System.out.println("test is passed");
		}
		else {
		 
			System.out.println("test is failed");
		}
		driver.close();
		
		
		
		// TODO Auto-generated method stub

	}
}


