package Commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//navigate to spicejet
		driver.get("https://www.spicejet.com");
		
		//maximize
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		//Create weblelement of checkbox 
		WebElement check = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		
		//check whether checkbox is selected or not
		boolean isChecked = check.isSelected();
		System.out.println(isChecked);
		
		//now click the checkbox
		check.click();
		
		//again check
		isChecked = check.isSelected();
		System.out.println(isChecked);
		
		
	}

}
