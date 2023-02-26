package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPage { 
	WebDriver driver;
	WebDriverWait wait;
	
	//@FindBy(xpath="//input[@id='email']")
	//private WebElement emailOrPhoneno;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailOrPhoneno;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='loginbutton']")
	private WebElement login;
	
	public FacebookLoginPage  (WebDriver driver) {
		PageFactory.initElements( driver,this);
		this.driver=driver;
		wait=new WebDriverWait(driver,10);
	}
	
	public void sendEmailOrPhoneNo()
	{
		emailOrPhoneno.sendKeys("varsha");
		
		
	}
	public void sendPassword()
	{
		password.sendKeys("123456");
	}
	public void clickLogin()
	{
		login.click();
	}

	
}
