package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class NewLeadPage extends BaseClass{
	public  NewLeadPage (ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public ViewLeadPage newLead()
	{
		driver.findElement(By.name("submitButton")).click();
	
		return new ViewLeadPage(driver);
	}

}
