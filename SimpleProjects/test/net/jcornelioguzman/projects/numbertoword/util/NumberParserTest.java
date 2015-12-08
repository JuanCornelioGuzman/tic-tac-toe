package net.jcornelioguzman.projects.numbertoword.util;

import junit.framework.TestCase;

public class NumberParserTest extends TestCase {

	public void testParseNumberOne() {
		assertEquals("ONE", NumberParser.parseOnes(1));
	}

	public void testParseNumberEleven() {
		assertEquals("ELEVEN", NumberParser.parseOnes(11));
	}
}
