package homepage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import loginscripts.loginscript1;

public class homepage {
	public static Logger logger = Logger.getLogger(homepage.class.getClass());
	WebDriver driver;



public homepage(WebDriver driver){
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id='ch_login_icon']/span[2]")
WebElement loginbutton;
@FindBy(xpath="//*[@id='ch_login_email']")
WebElement email;
@FindBy(xpath="//*[@id='ch_login_password']")
WebElement password;
@FindBy(xpath="//*[@id='ch_login_btn']")
WebElement loginsubmit;

@FindBy(xpath="//*[contains(text(),'Email and Password do not match.')]")
WebElement invalidpass;
//driver.findElement(By.xpath()).click();


public void script(String un,String pwd) throws InterruptedException{
	
	loginbutton.click();
	logger.info("Click on singinbutton ..  " +loginbutton.toString());

	email.sendKeys(un);
	logger.info("Write email .. "+email.toString());

	password.sendKeys(pwd);
	logger.info("Write password ..  "+password.toString());
	
	loginsubmit.click();
	logger.info("Click on submit  ..  "+loginsubmit.toString());
	Thread.sleep(10000);
}
public String getInvalidLoginText(){
	logger.info("return invalid message  .." +invalidpass.toString());
	return invalidpass.getText();
	
}
}