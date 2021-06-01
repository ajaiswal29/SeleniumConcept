package Commands;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		
         String imagepath = "C:\\Users\\52089263\\Desktop\\Demo files\\demo.docx";
		
		//Specify the file location with extension 
		StringSelection selection = new StringSelection(imagepath);
		
		//Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//click on browse
		WebElement addfile = driver.findElement(By.xpath("//input[@name='files[]']"));
		addfile.click();
		
		//create object of Robot Class
		
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
			robot.delay(2000);
			//press enter
			robot.keyPress(KeyEvent.VK_ENTER);
			
			//Release Enter
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			//press ctrl+v
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			//release ctrl+v
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			//press enter
			robot.keyPress(KeyEvent.VK_ENTER);
			
			//Release Enter
			robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
