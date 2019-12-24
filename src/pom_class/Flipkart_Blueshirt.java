package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Blueshirt 
{
	@FindBy(xpath="//a[.='M']")
	private WebElement size;
	
	@FindBy(xpath="//button[contains(.,'ADD TO CART')]")
	private WebElement cart;
	
	public Flipkart_Blueshirt(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicksize()
	{
		size.click();
	}
	public void Addtocart()
	{
		cart.click();
	}
}