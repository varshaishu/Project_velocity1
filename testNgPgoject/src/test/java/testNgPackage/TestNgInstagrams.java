package testNgPackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomClasses.ForGetPasswordPage;
import pomClasses.LoginorSingUpPage;
import pomClasses.OpenSingUpPage;
import utils.Utility;

public class TestNgInstagrams {
		
	WebDriver driver;
	OpenSingUpPage openSingUpPage;
	LoginorSingUpPage loginorSingUpPage;
	private String testId;
	
	@Parameters
	@BeforeClass
	public void launchtheBrowser()
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		//driver.manage().window().maximize();
		driver.get("http://www.instagram.com");
		openSingUpPage=new OpenSingUpPage(driver);
		loginorSingUpPage=new LoginorSingUpPage(driver);
		
	}
	
	
	@BeforeMethod
	public void loginPage()
	{
		//excelsheet code
		 Stinrg data=Utility.getDataFromExcelSheeet("Book1"  1,0);
		loginorSingUpPage. sendEmailOrPhoneNo (data);
		
		data=Utility.getDataFromExcelSheeet("Book1"  1,1);
		loginorSingUpPage.sendPassword(data);
		
		//OR
		loginorSingUpPage.sendPassword(Utility.getDataFromExcelSheeet("Book1"  1,1));
		
		//excelsheet code end
		loginorSingUpPage.clickOnLoginButton();
		loginorSingUpPage.openSingUpForm();
		//loginorSingUpPage.clickOnForgetPassword();
		
	}
	//@Test
	//public void openForgetPassword()
	//{
	//testId="TC101";
		//ForGetPasswordPage forGetPasswordPage=new ForGetPasswordPage(driver);
				//forGetPasswordPage.sendTroubleloggin();
				//forGetPasswordPage.sendText();
				//forGetPasswordPage.sendEmailOrPhone();
				//forGetPasswordPage.clickLoginLink();
				//forGetPasswordPage.sendCreatAccount();
					
	//}
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		// screenshot code
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.captureScreenShot(testId);
		}
		//screeenshot code end
		
		
		
		
		
		System.out.println("After method");
		driver.close();
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		//driver.close();
		
	}
	//@Test
//	public void verifyTermLink() throws InterruptedException
//	{
	//testId="TC102"
//		
//		openSingUpPage.clickTerm();
//		Thread.sleep(5000);
//		
//		//driver.close();
//		
//		
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
//		//String actualurl="https://help.instagram.com/581066165581870/?locale=en_US";
//		//String expectedurl="http://www.instagram.com";
//		//Assert.assertNotEquals(actualurl, expectedurl); 
//		//Assert.assertEquals(actualurl, expectedurl); 
//		//boolean result=actualurl.equals(expectedurl);
//		//Assert.assertFalse(result,"current url not found");
//		//Assert.assertTrue(result,"current url not found");
//		//Assert.fail();
//		
//	}
	
	@Test(priority=1, enabled=false)
	public void verifyPrivacyPolicyLink() throws InterruptedException
	{
		
		openSingUpPage.clickPrivaypolicy();
		Thread.sleep(7000);
		
		
		String url=driver.getCurrentUrl();
		if(url.equals("http://www.instagram.com")) 
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void verifyCookiesPolicyLink() throws InterruptedException
	{
		
		 Thread.sleep(7000);
		openSingUpPage.clickCookiespolicy();
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		SoftAssert softAssert=new SoftAssert();
		String actualurl="https://help.instagram.com/1896641480634370/";
		String expectedurl="https://help.instagram.com/1896641480634370/";
		//softAssert.assertEquals(actualurl,expectedurl, "current url found");
		//softAssert.assertNotEquals(actualurl,expectedurl, "current url found");
		boolean result=actualurl.equals(expectedurl);
		softAssert.assertFalse(result,"current url not found");
//		Assert.assertTrue(result,"current url not found");
//		Assert.fail();
//		
		//System.out.println();
//		if(url.equals("http://www.instagram.com")) 
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
	}
	
	

}
