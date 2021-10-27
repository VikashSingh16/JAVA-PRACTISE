package com.practise.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import com.practise.main.MyMath;

public class MyMathTest {
	MyMath math =new MyMath();
	
    @Before
    public void before() {
    	System.out.println("Before method");
    }
    
    @After
    public void After() {
    	System.out.println("After  method");
    }
    
    @BeforeClass
    public static void beforeClass() {
    	System.out.println("Before class");
    }
    
    @AfterClass
    public static void AfterClass() {
    	System.out.println("After class");
    }
	
	@Test
	public void sum_with3Numbers() {
		System.out.println("Test1");
		assertEquals(6, math.sum(new int[] {1,2,3}));
		
	}
	@Test
	public void sum_with1Numbers() {
		System.out.println("Test2");
		assertEquals(4, math.sum(new int[] {4}));
		
	}

}
