package generic_lib;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generic_Webdriver 
{
	public void EnterUrl(WebDriver driver,String url)
	{
		driver.get(url);
	}
	public void geturl(WebDriver driver)
	{
		driver.getCurrentUrl();
	}
	public String Pagesrc(WebDriver driver)
	{
		String src = driver.getPageSource();
		System.out.println(src);
		return src;
	}
	public String getTle(WebDriver driver)
	{
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	public String prvtwh(WebDriver driver)
	{
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		return pid;
	}
	public Set<String> Allwh(WebDriver driver)
	{
		Set<String> all_id = driver.getWindowHandles();
		System.out.println(all_id);
		return all_id;
	}
}