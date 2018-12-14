package com.cloudformica.devops.MathsLib;

import junit.framework.TestCase;

public class AdditionTest extends TestCase {
	   protected int value1, value2, ans;
	   
	    public AdditionTest( String testName )
	    {
	        super( testName );
	    }
	   
	   protected void setUp(){
	      value1 = 3;
	      value2 = 3;
	      ans = value1 + value2;
	   }
	   public void testAdd(){
	      double result = com.cloudformica.devops.MathsLib.Operations.add(value1, value2);
	      //System.out.println("Running Addition test ");
	      assertTrue(result == ans);
	      //System.out.println("Result : sucessful");
	   }
}
