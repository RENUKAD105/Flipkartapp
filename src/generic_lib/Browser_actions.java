package generic_lib;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;



public class Browser_actions 
{
	public void maximize_action(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void minimize()
	{
		Robot r;
		try
		{
			r=new Robot();		
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_N);
			
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_N);
		}
		catch (AWTException e)
		{
	}
	}
	public void newTab()
	{
		Robot r;
		try
		{
			r=new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
		}catch (AWTException e)
		{
		}
	}
	public void close_action()
	{
		Robot r;
		try
		{
			r=new Robot();
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_C);
			
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_C);
		}catch (AWTException e)
		{
		}
	}
	public void resize_action(WebDriver driver,int h,int w)
	{
		Dimension d = new Dimension(h,w);
		driver.manage().window().setSize(d);	
		}
	public void Drag_action(WebDriver driver,int x,int y)
	{
		Point p = new Point(x,y);
		driver.manage().window().setPosition(p);
	}
}