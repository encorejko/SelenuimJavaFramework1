package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo {

	WebDriver driver = null;
	public static String browserName = null;
	
	@BeforeTest
	public void setUpTest(){
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test
	public void googleSearch() {
		
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
				//driver.quit();
				System.out.println("Test completed successfully.");
				PropertiesFile.setProperties();
	}
}

