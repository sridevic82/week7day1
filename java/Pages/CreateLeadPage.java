package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public  CreateLeadPage (ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	public CreateLeadPage enterFirstname()
	{

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sri");
		return this;


	}
	public CreateLeadPage enterLastname()
	{

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("devi");
		return this;

	}
	public NewLeadPage enterCompname()
	{

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("wipro");
		return new NewLeadPage(driver);


	}

}
