package net.jcornelioguzman.quick;

public class ArrayGroup {
	public String[] getArrayString() {
		return arrayString;
	}

	public void setArrayString(String[] arrayString) {
		this.arrayString = arrayString;
	}

	public void changeArray() {
		arrayString[0] = "BDO";
	}

	private String[] arrayString;

}