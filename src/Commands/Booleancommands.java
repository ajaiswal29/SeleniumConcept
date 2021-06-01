package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booleancommands {

	public static void main(String[] args) {
		
		//IsDisplayed
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		driver.manage().window().maximize();
		//driver.switchTo().alert().dismiss();
		
		Boolean abc = driver.findElement(By.className("g-menu-item-container")).isDisplayed();
		
		System.out.println(abc);
	
	
		//IsEnabled - It is used to check whether weblemenet is enabled or disabled
		Boolean m = driver.findElement(By.xpath("abc")).isEnabled();
		
		//IsSelected - It is used check whether webelement is selected or not
		Boolean n = driver.findElement(By.name("abc")).isSelected();
		
		
	
	
	}

}
