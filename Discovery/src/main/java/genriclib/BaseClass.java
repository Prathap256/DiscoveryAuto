package genriclib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseClass {
	public static WebDriver driver;
	public static WebDriver getBrowser(){
		if(constants.Browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//main//resources//chromedriver.exe");
				driver=new ChromeDriver();
		}else if(constants.Browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "");
			driver=new InternetExplorerDriver();
		}else if(constants.Browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "");
			driver=new FirefoxDriver();
		}
		return driver;
					
		}

}
