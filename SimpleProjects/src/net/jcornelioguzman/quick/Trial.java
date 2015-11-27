package net.jcornelioguzman.quick;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Trial {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		File usernamefile = new File("D:\\username.txt");
		File passwordfile = new File("D:\\password.txt");
		System.out.println("Register or Log In");
		System.out.println("Press 1 for Register and 2 for Log In");

		int x = scan.nextInt();

		if (x == 1) {
			System.out.println("Enter Username");
			String username = scan.next();
			write(usernamefile, username);
			System.out.println("Enter Password");
			String password = scan.next();
			write(passwordfile, password);

		} else if (x == 2) {

			System.out.printf("UserName: ");
			String userLogIn = scan.next();

			System.out.printf("Password: ");
			String passLogIn = scan.next();

			String userInFile = "";
			Scanner user = new Scanner(usernamefile);
			while (user.hasNext()) {
				userInFile = user.next();
			}

			String passInFile = "";
			Scanner pass = new Scanner(passwordfile);
			while (pass.hasNext()) {
				passInFile = pass.next();
			}

			if (userLogIn.equals(userInFile) && passLogIn.equals(passInFile)) {
				System.out.println("Access Granted");
			} else {
				System.out.println("Access Denied");
			}

		}
	}

	private static void write(File filename, String stringToWrite)
			throws IOException {
		FileWriter fWriter = new FileWriter(filename);
		PrintWriter pWriter = new PrintWriter(fWriter);
		pWriter.println(stringToWrite);
		pWriter.close();
	}
}