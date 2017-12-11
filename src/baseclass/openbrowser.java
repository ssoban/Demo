package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class openbrowser {
	
	public static Logger logger = Logger.getLogger(openbrowser.class.getClass());

	public WebDriver driver;

	public void setup() {
		logger.info("Hello.. Browser opening  in Debug method");
	    String key= "webdriver.firefox.marionette";
	    String path= "E:\\geckodriver-v0.15.0-win64\\geckodriver.exe";
	    System.setProperty(key, path);
	    
	    driver = new FirefoxDriver();
	    logger.info("Firefox.. Browser opened in Debug method");
	    driver.get("https://www.makemytrip.com/");
	    logger.info("Navigate to makemytrip completed in Firefox.. Browser opened in Debug method");
	    driver.manage().window().maximize();
	    logger.info("Firefox.. Browser is maximize suceess in Debug method");
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

}
}