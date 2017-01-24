package org.calculator.tutorial;

import junit.framework.TestCase;

public class MyCalculatorTest extends TestCase {

	public void testMyCalculator() {
		MyCalculator mc1 = new MyCalculator("FrameTextHere");

		assertEquals ("FrameTextHere", mc1.getTitle());
		
		assertTrue (mc1.setClear);

	}

	public void testGetFormattedText() {
		MyCalculator mc2 = new MyCalculator("FrameTextHere");
		
		String strFormatted;
		
		strFormatted = mc2.getFormattedText(2.00);
		assertEquals ("2", strFormatted);

	}

}
