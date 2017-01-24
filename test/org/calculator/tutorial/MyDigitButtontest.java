package org.calculator.tutorial;

import java.awt.event.ActionEvent;

import junit.framework.TestCase;

public class MyDigitButtontest extends TestCase {
	
	public void testIsInString() {
		MyCalculator  mc1 = new MyCalculator("FrameTextHere1");
		MyDigitButton mdb = new MyDigitButton(1000, 1000, 1000, 1000, "Test", mc1);
		
		// find X (uppercase) in the string - uppercase succesful search
		assertTrue(mdb.isInString("ThisIsAWappingStringWithAnXInsideofit", 'X'));
		
		// No X (uppercase) in the string - uppercase fail search
		assertFalse(mdb.isInString("ThisIsAWappingStringWithAnYInsideofit", 'X'));
		
		// find X (lowercase) in the string - lowercase succesful search
		assertTrue(mdb.isInString("ThisIsAWappingStringWithAnxInsideofit", 'x'));
		
		// No X (uppercase) in the string - lowercase fail search
		assertFalse(mdb.isInString("ThisIsAWappingStringWithAnxInsideofit", 'y'));
		
		// search for uppercase X does not find lowercase x 
		// - same letter different case search should fail
		assertFalse(mdb.isInString("ThisIsAWappingStringWithAnxInsideofit", 'X'));
		
		// search for lowercase y does not find uppercase Y
		// - same letter different case search should fail
		assertFalse(mdb.isInString("ThisIsAWappingStringWithAnYInsideofit", 'y'));
	}

	public void testActionPerformed() {
		MyCalculator  mc2 = new MyCalculator("FrameTextHere2");
		assertTrue (mc2.setClear);
		
		MyDigitButton mdb = new MyDigitButton(1000, 1000, 1000, 1000, "Test", mc2);
		
		// test that pressing 2 sets 2
		ActionEvent aev = new ActionEvent(mdb, 1, "2");
		((MyDigitButton)aev.getSource()).setLabel("2");
		
		mdb.actionPerformed(aev);
		
		assertEquals("2", mdb.cl.displayLabel.getText());
		
		
//		// test that pressing . with "SetClear=True" displays "0." and SetClear is set to False
//		ActionEvent aev2 = new ActionEvent(mdb, 1, ".");
//		((MyDigitButton)aev2.getSource()).setLabel(".");
//		mdb.actionPerformed(aev2);
//		
//		assertEquals("0.", mdb.cl.displayLabel.getText());
//		assertFalse(mc2.setClear);
		// Text is building up
		
		
	}

}
