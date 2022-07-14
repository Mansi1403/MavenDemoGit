package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class BeforeAfterTest {
	Calculator c=new Calculator();
	int sum;
	@BeforeAll
	public static void testDbConn() 
	{
		System.out.println("Db conn is on");
	}
	
	@BeforeEach
	public void testStartup() {
		sum=0;
		System.out.println("Sum= "+sum);
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		sum=c.add(100, 200);
		Assertions.assertEquals(300,sum,"checked add method");
	}
	
	@Test
	public void testAdd1() {
		//fail("Not yet implemented");
		sum=c.add(400, 200);
		Assertions.assertEquals(600,sum,"checked add method");
		
	}
	@AfterEach
		public void testShutDown() {
		
			System.out.println("At the End "+sum);
	}
	
	@AfterAll
	public static void dbConnOff() {
		System.out.println("Db conn is off");
	}

}
