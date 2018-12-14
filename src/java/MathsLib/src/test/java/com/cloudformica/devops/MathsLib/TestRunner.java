package com.cloudformica.devops.MathsLib;


import junit.framework.TestResult;
import junit.framework.TestSuite;

public class TestRunner {

	public static void main(String[] args) {

		System.out.println("Started test case execution");
		TestSuite suite= new TestSuite(AdditionTest.class); 
		suite.addTestSuite(SubTest.class);
		suite.addTestSuite(DivTest.class);
		suite.addTestSuite(MultTest.class);
		TestResult result= new TestResult();
		suite.run(result);		
		System.out.println("Test case execution result : "+ result.wasSuccessful());
		
		System.out.println("Completed test case execution");
	}

}
