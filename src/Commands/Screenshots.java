package Commands;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Screenshots {
	
		 
	public static void main(String[] args) throws IOException {
	
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		//maximize
		driver.manage().window().maximize();

		//open the site
		driver.get("https://www.naukri.com");
		
		try {
			WebElement print = driver.findElement(By.xpath("//*[text()='This is not sample text!']"));

		} catch (NoSuchElementException e) {
			
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			org.openqa.selenium.io.FileHandler.copy(screenshotFile,
					new File("C:\\Users\\52089263\\Pictures\\screenshots\\ankit.png"));
		}
		
		//multiple screenshots --- we use counter method or calender method
		Calendar cal = Calendar.getInstance();
		Long Timestmp = cal.getTimeInMillis();
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(scr,new File ("C:\\Users\\52089263\\Pictures\\screenshots\\ankit" +Timestmp+ ".png"));
		 
	}			 

}
