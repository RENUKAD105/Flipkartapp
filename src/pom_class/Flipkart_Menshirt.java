package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Menshirt 
{
	@FindBy(xpath="//a[.='Color Block Men Hooded Neck Yellow, White, Blue T-Shirt']")
	private WebElement shirt;
	
	public Flipkart_Menshirt(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickmenshirt()
	{
		shirt.click();
	}
}