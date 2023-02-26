package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenSingUpPage {
	// open sing up page in instagram
	
	@FindBy(xpath="//input[@aria-label='Mobile Number or Email']")
	private WebElement mobileOrEmail;
	
	@FindBy(xpath="//input[@aria-label='Full Name']")
	private WebElement fullName;
	
	@FindBy(xpath="//input[@aria-label='Username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign up']")
	private WebElement singUp;
	@FindBy(xpath="//a[text()='Terms']")
	private WebElement terms;
	@FindBy(xpath="//a[text()='Cookies Policy']")
	private WebElement cookiesPolicy;
	
    @FindBy(xpath="(//a['text()=Privacy Policy'])[4]")
	private WebElement privacyPolicy;
	
	
	
	public OpenSingUpPage (WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public OpenSingUpPage() {
		// TODO Auto-generated constructor stub
	}

	public void sendMobileOrEmail()
	{
		mobileOrEmail.sendKeys("9867456352");
		String s=mobileOrEmail.getAttribute("aria-label");
		System.out.println(s);
	}
	public void sendFullName()
	{
		fullName.sendKeys("varsha satish rahangdale");
		String s1=fullName.getAttribute("aria-label");
		System.out.println(s1);
	}
	public void sendUsername()
	{
		userName.sendKeys("varsha");
	}
	public void sendPassword()
	{
		password.sendKeys("123456");
	}
	public void sendSingUp()
	{
		singUp.click();
		singUp.getText();
	}
	public void clickTerm()
	{
		terms.click();
	}
	public void clickPrivaypolicy()
	{
		privacyPolicy.click();
	}
	public void clickCookiespolicy()
	{
		cookiesPolicy.click();
	}

}
