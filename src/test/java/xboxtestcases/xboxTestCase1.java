package xboxtestcases;

import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import util.SystemUtil;

import xboxbasepages.XboxLeaderboards;

public class xboxTestCase1 {
	public WebDriver driver;
	public static String driverPath;
	public XboxLeaderboards leaderboard;
	
	@BeforeTest
	public static void setUp() throws Exception {
		Properties PROP_RESOURCES = SystemUtil.loadPropertiesResources("./testdata/testdata_xbox.properties");
		driverPath = PROP_RESOURCES.getProperty("chrome");
		System.setProperty("webdriver.chrome.driver", driverPath);
	}
	
	@Test
	public void testGamerTag() throws Exception {
		leaderboard.open();
	}

}
