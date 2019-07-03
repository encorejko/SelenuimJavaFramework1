import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserTest {
	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path : " + projectPath);
		
	//FireFox
		//System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
	//ChromeDriver
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	//IE Driver
		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("abcd");
		
		// A list of Input element
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("Count of Input Elements  "+count);
		
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("Automation step by step");
		
		
		Thread.sleep(3000);
		
		//driver.close();
	}

}
