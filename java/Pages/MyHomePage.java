package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class MyHomePage extends BaseClass{
	public  MyHomePage (ChromeDriver driver)
	{
		this.driver=driver;
	}

	public MyLeadsPage clickLead()
	{
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
}
