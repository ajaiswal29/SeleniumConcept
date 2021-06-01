package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indexing {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22782/nz-vs-ind-2nd-test-india-tour-of-new-zealand-2020");
		
		//calculate total rows and column
				
		int totalrows = driver.findElements(By.xpath("//div[@id='innings_1']/div[1]/div[2]/div[text()='Batsman']/../following-sibling::div")).size();
		System.out.println(totalrows-2);
		
		int totalcol = driver.findElements(By.xpath("//div[@id='innings_1']/div[1]/div[2]/div[text()='Batsman']/../div")).size();
		System.out.println(totalcol);

		for (int rows=1;rows<=totalrows-2;rows++) {
			for (int cols=1;cols<=totalcol;cols++) {
				
				WebElement text = driver.findElement(By.xpath("//div[@id='innings_1']/div[1]/div[2]/div[text()='Batsman']/../following-sibling::div["+rows+"]/div["+cols+"]"));
				System.out.print(text.getText());
				System.out.print(" ");
			}
		System.out.println();
		}
		
		
		
		
	}

}