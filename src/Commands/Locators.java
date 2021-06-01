package Commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws Throwable {
	
	// declaration and instantiation of objects/variables
	System.setProperty("webdriver.chrome.driver","C:\\Users\\52089263\\Downloads\\software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	//navigate to facebook
	driver.get("https://www.facebook.com/");
	
	//to find count of all the elements on the page
	List<WebElement> allelements =  driver.findElements(By.xpath("//*"));
	System.out.println(allelements.size());
	
	
		for (WebElement x : allelements) {

			// print tagname
			System.out.println(x.getTagName());
			// print text
			System.out.println(x.getText());
			// get attributes
			System.out.println(x.getAttribute("href"));

		}
		
		//we can the color of the button 
		//String buttonColor = driver.findElement(By.name("submit")).getCssValue("background-color");
		
		
	//Imp- To find count of all links present on page	
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
			System.out.println(alllinks.size());
		
		 for (WebElement y : alllinks) {
			 
			 System.out.println(y.getText());
		 }

	/*
		//types of xpath
		//1.Contains - it is used where attributes changes dynamically
		List <WebElement> all = driver.findElements(By.xpath("//*[contains(text(),'Sign Up')]"));
		//or
		List <WebElement> all1 = driver.findElements(By.xpath("//*[contains(@name,'web')]"));
		
		System.out.println(all.size());
		System.out.println(all1.size());
		
		//2.text - use to search exact text
		driver.findElement(By.xpath("//*[text()='Create an account'])")).click();
		
		//3.or
		driver.findElement(By.xpath("//*[@name='firstname' or @name='lastname'])"));
		
		//4.AND
		driver.findElement(By.xpath("//*[@name='firstname' and @name='lastname']"));
		
		//5.Xpath axes method
		//a.following - It is used to find xpath follwed by something.
		driver.findElement(By.xpath("//input[@name='lastname']//following::i[1]"));
		
		//b.ancestor
		driver.findElement(By.xpath("//input[@name='lastname']//ancestor::div[1]"));
	
		//c.descendant
		driver.findElement(By.xpath("//*[@class='mbm _1iy_ _a4y rfloat _ohf']//descendant::div[2]"));
		
		//d.child
		driver.findElement(By.xpath("//*[@class='mbm _1iy_ _a4y rfloat _ohf']//child::div[1]"));
		
		//e.preceding
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']//preceding::i[1]"));
		
		//f.parent
		driver.findElement(By.xpath("//input[@name='firstname']//parent::div"));
		//or
		driver.findElement(By.xpath("//input[@name='firstname']//.."));
		
		//g.following-sibling
		driver.findElement(By.xpath(" xpath=//*[@type='submit']//following-sibling::input"));
	*/
	
		//2.CSS
		//syntax - tagname[attribute='value']
		
		//a. class - it is define by '.'
		//input[class='abc'] = input.abc
		
		//b. id - it is define by '#'
		//input[id='abc'] = input#abc 

}
}