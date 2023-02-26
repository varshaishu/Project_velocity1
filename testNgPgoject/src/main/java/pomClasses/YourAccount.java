package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccount {
	//amazon application
	// Mouse Action
	
	private WebDriver driver;
    private Action action;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement singAccount;
	
	@FindBy(xpath="//span[text()='Account']")
	private WebElement account;
	
	@FindBy(xpath="")
	private WebElement acc;
	
	@FindBy(xpath="(//a[text()='Shop now'])[2]");
	private WebElement shopNow;
	
	//@FindBy(xpath="")
	//private WebElement creatNewAcct;
	
	

	public YourAccount (WebDriver driver) {
		PageFactory.initElements( driver,this);
		this.driver=driver;
		//action=new Action(this.driver);
		//Or
		//action=new Action(driver);
		
	}
	public void clickOnsingAccount()
	{
		Actions action=new Actions(driver);    // hoow to handle mouse action
		action.moveToElement(singAccount).moveToElement(account).build().perform();
	}
	
	public void showShopNow()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;    //how to handle the scroll down
		js.executeScript("arguments[0].scrollIntoView(true);", shopNow);
		shopNow.click();
	}
}
	
