package com.manipal.testng;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	public String withHiMessage(String name)
	{
		return "Hi " + name;
		
	}
	

		
		
	}
	public String[] removeDuplicates(String[] inputArray) {
		// TODO Auto-generated method stub
		String expected[]= {"Raj","Kumar","Ganesh"};
		return expected;
	}
   @Before
	public void before()
	{
		AppTest  hw= new AppTest();
		System.out.println("bfore");
	}
	@Test
	public void TestHelloWorld()
		{
		AppTest  hw= new AppTest();
		String actual = hw.withHiMessage("Bhanu");
		String expected = "Hi Bhanu";
		assertEquals(expected, actual);
	}
	@Test
	public void testArrays()
	{
		AppTest  hw= new AppTest();
		String inputArray[]= {"Raj","Raj","Kumar","Ganesh"};
		String expected[]= {"Raj","Kumar","Ganesh"};
		String[] actuals = hw.removeDuplicates(inputArray);
		assertArrayEquals(expected,actuals);
	}
}
