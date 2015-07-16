package net.jcornelioguzman.projects.seatreservation.domain;

import net.jcornelioguzman.projects.seatreservation.util.ReservationConstants;

/**
 * Seat POJO
 *
 * @author Juan Cornelio Guzman
 * @since July 15, 2015
 */
public class Seat {

	private String seatId;
	private char row;
	private int column;
	private boolean isReserved;

	/**
	 * @return the seatId
	 */
	public String getSeatId() {
		return seatId;
	}

	/**
	 * @param seatId
	 *            the seatId to set
	 */
	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	/**
	 * @return the row
	 */
	public char getRow() {
		return row;
	}

	/**
	 * @param row
	 *            the row to set
	 */
	public void setRow(char row) {
		this.row = row;
	}

	/**
	 * @return the column
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * @param column
	 *            the column to set
	 */
	public void setColumn(int column) {
		this.column = column;
	}

	/**
	 * @return the isReserved
	 */
	public boolean isReserved() {
		return isReserved;
	}

	/**
	 * @param isReserved
	 *            the isReserved to set
	 */
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}

	public String getDisplay() {
		if (isReserved) {
			return ReservationConstants.RESERVED;
		} else {
			return seatId;
		}
	}
}
