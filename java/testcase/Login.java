package testcase;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class Login extends BaseClass {
	
	@Test
	public void log()
	{
		new LoginPage(driver).username().password().clicklogin();
	}

}
