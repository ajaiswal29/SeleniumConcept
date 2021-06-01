package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hslf.util.SystemTimeUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utils {

	public static void capture(WebDriver driver, String screenshot) throws Exception {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			FileHandler.copy(source, new File("./screenshots/" + screenshot + ".png"));
		} catch (Exception e) {

			System.out.println("Exception while taking screesnhot" + e.getMessage());

		}
	}
}