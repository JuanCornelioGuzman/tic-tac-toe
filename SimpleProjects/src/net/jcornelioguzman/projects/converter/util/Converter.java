package net.jcornelioguzman.projects.converter.util;

import java.util.ArrayList;
import java.util.List;

public final class Converter {

	private static List<Integer> numbers = new ArrayList<Integer>();

	private Converter() {
	}

	public static String convertNumberToWord(int number) {
		StringBuilder word = new StringBuilder();
		List<String> wordList = new ArrayList<String>();

		int num2 = 0;
		int last = 0;
		num2 = number;
		do {
			last = num2 % 10;
			num2 = num2 / 10;
			numbers.add(last);
		} while (num2 != 0);

		for (Integer num : numbers) {
			wordList.add(parseNumber(num.intValue()));
		}

		for (int i = numbers.size() - 1; i >= 0; i--) {

			word.append(wordList.get(i));
			switch (i) {
			case 3:
				word.append(NumberConstants.THOUSAND);
				break;
			case 2:
				word.append(NumberConstants.HUNDRED);
				break;
			case 1:
				word.append(NumberConstants.TY);
				break;
			}
		}

		numbers.clear();

		validateWord(word);

		return word.toString();
	}

	private static void validateWord(StringBuilder word) {
		String newWord = word.toString();
		newWord = newWord.replace("TWOTY", "TWENTY");
		newWord = newWord.replace("TTY", "TY");
		newWord = newWord.replace("DTY", "D");
		newWord = newWord.replace("VET", "FT");
		newWord = newWord.replace("URT", "RT");
		newWord = newWord.replace("REET", "IRT");
		newWord = newWord.replace(" ONETY ONE", NumberConstants.ELEVEN);
		newWord = newWord.replace(" ONETY TWO", NumberConstants.TWELVE);
		newWord = newWord.replace(" ONETY THREE", NumberConstants.THIRTEEN);
		newWord = newWord.replace(" ONETY FOUR", NumberConstants.FOURTEEN);
		newWord = newWord.replace(" ONETY FIVE", NumberConstants.FIFTEEN);
		newWord = newWord.replace(" ONETY SIX", NumberConstants.SIXTEEN);
		newWord = newWord.replace(" ONETY SEVEN", NumberConstants.SEVENTEEN);
		newWord = newWord.replace(" ONETY EIGHT", NumberConstants.EIGHTEEN);
		newWord = newWord.replace(" ONETY NINE", NumberConstants.NINETEEN);

		word.setLength(0);
		word.append(newWord);
	}

	private static String parseNumber(int number) {
		String word = "";
		switch (number) {
		case 1:
			word = NumberConstants.ONE;
			break;
		case 2:
			word = NumberConstants.TWO;
			break;
		case 3:
			word = NumberConstants.THREE;
			break;
		case 4:
			word = NumberConstants.FOUR;
			break;
		case 5:
			word = NumberConstants.FIVE;
			break;
		case 6:
			word = NumberConstants.SIX;
			break;
		case 7:
			word = NumberConstants.SEVEN;
			break;
		case 8:
			word = NumberConstants.EIGHT;
			break;
		case 9:
			word = NumberConstants.NINE;
			break;
		}
		return word;
	}

}
