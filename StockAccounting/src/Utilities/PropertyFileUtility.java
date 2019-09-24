package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class PropertyFileUtility {

	
	public static String getValueForKey(String Key) throws Throwable
	{
		
		Properties configproperty=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Shyam\\eclipse-workspace\\StockAccounting\\PropertyFiles\\Environment.property");
		configproperty.load(fis);
		return configproperty.getProperty(Key);
		
	}
}
