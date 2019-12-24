package property_file;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Propertyexecution 
{
	@Parameters({"city","country"})
	@Test
	public void Type_cast(String city,String country)
	{
		Reporter.log(city, true);
		Reporter.log(country, true);
	}

}
