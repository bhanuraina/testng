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
		System.out.println("bfore");
	}
	@Test
	public void TestHelloWorld()
		{
		String actual = "Hi Bhanu";
		String expected = "Hi Bhanu";
		assertEquals(expected, actual);
	}
	@Test
	public void testArrays()
	{
		AppTest  hw= new AppTest();
		String inputArray[]= {"Raj","Raj","Kumar","Ganesh"};
		String expected[]= {"Raj","Kumar","Ganesh"};
		
		assertArrayEquals(expected,inputArray);
	}
}
