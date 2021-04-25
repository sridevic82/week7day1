package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class EditLeadPage extends BaseClass{
	
	public  EditLeadPage (ChromeDriver driver)
	{
		this.driver=driver;
	}
	public EditLeadPage enterCmpname()
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	
	}

	public ViewLeadPage clickUpdate()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	
	}
}
