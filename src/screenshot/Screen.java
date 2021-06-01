package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen {
	
	public static void main (String[] args) throws Exception {
	
	// declaration and instantiation of objects/variables
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			driver.get("https://www.facebook.com");
			
			driver.findElement(By.name("email")).sendKeys("ankit.jaiswal");
			
			Utils.capture(driver, "username");
			
			driver.quit();


}
}