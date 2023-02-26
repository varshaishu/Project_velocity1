package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForGetPasswordPage {
	@FindBy(xpath="//h4[text()='Trouble logging in?']")
	private WebElement troubleloggin;
	
	@FindBy(xpath="//div[@class='_aacl _aaco _aacu _aacy _aad6 _aadb']")
	private WebElement text;
	
	@FindBy(xpath="//input[@id='f291c9a5bacbf1']")
	private WebElement emailPneOrname;
	
	@FindBy(xpath="//button[text()='Send login link']")  
	private WebElement sendloginlink;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement creatNewAcct;
	
	public ForGetPasswordPage  (WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	public void sendTroubleloggin()
	{
		String s= troubleloggin.getText();
		System.out.println(s);
	}
	public void sendText()
	{
		String g=text.getText();
		System.out.println(g);
	}
	public void sendEmailOrPhone()
	{
		emailPneOrname.sendKeys("8978675645");
	}
	public void clickLoginLink()
	{
		sendloginlink.click();
	}
	public void sendCreatAccount()
	{
		creatNewAcct.click();
	}

}
