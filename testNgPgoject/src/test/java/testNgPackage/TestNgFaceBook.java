package testNgPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClasses.FacebookLoginPage;
import pomClasses.FacebookSingUpPage;

public class TestNgFaceBook {
	
	WebDriver driver;
	//FacebookSingUpPage facebookSingUpPage;
	FacebookLoginPage facebookLoginPage;
	
	
	@Parameters("browser")
    @BeforeTest
    public void lauchBrowser(String browserName)
    {
		System.out.println(browserName);
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		}
//		if(browserName.equals("Firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver", "C:\\3.varsha testing\\download files\\geckodriver-v0.32.2-win32\\geck.exe");
//			driver=new FirefoxDriver();
//			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
//		}
		
		if(browserName.equals("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "C:\\Users\\Satish\\Downloads\\operadriver_win32\\operadriver.exe");
			driver=new OperaDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		}
		
		driver.manage().window().maximize();
    }
	@BeforeClass
	public void createPomObjects()
	{
		//facebookSingUpPage =new FacebookSingUpPage (driver);
		facebookLoginPage  =new FacebookLoginPage(driver);
		
	}
	@BeforeMethod
	public void loginPageoFacebook() throws InterruptedException
	{
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		System.out.println("hello");
	}
	@Test
	public void loginPageofFacebook()
	{
		facebookLoginPage .sendEmailOrPhoneNo();
		facebookLoginPage.sendPassword();
		//facebookLoginPage.clickLogin();
	}
	
}
