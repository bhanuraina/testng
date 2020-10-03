package com.manipal.testng;

import org.testng.annotations.Test;

public class AppTest {

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
