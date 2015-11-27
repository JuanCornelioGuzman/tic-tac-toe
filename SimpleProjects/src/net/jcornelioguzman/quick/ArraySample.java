package net.jcornelioguzman.quick;

public class ArraySample {

	String[] arrayString = { "ABC", "DEF" };

	public static void main(String[] args) {
		ArraySample smp = new ArraySample();
		ArrayGroup arg = new ArrayGroup();
		arg.setArrayString(smp.arrayString);
		arg.changeArray();
		System.out.println(smp.arrayString[0]);
	}
}
