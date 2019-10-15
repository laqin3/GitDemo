package qaclickacademy;

import org.testng.annotations.Test;

public class AppiumTest {
	
	//I want to trigger that TestNG xml file from maven
	//how to execute all test cases from test folder?  --mvn test
	
	
	@Test
	public void nativeAppAndrid()
	{
		System.out.println("nativeAppAndrid");
	}
	
	@Test
	public void IOSApps()
	{
		System.out.println("IOSApps");
	}
}
