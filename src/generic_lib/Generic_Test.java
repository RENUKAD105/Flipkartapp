package generic_lib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test implements Framework_constants
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	}
	@AfterMethod
	public void closeAppln(ITestResult res) throws IOException
	{
		int status=res.getStatus();
		String tcname = res.getName();
		if(status==2)
		{
			Generic_Screenshot.getphoto(driver);
		}
		driver.quit();
	}
}