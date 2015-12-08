package net.jcornelioguzman.projects.numbertoword.main;

import net.jcornelioguzman.projects.common.util.InputHelper;
import net.jcornelioguzman.projects.numbertoword.util.Converter;

/**
 * @author Juan Cornelio Guzman
 * @since December 8, 2015
 */
public class NumberToWord {

	public static void main(String[] args) {
		System.out.println("Input the range of number you want to convert:");
		System.out.println("From:");
		final int min = InputHelper.getIntInput();
		System.out.println("To:");
		final int max = InputHelper.getIntInput();
		for (int i = min; i <= max; i++) {
			String word = Converter.convertNumberToWord(i);
			System.out.println(i + " is spelled as " + word);
		}
	}

}
