package com.paula.LetterCombination;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * Unit test for LetterCombination.
 * 
 * @author Paula Lin
 */
public class LetterCombinationTest {
	LetterCombination letterCombination = null; 
	
	@Before 
	public void init() {
		letterCombination = new LetterCombination();
	}
	
	@Test
	public void TestombineLetters_without_zero_And_one() {
		String input1 ="6";
		String expectedResult1 = "[m, n, o]";
		Assert.assertEquals(expectedResult1, letterCombination.combineLetters(input1).toString());
		letterCombination.clearLetters();
		
		String input2 ="23";
		String expectedResult2 = "[ad, ae, af, bd, be, bf, cd, ce, cf]";
		Assert.assertEquals(expectedResult2, letterCombination.combineLetters(input2).toString());
		letterCombination.clearLetters();
		
		String input3 ="423";
		String expectedResult3 = "[gad, gae, gaf, gbd, gbe, gbf, gcd, gce, gcf, had, hae, haf, hbd, hbe, hbf, hcd, hce, hcf, iad, iae, iaf, ibd, ibe, ibf, icd, ice, icf]";
		Assert.assertEquals(expectedResult3, letterCombination.combineLetters(input3).toString());
		letterCombination.clearLetters();
	}
	
	@Test
	public void TestombineLetters_with_zero_Or_one() {
		String input1 ="0";
		String expectedResult1 = "[]";
		Assert.assertEquals(expectedResult1, letterCombination.combineLetters(input1).toString());
		letterCombination.clearLetters();
		
		String input2 ="1";
		String expectedResult2 = "[]";
		Assert.assertEquals(expectedResult2, letterCombination.combineLetters(input2).toString());
		letterCombination.clearLetters();
		
		String input3 ="18";
		String expectedResult3 = "[t, u, v]";
		Assert.assertEquals(expectedResult3, letterCombination.combineLetters(input3).toString());
		letterCombination.clearLetters();
		
		String input4 ="10";
		String expectedResult4 = "[]";
		Assert.assertEquals(expectedResult4, letterCombination.combineLetters(input4).toString());
		letterCombination.clearLetters();
		
		String input5 ="0713";//
		String expectedResult5 = "[pd, pe, pf, qd, qe, qf, rd, re, rf, sd, se, sf]";
		Assert.assertEquals(expectedResult5, letterCombination.combineLetters(input5).toString());
		letterCombination.clearLetters();
	}
}
