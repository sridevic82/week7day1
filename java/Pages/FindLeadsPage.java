package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class FindLeadsPage extends BaseClass {
	
	public  FindLeadsPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	public FindLeadsPage clickPhone()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	
	}
	
	public FindLeadsPage enterPnum()
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("5");
		return this;
	
	}
	
	public FindLeadsPage clickFindLead() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	
	}
	
	public ViewLeadPage clickResultingFirstLead()
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	
	}

}
