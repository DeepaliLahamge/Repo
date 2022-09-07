package Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.PropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
public static WebDriver driver;

public void initialization() throws Exception {
	
	WebDriverManager.chromedriver().setup();
	
	driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get(Utility.PropertyFile.ReadProperty("url"));
	 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
}

