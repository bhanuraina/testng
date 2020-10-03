package com.manipal.testng;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
   @Before
	public void before()
	{
		HelloWorld hw= new HelloWorld();
		System.out.println("bfore");
	}
	@Test
	public void TestHelloWorld()
		{
		HelloWorld hw= new HelloWorld();
		String actual = hw.withHiMessage("Bhanu");
		String expected = "Hi Bhanu";
		assertEquals(expected, actual);
	}
	@Test
	public void testArrays()
	{
		HelloWorld hw= new HelloWorld();
		String inputArray[]= {"Raj","Raj","Kumar","Ganesh"};
		String expected[]= {"Raj","Kumar","Ganesh"};
		String[] actuals = hw.removeDuplicates(inputArray);
		assertArrayEquals(expected,actuals);
	}
}
