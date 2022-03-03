package xboxbasepages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.Page;
import util.SystemUtil;
import util.TestCaseBase;

public class XboxLeaderboards extends Page {
	public static String xbox="Xbox Leaderboards - Xbox Gamertag";
	
	@FindBy(className = "row")
	public WebElement board;
	
	@FindBy(xpath = "//div[@class='row']/div[text()=1]")
	public WebElement firstplace;
	
	@FindBy(xpath = "//div[@class='row']/div[text()=2]")
	public WebElement secondplace;
	
	@FindBy(xpath = "//div[@class='row']/div[text()=3]")
	public WebElement thirdplace;
	
	@FindBy(xpath = "//div[@class='row']/div[text()=4]")
	public WebElement fourthplace;
	
	@FindBy(xpath = "//div[@class='row']/div[text()=5]")
	public WebElement fifthplace;
	
	public XboxLeaderboards open() throws Exception{
		Properties PROP_RESOURCES = SystemUtil.loadPropertiesResources("./testdata/xbox_leaderboards.properties");
		String URL = PROP_RESOURCES.getProperty("baseUrl");
		TestCaseBase.threadDriver.get().navigate().to(URL);
		
		return this;
	}
	
	public boolean getGamertags() {
		//System.out.println(gamertag1.getText());
		boolean result = true;
		Properties PROPERTIES_RESOURCES = SystemUtil
		.loadPropertiesResources("/testdata_xbox.properties");
		String user1 = PROPERTIES_RESOURCES.getProperty("gamer1");
		String user2 = PROPERTIES_RESOURCES.getProperty("gamer2");
		String user3 = PROPERTIES_RESOURCES.getProperty("gamer3");
		String user4 = PROPERTIES_RESOURCES.getProperty("gamer4");
		String user5 = PROPERTIES_RESOURCES.getProperty("gamer5");



		if (!user1.equals(firstplace.getText())) {
		result = false;
		System.out.println("expected: " + user1 + " actual: " + firstplace.getText() );
		}
		if (!user2.equals(secondplace.getText())) {
		result = false;
		System.out.println("expected: " + user2 + " actual: " + secondplace.getText() );
		}
		if (!user3.equals(thirdplace.getText())) {
		result = false;
		System.out.println("expected: " + user3 + " actual: " + thirdplace.getText() );
		}
		if (!user4.equals(fourthplace.getText())) {
		result = false;
		System.out.println("expected: " + user4 + " actual: " + fourthplace.getText() );
		}
		if (!user5.equals(fifthplace.getText())) {
		result = false;
		System.out.println("expected: " + user5 + " actual: " + fifthplace.getText() );
		}





		System.out.println("expected: " + user1 + " actual: " + firstplace.getText() );
		System.out.println("expected: " + user2 + " actual: " + secondplace.getText() );
		System.out.println("expected: " + user3 + " actual: " + thirdplace.getText() );
		System.out.println("expected: " + user4 + " actual: " + fourthplace.getText() );
		System.out.println("expected: " + user5 + " actual: " + fifthplace.getText() );
		return result;
		}





		}

	
	
	
	
	
	
	
	
	
	