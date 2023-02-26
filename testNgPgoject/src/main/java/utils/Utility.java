package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumpack.Workbook;

public class Utility {
	static WebDriver driver;
	private static String currentDate;
	WebDriverWait wait;
	
	public Utility (WebDriver driver) {
		PageFactory.initElements( driver,this);
		this.driver=driver;
		wait=new WebDriverWait(driver,10);
	}
	
	public static String captureScreenShot(WebDriver driver,String testId) throws IOException 
	{
		
		SimpleDateFormat sdf=new SimpleDateFormat ("yyyy-mm-dd hh-mm-ss"); 
		Date date=new Date();
		String CurrentDate=sdf.format(date);
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		File source=takesScreenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\3.varsha testing\\screenshot\\Rest"+testId+currentDate+".png");
		FileHandler.copy(source, dest);
	
	return testId;
			
		
		
		
	}
	
	public static String getDataFromExcelSheeet(String sheet, int row, int cell )
	{
		String path="C:\\Users\\Satish\\Downloads\\Book1.xlsx";
		InputStream file=new FileInputStream(path);
		String credential="";
		
		Workbook book=WorkbookFactory.create(file);
		try
		{
		book.getSheet(sheet).getRow(row).getCell(cell).getStringCellvalue();
		}
		
		catch(IllegalStateException e)
		{
			long data=(long)book.getSheet(sheet).getRow(row).getCell(cell).getNumericCellvalue();
			 credential= Long.toString(data);
		}
		
		return  credential;
		
	}
	
    
}
