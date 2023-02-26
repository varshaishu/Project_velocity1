package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingInAmazon {
	
	WebDriver driver;
	// amazon application
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement singAccount;
    
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchTitle;
	@FindBy(xpath="(//img[@class='s-image'])[1]")
	private WebElement saree;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchGo;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCart;
	//input[@id='add-to-cart-button']
	public SingInAmazon(WebDriver driver) {
		PageFactory.initElements( driver,this);
		this.driver=driver;
		
	}
	public void searchSaree()
	{
		searchTitle.sendKeys("saree");
		searchGo.click();
		
	}
	public void goToSareePage()
	{
		saree.click();
		
		
	}
	public void addTokart()
	{
		addToCart.click();
	}
}
