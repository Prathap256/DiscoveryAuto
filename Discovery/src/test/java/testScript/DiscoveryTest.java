package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genriclib.BaseClass;
import genriclib.Webdrivercommonlib;
import genriclib.constants;
import genriclib.listner;
import pages.AddVideosPage;


@Listeners(listner.class)
public class DiscoveryTest {
	 public static WebDriver driver;
	
	genriclib.Webdrivercommonlib Weblib;
	
	@BeforeClass
	public void configbefrecls(){
		
		driver=BaseClass.getBrowser();
		Weblib=new Webdrivercommonlib();
		
	}
	
	@Test
	public void videostest() throws Exception{
		driver.get(constants.url);
		Reporter.log("Url Passed");
		AddVideosPage p=new AddVideosPage();
		p.selectFav();
		driver.navigate().to(constants.url);
		p.validate();
		Reporter.log("Validation success");	
	}
	
	@AfterClass
	public void configaftmtd(){
	driver.quit();	
		
	}

}
