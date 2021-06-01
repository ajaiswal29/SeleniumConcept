package Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {

	WebDriver driver;

	@BeforeMethod

	@Parameters("Browser")

	public void verifytitle(String browsername) {

		if (browsername.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browsername.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\52089263\\Downloads\\software\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

	}

	@Test
	public void launchwebsite() {

		driver.manage().window().maximize();
		driver.get("https://login.wordpress.org/");

	}

	@AfterMethod

	public void close() {

		driver.close();
	}

}
