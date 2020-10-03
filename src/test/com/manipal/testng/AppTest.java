package com.manipal.testng;

import org.testng.annotations.Test;

public class AppTest {

  @Before
	public void before()
	{
		App hw= new App();
		System.out.println("bfore");
	}
	@Test
	public void TestHelloWorld()
		{
		App hw= new App();
		String actual = hw.withHiMessage("Bhanu");
		String expected = "Hi Bhanu";
		assertEquals(expected, actual);
	}
	@Test
	public void testArrays()
	{
		App hw= new App();
		String inputArray[]= {"Raj","Raj","Kumar","Ganesh"};
		String expected[]= {"Raj","Kumar","Ganesh"};
		String[] actuals = hw.removeDuplicates(inputArray);
		assertArrayEquals(expected,actuals);
	}
}
