package testNgPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses.FacebookLoginPage;
import pomClasses.FacebookSingUpPage;

public class TestNgClass2 {

WebDriver driver;
FacebookSingUpPage facebookSingUpPage;
FacebookLoginPage facebookLoginPage;

@Parameters
	@BeforeTest
	public void launchtheBrowser()
	{
System.setProperty("webdriver.opera.driver", "C:\\Users\\Satish\\Downloads\\operadriver_win32\\operadriver_win32\\operadriver.exe");
		
		 driver=new OperaDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		//driver.manage().window().maximize();
		
	}
	@BeforeClass
	public void createPomObjects()
	{
		facebookSingUpPage =new FacebookSingUpPage (driver);
		facebookLoginPage  =new FacebookLoginPage(driver);
		
	}
	@BeforeMethod
	public void loginPageoFacebook() throws InterruptedException
	{
		driver.get("http://www.facebook.com");
		//Thraed.sleep(5000);
		System.out.println("hello");
	}
	@Test
	public void loginPageofFacebook()
	{
		facebookLoginPage  =new FacebookLoginPage(driver);
		facebookLoginPage .sendEmailOrPhoneNo();
		facebookLoginPage.sendPassword();
		//facebookLoginPage.clickLogin();
	}
	
}
