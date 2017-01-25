package org.calculator.tutorial;

import junit.framework.TestCase;

public class MyCalculatorTest extends TestCase {

	// Test the constructor
	public void testMyCalculator() {
		MyCalculator mc1 = new MyCalculator("FrameTextHereXYZ");

		assertEquals ("FrameTextHereXYZ", mc1.getTitle());
		
		assertTrue (mc1.setClear);

	}

	// Test getFormattedText method
	public void testGetFormattedText() {
		MyCalculator mc2 = new MyCalculator("FrameTextHere");
		
		String strFormatted;
		
		strFormatted = mc2.getFormattedText(2.00);
		assertEquals ("2", strFormatted);

	}

}
