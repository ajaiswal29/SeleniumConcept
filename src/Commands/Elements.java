package Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements{

	
	public static void main(String[] args) throws Throwable {
		
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//Task open google and enter q in search box by initializing Webelement search box
		
		driver.navigate().to("https://www.google.com");
		
		WebElement send = driver.findElement(By.name("q"));
		
		send.sendKeys("https://artoftesting.com/");
		
		driver.findElement(By.className("gNO89b")).click();
		
		driver.close();
	
	
	
	
	
	
}
}