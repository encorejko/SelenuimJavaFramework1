package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {

	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest(){
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch3() {
		
		//goto google
		driver.get("https://google.com");
		
		// Enter Text is search box
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		//Click on Search button
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void tearDownTest(){
		//close browser
				driver.close();
				driver.quit();
				System.out.println("Test completed successfully.");
	}
}
