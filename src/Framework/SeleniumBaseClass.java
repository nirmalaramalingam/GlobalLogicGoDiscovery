package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class SeleniumBaseClass {

	public static String fwPath  = System.getProperty("user.dir");
	public static String reportPath = fwPath + File.separator + "Reports";
	public static String testDataPath = fwPath + File.separator + "TestData";
	public static String browserDriverPath = fwPath + File.separator + "BrowserDriver";
	public static String propertyFilePath = fwPath + File.separator + "propertyfile.property";
	public WebDriver driver;
	
	
	public String ReadProperties(String key) throws IOException
	{
		File f = new File(propertyFilePath);
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String value =p.getProperty(key);
		return value;
	}
	
	
}
