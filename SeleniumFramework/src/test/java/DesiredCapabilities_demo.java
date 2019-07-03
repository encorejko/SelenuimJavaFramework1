import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DesiredCapabilities_demo {

	public static void main(String[] args) throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		driver.close();
		driver.quit();
	}

}
