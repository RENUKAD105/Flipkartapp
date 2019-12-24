package test_script;

import generic_lib.Generic_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pom_class.FlipkartLogin;
import pom_class.Flipkart_Blueshirt;
import pom_class.Flipkart_Menshirt;



public class Flipkart_TShirt extends Generic_Test 
{

	@Test
	public void Flipkart_TShirtt() throws InterruptedException
	{
		
		FlipkartLogin fp = new FlipkartLogin(driver);
		fp.SetUsername("ka.renumca20@gmail.com");
		Thread.sleep(3000);
		fp.SetPassward("magisweety");
		Thread.sleep(3000);
		fp.clicklogin();
		Thread.sleep(5000);
		fp.mouseover(driver);
		Thread.sleep(3000);
		fp.clickshirt();
		Thread.sleep(3000);
		Flipkart_Menshirt fm = new Flipkart_Menshirt(driver);
		fm.clickmenshirt();
		Thread.sleep(3000);
		/*Flipkart_Blueshirt fs = new Flipkart_Blueshirt(driver);
		Thread.sleep(3000);
		fs.clicksize();
		Thread.sleep(3000);
		fs.Addtocart();
		Thread.sleep(3000);*/					
		}
}