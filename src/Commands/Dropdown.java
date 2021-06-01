package Commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*//open the site
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Select drop down
		Select dropdown = new Select (driver.findElement(By.id("testingDropdown")));
		//dropdown.selectByVisibleText("Manual Testing");
		//dropdown.selectByIndex(2);
		dropdown.selectByValue("Database");
		*/
		
		//IMp - Select multiple value in drop down
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		
		WebElement all = driver.findElement(By.name("multipleselect[]"));
		
		Select dropdown = new Select (all);
		
		//for loop
		List<WebElement> E1 = dropdown.getOptions();
		
		int count = E1.size();
		
		for (int i=0;i<=count-1;i++) {
			
		dropdown.selectByIndex(i);
		}
		
						
		/*//To get the names of all options present in dropdown
		List<WebElement> multiple = dropdown.getOptions();
		
		for (WebElement x : multiple) {
			
			
			System.out.println(x.getText());
			
		}*/
		
		//To get only selected options in dropdown
		
		List<WebElement> allopt = dropdown.getAllSelectedOptions();
		
		for (WebElement y : allopt) {
			
			System.out.println(y.getText());
		}
		
	/*	//to show first select option
		WebElement first = dropdown.getFirstSelectedOption();
		System.out.println(first.getText());*/
		
		/*
		//Deselect 
		
		dropdown.deselectAll();
		dropdown.deselectByIndex(1);
		dropdown.deselectByValue("msagile");
		dropdown.deselectByVisibleText("msagile");*/
		
		
		
		
	}

}
