package StepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Framework.SeleniumImplementation;



public class task extends SeleniumImplementation
{
	HomePage hp;
	
	@Test
	public void testTask1() throws AWTException, InterruptedException
	{
	
	launchBrowser();
	navigateUrl();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	hp = new HomePage(driver);
	//Click Shows tab
	
	explicitWait(hp.showstab,20);
	hp.clickShowTab();;
	//hp.clickShowTab();
	explicitWait(hp.seeAllShowsLink,20);
	hp.clickSeeAllShows();
	
	//select the shows which contain APOLLO
	explicitWait(hp.searchIcon,20);
	hp.clickSearchicon();
	//explicitWait(hp.searchDiscoveryEditbox,20);
	//hp.clickSearchDiscoveryEditbox();
	hp.searchDiscoveryEditbox.sendKeys("APOLLO");
	
	hp.viewAllResultsLink.click();
	Thread.sleep(5000);
	
	//driver.navigate().refresh();
	
	/*List<WebElement> a = driver.findElements(By.xpath("//div[@class='search-grid-tile searchGridTile__container']"));
	int s = a.size();
	System.out.println(s);
	{
		
	}*/
	//clicking +sign of first link
	explicitWait(hp.apolloLink1,20);
	String ActapolloLink1Text = hp.apolloLink1.getAttribute("ahref");
	hp.apolloLink1.click();
	
	explicitWait(hp.apolloLink1PlusSign,20);
	if(hp.apolloLink1PlusSign.isDisplayed())
	{
		Assert.assertTrue(true);
		System.out.println("Plus sign present");
	}
	hp.apolloLink1PlusSign.click();
	if(hp.apolloLink1MinusSign.isDisplayed())
	{
		Assert.assertTrue(true);
		System.out.println("Minus sign present");
	}
	explicitWait(hp.searchIcon,20);
	hp.clickSearchicon();
	//explicitWait(hp.searchDiscoveryEditbox,20);
	//hp.clickSearchDiscoveryEditbox();
	//hp.searchDiscoveryEditbox.sendKeys("APOLLO");
	hp.viewAllResultsLink.click();
	
	//clicking + sign of link2
	explicitWait(hp.apolloLink2,20);
	String ActapolloLink2Text = hp.apolloLink2.getAttribute("ahref");
	hp.apolloLink2.click();
	
	explicitWait(hp.apolloLink2PlusSign,20);
	if(hp.apolloLink2PlusSign.isDisplayed())
	{
		Assert.assertTrue(true);
		System.out.println("Plus sign present");
	}
	hp.apolloLink2PlusSign.click();
	if(hp.apolloLink1MinusSign.isDisplayed())
	{
		Assert.assertTrue(true);
		System.out.println("Minus sign present");
	}
	
	explicitWait(hp.notificationLink,20);
	hp.notificationLink.click();
	
	explicitWait(hp.myVideosLink, 20);
	hp.myVideosLink.click();
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	explicitWait(hp.favouriteShowsText,20);
	
	explicitWait(hp.favouriteLink1,20);
	String expLink1 = hp.favouriteLink1.getAttribute("a");
	
	explicitWait(hp.favouriteLink2,20);
	String expLink2 = hp.favouriteLink2.getAttribute("a");
	
	
	Assert.assertEquals(ActapolloLink1Text, expLink1);
	System.out.println("Link1 present in favorite");
	
	Assert.assertEquals(ActapolloLink2Text, expLink2);
	System.out.println("Link2 present in favorite");
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
