package testNgPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.LoginorSingUpPage;
import pomClasses.OpenSingUpPage;
import pomClasses.SingInAmazon;

public class CopyPaste {
	WebDriver driver;
	SingInAmazon singInAmazon;
	@BeforeClass
	public void launchtheBrowser()
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		//driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		singInAmazon=new SingInAmazon(driver);
		
		
	}
	
	@BeforeMethod
	public void serchS()
	{
		singInAmazon.searchSaree();
	}
	
	@Test
	public void takeSaree()
	{
		singInAmazon.goToSareePage();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)");
		js.executeScript("window.scrollBy(0,3000)");
		singInAmazon.addTokart();
		js.executeScript("window.scrollBy(0,3000)");
		//singInAmazon.goToSareePage();
	}
	//@Test
//	public void clickaddTocart() throws InterruptedException
//	{
//		singInAmazon.addTokart();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,3000)");
//		singInAmazon.addTokart();
//		Thread.sleep(7000);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		@Test
//		public void verifyPrivacyPolicyLink() throws InterruptedException
//		{
//			OpenSingUpPage openSingUpPage=new OpenSingUpPage(driver);
//			openSingUpPage.clickPrivaypolicy();
//			Thread.sleep(7000);
//			
//			ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(addr.get(1));
//			String url=driver.getCurrentUrl();
//			if(url.equals("http://www.instagram.com")) 
//			{
//				System.out.println("pass");
//			}
//			else
//			{
//				System.out.println("fail");
//			}
//		}
//		@Test
//		public void verifyCookiesPolicyLink() throws InterruptedException
//		{
//			OpenSingUpPage openSingUpPage =new OpenSingUpPage (driver);
//			 Thread.sleep(7000);
//			openSingUpPage.clickCookiespolicy();
//			
//			ArrayList<String> addr1=new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(addr1.get(1));
//			String url=driver.getCurrentUrl();
//			if(url.equals("http://www.instagram.com")) 
//			{
//				System.out.println("pass");
//			}
//			else
//			{
//				System.out.println("fail");
//			}
//		}
	

}
