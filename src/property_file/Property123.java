package property_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property123 
{

@Test
public void test_property() throws FileNotFoundException, IOException
{
	//create object for properties class
	Properties p = new Properties();
	
	//specify path of property file
	p.load(new FileInputStream("./p.properties"));
	
	//specify the key and it will fetch the value
	String value = p.getProperty("iw"); 
	System.out.println(value);
}
}