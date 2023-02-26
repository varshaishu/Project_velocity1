package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class  FacebookSingUpPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@autocomplete='new-password']")
	private WebElement newPassword;
	
	@FindBy(xpath="//div[text()='Date of birth']")
	private WebElement dayofbirth;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement day;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement year;
	
	
	@FindBy(xpath="//input[@type='radio'])[3]")
	private WebElement custom;
	
	@FindBy(xpath="//select[@name='preferred_pronoun']")
	private WebElement pronoun;
	
	
	@FindBy(xpath="//input[@type='radio'])[1]")
	private WebElement female;
	
	public FacebookSingUpPage (WebDriver driver) {
		PageFactory.initElements( driver,this);
		this.driver=driver;
		wait=new WebDriverWait(driver,20);
	}
	
	public void sendFirstName(String firstname)
	{
		firstName.sendKeys(firstname);
	}
	
	public void sendLirstName(String lastname)
	{
		lastName.sendKeys(lastname);
	}
	
	public void sendMobile(String mobileno)
	{
		mobile.sendKeys(mobileno);
	}
	
	public void sendNewPassword(String newpassword)
	{
		newPassword.sendKeys(newpassword);
	}
	
	
	public void selectDay()              //dropdown code with select class
	{
		Select s=new Select(day);
		s.selectByValue("5");
	}
	public void selectMonth()
	{
		Select s=new Select(month);
		s.selectByVisibleText("Jan");
	}
	public void selectyear()
	{
		Select s=new Select(year);
		s.selectByValue("2023");
	}
	
	
	public void clickCustom()
	{
		//WebDriverWait wait=new WebDriverWait(driver,20);     //explicit wait
		wait.until(ExpectedConditions.visibilityOf(custom));   //global call
		custom.click();
	}
	
	public void clickpronoun()
	{
		//WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(pronoun));      //global call
		pronoun.click();
	}
	
	public void clickfemale()
	{
		 WebDriverWait wait=new WebDriverWait(driver,30);    //local call
		wait.until(ExpectedConditions.visibilityOf(female));
		female.click();
	}

}
