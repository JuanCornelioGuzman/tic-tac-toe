package net.jcornelioguzman.projects.common.util;

import java.util.Scanner;

/**
 * Input Utility for CLI programs
 *
 * @author Juan Cornelio Guzman
 * @since July 15, 2015
 */
public final class InputHelper {

	private static final Scanner SCAN = new Scanner(System.in);

	// This will prevent instantiation of helper class
	private InputHelper() {
	}

	public static int getIntInput() {
		return Integer.parseInt(SCAN.nextLine());
	}

	public static char getCharInput() {
		return SCAN.nextLine().charAt(0);
	}

	public static String getStringInput() {
		return SCAN.nextLine();
	}
}
