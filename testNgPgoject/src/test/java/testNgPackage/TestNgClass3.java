package testNgPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClass3 {
	
	@BeforeMethod
	public void before()
	{
		System.out.println("beforemethod");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afteremethod");
	}

	@Test(priority=2)
	public void test()
	{
		System.out.println("text");
	}
	 @Test(priority=1)
	 public void test1()
	 {
		 System.out.println("test1");
	 }
	 @Test(priority=0,invocationCount=2)
	 public void test2()
	 {
		 System.out.println("test 2");
	 }
	 @Test
	 public void text3()
	 {
		 System.out.println("text3");
	 }

}
