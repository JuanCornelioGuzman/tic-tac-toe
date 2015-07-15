package net.jcornelioguzman.projects.seatreservation.domain;

import java.util.HashMap;
import java.util.Map;

import net.jcornelioguzman.projects.seatreservation.util.ResevationConstants;

public class SeatBoard {

	private int row;
	private int column;
	private Map<String, Seat> seatMap = new HashMap<String, Seat>();

	public SeatBoard(int row, int column) {
		this.row = row;
		this.column = column;
		populateSeatMap();
	}

	private void populateSeatMap() {
		for (int i = 0; i < row; i++) {
			for (int j = 1; j <= column; j++) {

				String id = String.valueOf((char)(ResevationConstants.FIRST_ROW+i))
						+ String.valueOf(j);
				
				Seat seat = new Seat();
				seat.setColumn(j);
				seat.setRow((char) (ResevationConstants.FIRST_ROW + i));
				seat.setSeatId(id);
				seat.setReserved(false);

				seatMap.put(id, seat);
			}
		}
	}

	public void displayBoard() {
		for (int i = 0; i < row; i++) {
			for (int j = 1; j <= column; j++) {
				String id = String.valueOf((char)(ResevationConstants.FIRST_ROW+i))
						+ String.valueOf(j);
				System.out.print(seatMap.get(id).getDisplay()+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public Seat getSeat(String id){
		return seatMap.get(id);
	}
}