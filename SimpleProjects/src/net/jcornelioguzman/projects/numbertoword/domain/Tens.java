package net.jcornelioguzman.projects.numbertoword.domain;

/**
 * @author Juan Cornelio Guzman
 * @since December 8, 2015
 */
public enum Tens {
	TWENTY(2), 
	THIRTY(3), 
	FORTY(4), 
	FIFTY(5), 
	SIXTY(6), 
	SEVENTY(7), 
	EIGHTY(8), 
	NINETY(9);

	Tens(int number) {
		this.number = number;
	}

	private int number;

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
}
