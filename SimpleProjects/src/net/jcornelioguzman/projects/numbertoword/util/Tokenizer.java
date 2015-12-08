package net.jcornelioguzman.projects.numbertoword.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Juan Cornelio Guzman
 * @since December 8, 2015
 */
public final class Tokenizer {

	private Tokenizer() {
		// This will prevent instantiation of helper class
	}

	public static List<Integer> tokenizeNumber(int number) {

		List<Integer> tokens = new ArrayList<>();

		int currentLiteral = number;
		int currentToken = 0;
		do {
			currentToken = currentLiteral % 10;
			currentLiteral /= 10;
			tokens.add(currentToken);
		} while (currentLiteral != 0);

		return tokens;
	}
}
