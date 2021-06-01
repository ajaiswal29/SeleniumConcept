package Commands;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {
	
	static Logger logger;

	public static void main(String[] args) {
		
		logger = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		// declaration and instantiation of objects/variables
				System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				logger.info("Launching Chrome");
				
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
				

				//maximize
				driver.manage().window().maximize();
				logger.info("Maximizing Window");

				//open the site
				driver.get("https://www.naukri.com");
				logger.info("Entering URL");

	}

}
