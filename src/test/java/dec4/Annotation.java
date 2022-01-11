package dec4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation 
{
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Throwable
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Reporter.log("Running setup",true);
	}
	@Test
	public void branches()
	{
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/a[1]/img[1]")).click();
	}
	@Test
	public void roles()
	{
		driver.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();
		
	}
	@Test
	public void users()
	{
		driver.findElement(By.xpath("//tbody/tr[6]/td[1]/a[1]/img[1]")).click();
		Reporter.log("Executing user test",true);
	}
		@AfterMethod
public void teardown() throws Throwable{
			driver.quit();
			Reporter.log("running teardown",true);
		}
		
		
		
		
		
		
	}
	
	








