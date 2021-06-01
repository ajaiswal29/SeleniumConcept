package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageFrame");
		
		
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/json/BooleanCoercer.html']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageListFrame");
		
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
		
		driver.close();
		
		
	}
	
	
}
