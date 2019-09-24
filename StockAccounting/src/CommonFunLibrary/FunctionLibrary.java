package CommonFunLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.PropertyFileUtility;

public class FunctionLibrary {
	
	WebDriver driver;
	
	// Start the Browser
	public static WebDriver startBrowser(WebDriver driver) throws Throwable
	{
		
		if(PropertyFileUtility.getValueForKey("Browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Shyam\\eclipse-workspace\\StockAccounting\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		return driver;
		
	}
	

}
