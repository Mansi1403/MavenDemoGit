package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class CalculatorTest {
	
	Calculator c=new Calculator();

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int r=c.add(100, 200);
		Assertions.assertEquals(300,r);
		Assertions.assertEquals(500,c.add(300, 200));
		//(expecting,actual,optionalMessage)
	}
	
	@Test
	public void testAssertFalse() {
	
		Assertions.assertEquals("Hello","Hello");
		Assertions.assertFalse("Vaibhav".length()==3);
		Assertions.assertFalse(10>20,"10 is less than 20");
		
		
	}
	@Test
	public void testAssertNull() {
		String str1=null;
		String str2="abc";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}
	@Test
	public void testArray()
	{
		ArrayList<Integer> myList=new ArrayList<Integer>();
		Assertions.assertEquals(0, myList.size());
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2,myList.size());
	}
	

}
