package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class ViewLeadPage  extends BaseClass{
	public  ViewLeadPage (ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public void lead()
	{
		System.out.println("lead is created");
	}
	public DuplicateLeadPage clickDuplicateLead()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	
	}
	public MyLeadsPage clickDeleteLead()
	{
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);
	
	}
	public EditLeadPage clickEditLead()
	{
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	
	}

}
