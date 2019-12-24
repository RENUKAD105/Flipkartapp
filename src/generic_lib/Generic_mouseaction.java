package generic_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_mouseaction 
{
	public void mouseover(WebDriver driver,WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public void drag_drop(WebDriver driver,WebElement ele1,WebElement ele2)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(ele1, ele2).perform();	
	}
	public void doubleclick(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	public void rightclick(WebDriver driver, WebElement ele)
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}

}