package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Alert {
	

	public static void main(String[] args) throws InterruptedException {
		
		// declaration and instantiation of objects/variables
				System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				
				//handle default browser alert
				driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
				
				WebElement alerts = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
				alerts.click();
				
				//alert with ok
				driver.switchTo().alert().accept();

				//switch to ok and cancel alert
				driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
				
				//alert with ok and cancel
				driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
				Thread.sleep(5000);
				driver.switchTo().alert().accept();
	
				//switch to text alert
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[text()='Alert with Textbox']")).click();
				
				//alert with textbox
				driver.findElement(By.xpath("//a[@aria-expanded='true']")).click();
				Thread.sleep(5000);
				driver.switchTo().alert().sendKeys("Automation Testing By Ankit");
				driver.switchTo().alert().accept();
				
				
				//OR
				
				/*driver.get("http://demo.guru99.com/test/delete_customer.php");
				//enter cutsomer id
				driver.findElement(By.name("cusid")).sendKeys("53920");
				//click on submit
				driver.findElement(By.name("submit")).click();
				
				//switching to alert
				org.openqa.selenium.Alert alert = driver.switchTo().alert();
				
				//accept
				alert.accept();
				
				//dismiss
				alert.dismiss();*/
				
	
	}

}
