package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShots {
	
	public static void capturescreenshot(WebDriver driver,String methodName) throws IOException
	{
		TakesScreenshot s=(TakesScreenshot)driver;
		File source =s.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\HP\\eclipse-workspace\\Myntra\\Screenshot\\"+methodName+".png");
		FileHandler.copy(source, destination);
	}

}
