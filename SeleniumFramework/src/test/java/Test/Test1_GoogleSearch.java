package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//goto google
		driver.get("https://google.com");
		
		// Enter Text is search box
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		//Click on Search button
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		//add delay
		Thread.sleep(5000);
		
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully.");
	}
}
