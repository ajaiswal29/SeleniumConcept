package Commands;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\52089263\\Downloads\\software\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new ChromeDriver();
		
		
		String baseurl = "http://demo.guru99.com/test/newtours/";
		
		driver.get(baseurl);
		
		WebElement hover = driver.findElement(By.xpath("//tr[@class='mouseOut'][1]/td[2]"));
		
		Actions Act = new Actions (driver);
		
		Act.moveToElement(hover).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.get("https://www.naukri.com/");
		
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		
		Actions act = new Actions (driver);
		
		act.moveToElement(jobs).perform();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//open new tab by pressing (Control+t)
		
		act.sendKeys(Keys.F5).perform();
		
		Thread.sleep(5000);
		
		act.sendKeys(Keys.CONTROL).sendKeys("t").perform();*/
		
		
		
		
		

	}

}
