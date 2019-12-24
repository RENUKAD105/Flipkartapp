package generic_lib;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Generic_Webelement 
{
	public String AttributeVal(WebElement ele,String Aval)
	{
		String val = ele.getAttribute(Aval);
		System.out.println(val);
		return val;
	}
	public String Cssvalue(WebElement ele,String Cval)
	{
		String value = ele.getCssValue(Cval);
		System.out.println(value);
		return value;
	}
	public Point Location(WebElement ele)
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
		return loc;
	}
	public Dimension size(WebElement ele)
	{
		Dimension d = ele.getSize();
		System.out.println(d);
		return d;
	}
	public String tagname(WebElement ele)
	{
	String tname = ele.getTagName();
	System.out.println(tname);
	return tname;
	}
	public String text(WebElement ele)
	{
		String text = ele.getText();
		System.out.println(text);
		return text;
	}
	public boolean disp(WebElement ele)
	{
		boolean b = ele.isDisplayed();
		System.out.println(b);
		return b;
	}
	public boolean isselect(WebElement ele)
	{
		boolean b = ele.isSelected();
		System.out.println(b);
		return b;
	}
	public boolean isenabled(WebElement ele)
	{
		boolean b = ele.isEnabled();
		System.out.println(b);
		return b;
	}
	public void click(WebElement ele)
	{
		ele.click();
	}
	public void clear(WebElement ele)
	{
		ele.clear();
	}
}