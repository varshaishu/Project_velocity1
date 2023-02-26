package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.OpenSingUpPage;

public class TestClassOpenSingUpForm {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
	driver.manage().window().maximize();
	
	driver.get("http://www.instagram.com"); 
	OpenSingUpPage openSingUpPage =new OpenSingUpPage (driver);
	openSingUpPage.sendMobileOrEmail();
}
}
