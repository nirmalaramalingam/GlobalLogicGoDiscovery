package Framework;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class SeleniumImplementation extends SeleniumBaseClass

{
	
	public void launchBrowser()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", browserDriverPath + "\\chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void navigateUrl()
	{
		try
		{
		driver.get(ReadProperties("discoveryurl"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void explicitWait(WebElement element, long tu)
	{
		try
		{
		WebDriverWait w = new WebDriverWait(driver,tu);
		w.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void javascriptExecutorScrollToView(WebElement element)
	{
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} 
		catch (Exception e)
		{
			e.printStackTrace();		
			Assert.assertTrue(false);
		}
	}
	public void javaScriptExecutorClick(WebElement element)
	{
		try 
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", element);	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			Assert.assertFalse(true);
		}
		
	}
	

	
	

}
