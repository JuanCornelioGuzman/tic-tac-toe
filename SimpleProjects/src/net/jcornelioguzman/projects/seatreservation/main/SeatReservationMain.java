package net.jcornelioguzman.projects.seatreservation.main;

import net.jcornelioguzman.projects.common.util.InputHelper;
import net.jcornelioguzman.projects.seatreservation.builders.SeatBoardBuilder;
import net.jcornelioguzman.projects.seatreservation.domain.SeatBoard;
import net.jcornelioguzman.projects.seatreservation.util.ReservationConstants;

public class SeatReservationMain {

	private static SeatBoard board;

	public static void main(String[] args) {

		System.out.println(ReservationConstants.WELCOME_MESSAGE);
		board = SeatBoardBuilder.build(10, 10);
		board.displayBoard();
		System.out.println(ReservationConstants.PROMPT_NO_OF_SEATS);
		int numSeats = InputHelper.getIntInput();
		String[] seatsToReserve = new String[numSeats];
		for (int i = 0; i < numSeats; i++) {
			System.out.println(ReservationConstants.PROMPT_SEAT_NO);
			seatsToReserve[i] = InputHelper.getStringInput();
		}
		reserveSeats(numSeats, seatsToReserve);
		board.displayBoard();

	}

	private static void reserveSeats(int numSeats, String[] seatsToReserve) {
		for (int j = 0; j < numSeats; j++) {
			board.getSeat(seatsToReserve[j].toUpperCase()).setReserved(true);
		}
	}
}
