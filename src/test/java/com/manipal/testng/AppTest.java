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
   @Before
	public void before()
	{
		App  hw= new App();
		System.out.println("bfore");
	}
	@Test
	public void TestHelloWorld()
		{
		App  hw= new App();
		String actual = hw.withHiMessage("Bhanu");
		String expected = "Hi Bhanu";
		assertEquals(expected, actual);
	}
	@Test
	public void testArrays()
	{
		App  hw= new App();
		String inputArray[]= {"Raj","Raj","Kumar","Ganesh"};
		String expected[]= {"Raj","Kumar","Ganesh"};
		String[] actuals = hw.removeDuplicates(inputArray);
		assertArrayEquals(expected,actuals);
	}
}
