package StepDefinition;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Framework.SeleniumImplementation;

public class task2_new extends SeleniumImplementation
{
@Test
public void testTask2() throws IOException
{
	HomePage hp;
	
	launchBrowser();
	navigateUrl();
	
	hp = new HomePage(driver);
	javascriptExecutorScrollToView(hp.popularShowsText);
	
	explicitWait(hp.forwardArrow1,20);
	hp.forwardArrow1.click();
	
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();

	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.forwardArrow,20);
	hp.forwardArrow.click();
	
	explicitWait(hp.exploreTheShowButton,20);
	hp.exploreTheShowButton.click();
	
	javascriptExecutorScrollToView(hp.showMoreButton);
	explicitWait(hp.showMoreButton,20);
	javaScriptExecutorClick(hp.showMoreButton);
	
	javascriptExecutorScrollToView(hp.showMoreButton);
	explicitWait(hp.showMoreButton,20);
	javaScriptExecutorClick(hp.showMoreButton);
	
	/*
	javascriptExecutorScrollToView(hp.showMoreButton);
	explicitWait(hp.showMoreButton,20);
	javaScriptExecutorClick(hp.showMoreButton);
	
	javascriptExecutorScrollToView(hp.showMoreButton);
	explicitWait(hp.showMoreButton,20);
	javaScriptExecutorClick(hp.showMoreButton);*/
/*	
	explicitWait(hp.forwardArrowVideos,20);
	hp.forwardArrowVideos.click();*/
	
	List<WebElement> all =driver.findElements(By.xpath("//p[@class='episodeTitle']"));
	int si = all.size();
	System.out.println(si);
	for(WebElement a1:all)
	{
		String details = (a1.getText() + " minutes is " + hp.minutes.getText());
		FileWriter f = new FileWriter(testDataPath + "\\details.txt",true);
		BufferedWriter bf = new BufferedWriter(f);
		bf.write(details);
		bf.newLine();
		bf.flush();
	}
	
	}

}
