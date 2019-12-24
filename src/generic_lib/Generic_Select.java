package generic_lib;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Generic_Select 
{
	public void selectIndex(WebElement ele,int i)
	{
		Select s = new Select(ele);
		s.selectByIndex(i);
	}
	public void selectvalue(WebElement ele,String val)
	{
		Select s = new Select(ele);
		s.selectByValue(val);
	}
	public void selectText(WebElement ele,String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	public void deselectIndex(WebElement ele,int i)
	{
		Select s = new Select(ele);
		s.deselectByIndex(i);
	}
	public void deselectValue(WebElement ele,String val)
	{
		Select s = new Select(ele);
		s.deselectByValue(val);
	}
	public void deselectText(WebElement ele, String text)
	{
		Select s = new Select(ele);
		s.deselectByVisibleText(text);
	}
	public void deselectAll(WebElement ele)
	{
		Select s = new Select(ele);
		s.deselectAll();
	}
	public void selectoptions(WebElement ele,List<WebElement> ele1)
	{
		Select s = new Select(ele);
		s.getOptions();
	}
	public void getAllselect(WebElement ele,List<WebElement> ele1)
	{
		Select s = new Select(ele);
		s.getAllSelectedOptions();
	}
	public void selectfirstoptions(WebElement ele)
	{
		Select s = new Select(ele);
		s.getFirstSelectedOption();
	}
	public void verifySelect(WebElement ele,boolean b)
	{
		Select s = new Select(ele);
		s.isMultiple();
	}
}