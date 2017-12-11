package loginscripts;
//import org.openqa.selenium.WebDriver;
import baseclass.openbrowser;
import homepage.homepage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class loginscript1 extends openbrowser{
	
	
//WebDriver driver;
	homepage homepage;
	
	@BeforeTest
	public void open(){
		
		setup();
	}
	@Test
	public void verifylogin() throws InterruptedException{
		
	
			homepage lp  = new homepage(driver);
			lp.script("syedmohd2soban@gmail.com", "9897979108.");

			Assert.assertEquals(lp.getInvalidLoginText(), "Email and Password do not match.");
		
	}
	
@AfterTest
public void close(){
	
	//driver.close();
}
}
