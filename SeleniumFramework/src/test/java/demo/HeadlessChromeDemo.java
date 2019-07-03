package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {

	public static void main(String[] args) {
		test();
	}
	public static void test(){
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/home/Desktop/JAVA CLASS/SeleniumFramework/drivers/chromedriver/chromedriver.exe");
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("windows-size=1920,1080");
		WebDriver driver = new ChromeDriver(options);
	
		driver.get("https:google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("automation");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		System.out.println("test is compelete");
		
		
	}
}
