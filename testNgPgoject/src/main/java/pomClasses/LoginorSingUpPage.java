package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginorSingUpPage {
	
	// variable :WebElement : Login or Sing Up Page of instagram
	@FindBy(xpath="//input[@aria-label='Phone number, username, or email']")
	private WebElement emailorPhoneNo;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//a[text()='Forgot password?']")
	private WebElement forgotpassword;
	
	@FindBy(xpath="//span[text()='Sign up']")
	private WebElement creatNewAccountButton;
	
	
	//Constructor: Initialization of WebElement: Login or sing Up Page
	
	public LoginorSingUpPage (WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	// Methods: Action on WebElement : Login or sing Up Page
	
	public void sendEmailOrPhoneNo (String email)
	{
		emailorPhoneNo.sendKeys(email);
	}
	
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnLoginButton()
	{
		login.click();
	}
	public void  clickOnForgetPassword()
	{
		forgotpassword.click(); 
	}
	public void openSingUpForm()
	{
		creatNewAccountButton.click();	
	}

}
