package net.jcornelioguzman.projects.numbertoword.util;

import java.util.List;

/**
 * @author Juan Cornelio Guzman
 * @since December 8, 2015
 */
public final class Converter {

	private Converter() {
		// This will prevent instantiation of helper class
	}

	public static String convertNumberToWord(int number) {
		StringBuilder word = new StringBuilder();
		final List<Integer> tokenizedInts = Tokenizer.tokenizeNumber(number);

		for (int index = tokenizedInts.size() - 1; index >= 0; index--) {
			int token = tokenizedInts.get(index);

			// Skip if zero
			if (token == 0) {
				if (tokenizedInts.size() == 1) {
					word.append(NumberParser.parseOnes(token));
				}
				continue;
			}

			// For values 10 - 19
			if ((token == 1) && ((index == 1) || (index == 4) || (index == 7))) {
				int lastDigit = tokenizedInts.get(index - 1);
				String value = NumberParser.parseOnes((token * 10) + lastDigit);
				word.append(value);
				index--;
			} else {
				word.append(NumberParser.parseNumber(token, index));
			}

			addScales(index, word);
		}

		return word.toString();
	}

	private static void addScales(int currentIndex, StringBuilder word) {
		switch (currentIndex) {
		case 9:
			word.append(ScaleConstants.BILLION);
			break;
		case 6:
			word.append(ScaleConstants.MILLION);
			break;
		case 3:
			word.append(ScaleConstants.THOUSAND);
			break;
		case 2:
		case 5:
		case 8:
			word.append(ScaleConstants.HUNDRED);
			break;
		}
	}
}
