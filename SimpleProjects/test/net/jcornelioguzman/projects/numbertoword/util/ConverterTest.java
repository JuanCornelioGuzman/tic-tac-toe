package net.jcornelioguzman.projects.numbertoword.util;

import junit.framework.TestCase;

public class ConverterTest extends TestCase {

	public void testConvert519() {
		String expected = "FIVE HUNDRED NINETEEN";
		assertEquals(expected, Converter.convertNumberToWord(519));
	}

	public void testConvert311221451() {
		String expected = "THREE HUNDRED ELEVEN MILLION TWO HUNDRED TWENTY ONE THOUSAND FOUR HUNDRED FIFTY ONE";
		assertEquals(expected, Converter.convertNumberToWord(311221451));
	}

}
