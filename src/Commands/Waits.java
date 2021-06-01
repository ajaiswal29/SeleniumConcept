package Commands;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void main(String[] args) {

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//open the site
	driver.get("https://artoftesting.com/samplesiteforselenium");
	
	//maximize the window
	driver.manage().window().maximize();
	
	//Implicit wait 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Explicit wait
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("testingDropdown"))));
	
	//a. Fluent wait - It is under Explicit wait
	Wait waits = new FluentWait(driver);
	waits.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("testingDropdown"))));
	//waits.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("testingDropdown"))));
	
	//Polling wait - currently not in used
	Wait waiting = new FluentWait(driver).pollingEvery(10,TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
	
	

}
}