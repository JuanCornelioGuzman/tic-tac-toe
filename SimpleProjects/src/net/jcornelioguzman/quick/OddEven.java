package net.jcornelioguzman.quick;

import java.io.IOException;

import javax.swing.JOptionPane;

public class OddEven {
	public static void main(String agrs[]) throws IOException {
		String s;
		int i;
		s = JOptionPane.showInputDialog(null, "Enter a Number: ");
		i = Integer.parseInt(s);
		if (i % 2 == 0)
			JOptionPane.showMessageDialog(null, "the number is even " + i);
		else
			JOptionPane.showMessageDialog(null, "the number is odd " + i);
	}
}