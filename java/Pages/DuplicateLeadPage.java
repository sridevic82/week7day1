package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class DuplicateLeadPage extends BaseClass{
	
	public  DuplicateLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	public ViewLeadPage clickCreateLeadForDuplicate()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	
	}

}
