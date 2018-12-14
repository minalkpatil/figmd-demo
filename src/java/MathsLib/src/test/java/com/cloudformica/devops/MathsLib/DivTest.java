package com.cloudformica.devops.MathsLib;

import junit.framework.TestCase;

public class DivTest extends TestCase {
	   protected double value1, value2, res;
	   
	   public DivTest( String testName )
	   {
	        super( testName );
	   }
	   protected void setUp(){
	      value1 = 10;
	      value2 = 3;
	      res = value1 / value2;
	   }
	   public void testDiv(){
		  //System.out.println("Running Divison test ");
	      double result = com.cloudformica.devops.MathsLib.Operations.div(value1, value2);
	      assertTrue(result == res);
	      //System.out.println("Result : sucessful");
	   }
}
