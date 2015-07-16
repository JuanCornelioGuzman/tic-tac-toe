package net.jcornelioguzman.projects.converter.main;

import net.jcornelioguzman.projects.converter.util.Converter;

public class IntToWordSample {

	public static void main(String[] args) {
		for (int i = 1; i <= 1111; i++) {
			String word = Converter.convertNumberToWord(i);
			System.out.println(i + " is spelled as" + word);
		}
	}
}
