package dummyProject;

import org.testng.annotations.Test;

public class ReadDataFromCmdLineTest {
	@Test
	public void read()
	{
		String USERNAME = System.getProperty("usename");
		String PASSWORD = System.getProperty("password");
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	
	

}
