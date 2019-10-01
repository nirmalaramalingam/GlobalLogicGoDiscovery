package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.SeleniumImplementation;

public class HomePage 
{

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Shows']")
	public WebElement showstab;
	
	@FindBy(xpath="(//a[text()='See All Shows'])[1]")
	public WebElement seeAllShowsLink;
	
	@FindBy(xpath="//div[@class='headerSearch__searchIcon ']")
	public WebElement searchIcon;
	
	@FindBy(xpath="//input[@placeholder='Search Discovery']")
	public WebElement searchDiscoveryEditbox;
	
	@FindBy(xpath="(//div[@class='searchGridTile__image'])[1]")
	//div[@class='searchGrid__tilesList']//a[1]
	public WebElement apolloLink1;
	
	@FindBy(xpath="(//div[@class='searchGridTile__image'])[2]")
	public WebElement apolloLink2;
	
	@FindBy(xpath="//img[@alt='Apollo: The Forgotten Films']//following::i[1]")
	public WebElement apolloLink1PlusSign;
	
	@FindBy(xpath="//i[@class='flipIconCore__icon icon-minus ']")
	public WebElement apolloLink1MinusSign;
	
	@FindBy(xpath="//img[@alt='Confessions From Space: Apollo']//following::i[1]")
	public WebElement apolloLink2PlusSign;
	
	@FindBy(xpath="//li[@class='dscHeaderMain__hideMobile']")
	public WebElement notificationLink;
	
	@FindBy(xpath="//span[text()='My Videos']")
	public WebElement myVideosLink;
	
	@FindBy(xpath="//div[@class='showGridTile__container']//a")
	public WebElement allShowLinks;
	
	@FindBy(xpath="//a[@class='arrowLink__main searchTypeAhead__viewAllLink']")
	public WebElement viewAllResultsLink;
	
	@FindBy(xpath="//h2[text()='Favorite Shows']")
	public WebElement favouriteShowsText;
	
	@FindBy(xpath="(//section[@class='tile showTileSquare__main transition-in']//a)[1]")
	public WebElement favouriteLink1;
	
	@FindBy(xpath="(//section[@class='tile showTileSquare__main transition-in']//a)[2]")
	public WebElement favouriteLink2;
	
	@FindBy(xpath="//h2[text()='Popular Shows']")
	public WebElement popularShowsText;
	
	@FindBy(xpath="(//div[@role='button']//i)[7]")
	public WebElement forwardArrow1;
	
	@FindBy(xpath="(//div[@role='button']//i)[8]")
	public WebElement forwardArrow;
	
	@FindBy(xpath="(//button[text()='Explore the Show'])[15]")
	public WebElement exploreTheShowButton;
	
	@FindBy(xpath="//button[text()='Show More']")
	public WebElement showMoreButton;
	
	@FindBy(xpath="(//div[@role='button']//i)[1]")
	public WebElement forwardArrowVideos;
	
	@FindBy(xpath="//p[@class='minutes']")
	public WebElement minutes;
	
	public void clickShowTab()
	{
		showstab.click();
	}
	public void clickSeeAllShows()
	{
		seeAllShowsLink.click();
	}
	public void clickSearchicon()
	{
		searchIcon.click();
	}
	public void clickSearchDiscoveryEditbox()
	{
		searchDiscoveryEditbox.click();
	}
	public void clickApolloLink1()
	{
		apolloLink1.click();
	}
	public void clickApolloLink2()
	{
		apolloLink2.click();
	}
	
}

