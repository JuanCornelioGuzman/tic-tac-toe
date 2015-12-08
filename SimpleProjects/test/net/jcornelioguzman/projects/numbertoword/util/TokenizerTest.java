package net.jcornelioguzman.projects.numbertoword.util;

import java.util.List;

import junit.framework.TestCase;

public class TokenizerTest extends TestCase {

	public void testTokenizeInteger2Digit() {
		List<Integer> tokens = Tokenizer.tokenizeNumber(15);
		assertEquals(2, tokens.size());
	}

	public void testTokenizeInteger5Digit() {
		List<Integer> tokens = Tokenizer.tokenizeNumber(34567);
		assertEquals(5, tokens.size());
	}

	public void testTokenizeInteger1Digit() {
		List<Integer> tokens = Tokenizer.tokenizeNumber(9);
		assertEquals(1, tokens.size());
	}

	public void testTokenizeIntegerEqualValues() {
		List<Integer> tokens = Tokenizer.tokenizeNumber(1473);
		assertEquals(3, tokens.get(0).intValue());
		assertEquals(7, tokens.get(1).intValue());
		assertEquals(4, tokens.get(2).intValue());
		assertEquals(1, tokens.get(3).intValue());
	}
}
