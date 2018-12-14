package com.cloudformica.devops.MathsLib;

import junit.framework.TestCase;

public class MultTest extends TestCase {
	   protected int value1, value2, result;
	   
	   public MultTest( String testName )
	    {
	        super( testName );
	    }
	   protected void setUp(){
	      value1 = 10;
	      value2 = 3;
	      result =value1 * value2;
	   }
	   public void testMultiply(){
		  //System.out.println("Running mutiply test ");
	      double result = com.cloudformica.devops.MathsLib.Operations.mult(value1, value2);
	      assertTrue(result == this.result);
	      //System.out.println("Result : sucessful");
	   }
}
