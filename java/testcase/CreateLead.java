package testcase;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class CreateLead extends BaseClass{
	
	@Test
	public void cl()
	{
		new LoginPage(driver).username().password().clicklogin().crm().clickLead().clickCreateLead().enterFirstname()
		.enterLastname().enterCompname().newLead().lead();
	}

}
