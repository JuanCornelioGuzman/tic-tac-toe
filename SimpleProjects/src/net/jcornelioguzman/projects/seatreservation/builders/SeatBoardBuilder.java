package net.jcornelioguzman.projects.seatreservation.builders;

import net.jcornelioguzman.projects.seatreservation.domain.SeatBoard;

/**
 * Builder for Seat board
 *
 * @author Juan Cornelio Guzman
 * @since July 15, 2015
 */
public class SeatBoardBuilder {

	/** */
	private static SeatBoard seatBoard;

	public static SeatBoard build(int row, int column) {
		seatBoard = new SeatBoard(row, column);
		return seatBoard;
	}

}
