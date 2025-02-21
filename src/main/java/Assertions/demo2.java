package Assertions;

import org.junit.Assert;
import org.junit.Test;// take from testng
//asert
//different asserts ----- Hard and Soft asserts
//how to implement Asserts in scripts

//hard Assertion doesnot continue after fails
public class demo2 {
	@Test
	
	public void test1() {
		String str ="Shiva";
	Assert.assertTrue(true);
	}

	@Test
	public void test2() {
	Assert.assertTrue(false);
	}
	
//	@Test
//	public void test3() {
//	String str ="Shiva";
//	Assert.assertTrue(str.contains("cardinal health"),"names are not matching");
//	}
}
