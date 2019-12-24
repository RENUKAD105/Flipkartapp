package pom_class;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin 
{
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement emailtbox;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwdtbox;
	
	@FindBy(xpath="(//span[.='Login'])[3]")
	private WebElement logintbox;
	
	@FindBy(xpath="//span[.='Men']")
	private WebElement mendropdown;
	
	@FindBy(xpath="//a[.='T-Shirts']")
	private WebElement tshirt; 
		
	public FlipkartLogin(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void SetUsername(String un)
	{
		emailtbox.sendKeys(un);
	}
	public void SetPassward(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clicklogin()
	{
		logintbox.click();
	}
	public void mouseover(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(mendropdown).perform();
	}
	public void clickshirt()
	{
		tshirt.click();
	}
}