package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class LoginPage extends BaseClass{
	public  LoginPage (ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage username()
	{
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	
	}
	public LoginPage password()
	{

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}
	
	public HomePage clicklogin()
	{

		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}

}
