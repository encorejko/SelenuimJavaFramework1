package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		//goto google
		driver.get("https://google.com");
		
		// Enter Text is search box
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		//Click on Search button
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//add delay
		Thread.sleep(5000);
		
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully.");
	}
}
