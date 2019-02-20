package com.jenkinstest.jenkinsapp;

import junit.framework.TestCase;

public class CalculMoyenTest extends TestCase {

	CalculMoyen calculMoyen;
	
	protected void setUp() throws Exception {
		super.setUp();
		calculMoyen = new CalculMoyen();
	}
	public void test(){
		
		assertTrue(calculMoyen.calcul(5, 5)==5);
		
	}

}
