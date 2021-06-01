package Commands;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserAlerts {
	
	public static void main (String args[]) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.msnagile.com/login?url=interview1");
	  
	    driver.findElement(By.id("userEmail")).sendKeys("qa.sudhanshu@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//span[text()=' LOGIN ']")).click();
		
		
		
	
	  		/*//create map to store preferences
			Map<String,Object> prefs = new HashMap<String,Object>();
			
			//add key and value to map as follow to switch off browser notification
			//Pass the argument 1 to allow and 2 to block
			prefs.put("profile.default_content_setting_values.notifications", 2);
			
			//Create an instance of ChromeOptions 
			ChromeOptions options = new ChromeOptions();
			
			// set ExperimentalOption - prefs 
			options.setExperimentalOption("prefs", prefs);
			
			//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
			//WebDriver driver = new ChromeDriver(options);
*/
	
	
	}
	
}
