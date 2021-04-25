package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class MyLeadsPage extends BaseClass{
	public  MyLeadsPage (ChromeDriver driver)
	{
		this.driver=driver;
	}

	
	public CreateLeadPage clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	public FindLeadsPage clickFindLeadInCreateLead()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}

}
