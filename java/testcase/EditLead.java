package testcase;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class EditLead extends BaseClass{
	
	@Test
	public void editLead() throws InterruptedException
	{
		
		new LoginPage(driver).username().password().clicklogin().crm().clickLead().clickFindLeadInCreateLead()
		.clickPhone().enterPnum().clickFindLead().clickResultingFirstLead().clickEditLead().enterCmpname().clickUpdate();
		
		
		
	}

}
