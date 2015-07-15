package net.jcornelioguzman.projects.common.util;

import java.util.Scanner;

public final class InputHelper {

	private static Scanner sc = new Scanner(System.in);

	//This will prevent instantiation of helper class
	private InputHelper() {}

	public static int getIntInput() {
		return sc.nextInt();
	}

	public static char getCharInput() {
		return sc.nextLine().charAt(0);
	}
	
	public static String getStringInput(){
		return sc.nextLine();
	}
}
