package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class paypal {

	public static void main(String[] args) throws Throwable {
		
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//maximize window
		driver.manage().window().maximize();
		
		//Open paypal
		driver.get("https://www.paypal.com/in/webapps/mpp/home");
		
		//Click on login button
		driver.findElement(By.id("ul-btn")).click();
		
		//enter email
		driver.findElement(By.name("login_email")).sendKeys("ankitjaiswal.998@gmail.com");
		
		//click on next
		driver.findElement(By.xpath("//button[@class='button actionContinue scTrack:unifiedlogin-login-click-next']")).click();
		
		/*//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("\"//input[@id='password']"))));*/
		
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ankit@123");
		
		//click on login button
		driver.findElement(By.id("btnLogin")).click();
		
		

	}

}
