package testcase;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class DeleteLead extends BaseClass{
	
	
	@Test
	public void DeleteLead() throws InterruptedException
	{
		new LoginPage(driver).username().password().clicklogin().crm().clickLead().clickFindLeadInCreateLead()
		.clickPhone().enterPnum().clickFindLead().clickResultingFirstLead().clickDeleteLead();
	}

}
