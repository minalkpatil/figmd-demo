package com.cloudformica.devops.MathsLib;

import junit.framework.TestCase;

public class SubTest extends TestCase {
	   protected int value1, value2, ans;
	   
	   public SubTest( String testName )
	    {
	        super( testName );
	    }
	   protected void setUp(){
	      value1 = 10;
	      value2 = 3;
	      ans = value1 - value2;
	   }
	   
	   public void testSub(){
		  //System.out.println("Running substraction test ");
	      double result = com.cloudformica.devops.MathsLib.Operations.sub(value1, value2);
	      assertTrue(result == ans);
	      //System.out.println("Result : sucessful");
	   }
}
