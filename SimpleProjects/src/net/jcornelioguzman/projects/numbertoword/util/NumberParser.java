package net.jcornelioguzman.projects.numbertoword.util;

import net.jcornelioguzman.projects.numbertoword.domain.Ones;
import net.jcornelioguzman.projects.numbertoword.domain.Tens;

/**
 * @author Juan Cornelio Guzman
 * @since December 8, 2015
 */
public final class NumberParser {
	private NumberParser() {
		// This will prevent instantiation of helper class
	}

	private static final Ones[] ONES = Ones.values();
	private static final Tens[] TENS = Tens.values();

	public static String parseOnes(int num) {
		return ONES[num].name();
	}

	public static String parseTens(int num) {
		if (num == 1) {
			return parseOnes(num);
		}
		return TENS[num - 2].name() + " ";
	}

	public static String parseNumber(int num, int index) {
		String value = "";
		if (index == 1 || index == 4 || index == 7) {
			value = parseTens(num);
		} else {
			value = parseOnes(num);
		}
		return value;
	}

}
