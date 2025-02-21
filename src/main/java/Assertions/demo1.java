package Assertions;

import org.junit.Assert;
import org.junit.Test;// take from testng
//asert
//different asserts ----- Hard and Soft asserts
//how to implement Asserts in scripts

//hard Assertion doesnot continue after fails
public class demo1 {
	@Test
	public void test1() {
		System.out.println("test Case Started");
		Assert.assertEquals(12, 12);//12 is actual and expected is 13
		System.out.println("test Case completed");
		//reurns fail assrtion error
	}
//	@Test
//	public void test2() {
//		
//		Assert.assertEquals(12, 13,"Dropdown count is not matching checlk with dev");//can put this as an error message //12 is actual and expected is 13
//		//reurns fail assrtion error
//	}
	
	@Test
	public void test3() {
		System.out.println("test Case Started");
		Assert.assertEquals("hi","hp","words doesnt match raise bug");//12 is actual and expected is 13
		System.out.println("test Case Started");
		//reurns fail assrtion error
	}

}
