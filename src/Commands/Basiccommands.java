package Commands;

/*In this we open demosite "artoftesting"
we fetch the written text
We click on given link
In textbox we write something after then we clear and again write the text
Click on submit button
Find the radio button
Check the checkbox by css
Select the dropdown*/


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basiccommands {

	public static void main(String[] args) throws InterruptedException {
		
		// declaration and instantiation of objects/variables
				System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	
		//open the site
				driver.get("https://artoftesting.com/samplesiteforselenium");
				
		//maximize the window
				driver.manage().window().maximize();
				
		//fetch the text
				String text = driver.findElement(By.id("idOfDiv")).getText();
				System.out.println(text);
				
		//Click on the link by linktext
				//driver.findElement(By.linkText("This is a link")).click();
				
		//enter text in search
				WebElement clr = driver.findElement(By.id("fname"));
				clr.sendKeys("Ankit");
				
		//Now clear that text and again write
				Thread.sleep(5000);
				clr.clear();
				clr.sendKeys("Ankit Jaiswal");
				
		//click on submit button
				driver.findElement(By.id("idOfButton")).click();
				
				
		//select radio button
				driver.findElement(By.id("male")).click();
				
		//select checkbox
				driver.findElement(By.cssSelector("input.Automation")).click();
				//or
				//driver.findElement(By.cssSelector("input[class='Automation']")).click();
	
		//Select drop down
				Select dropdown = new Select (driver.findElement(By.id("testingDropdown")));
				dropdown.selectByIndex(2);
				
		//refresh the browser
				driver.navigate().refresh();
				
		//close driver
				driver.close();
	
	
	}

}
