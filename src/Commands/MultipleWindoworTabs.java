package Commands;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindoworTabs {

	public static void main(String[] args) throws InterruptedException {
		// declaration and instantiation of objects/variables
				System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				
				//navigate to spicejet
				driver.get("https://www.naukri.com");
				

				System.out.println(driver.getTitle());
				
				//handle multiple windows
				Set<String> allwindows = driver.getWindowHandles();
				
				for (String x : allwindows) {
					
					driver.switchTo().window(x);
					if(driver.getTitle().contains("Croma")) {
						driver.close();
						break;
					}
				}
				
				//Closing all windows
				Set<String> all = driver.getWindowHandles();
				
		for (String x1 : all) {

			driver.switchTo().window(x1);
			if (driver.getTitle().contains("Croma")) {
				driver.close();

			}

			if (driver.getTitle().contains("Genpact")) {
				driver.close();

			}

			if (driver.getTitle().contains("Xoriant")) {
				driver.close();
				break;
			}

		}
				
				
				
				
	}

}
