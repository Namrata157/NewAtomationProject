package testScripts;

import org.testng.annotations.Test;

public class ReadDataFromParametersTest {
	@Test
	public void readDataFromParametersTest()
	{
		String Browser=System.getProperty("browser");
		String Username=System.getProperty("un");
		String Password=System.getProperty("pwd");
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
	}
	

}
