package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserSetUp {
	
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}

	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32 (1)\\geckdriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
	public static WebDriver openOperaBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32 (1)\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		return driver;
	}
}
