package net.jcornelioguzman.quick;

import java.util.Vector;

public class SortRoute {

	public static void main(String[] args) {
		String[] route = { "SHE", "CAN", "PEK" };
		Flight flt1 = new Flight("SHE", "PEK");
		Flight flt2 = new Flight("PEK", "CAN");
		Vector<Flight> v1 = new Vector<>();
		v1.add(flt2);
		v1.add(flt1);
		sortTheRoute(v1, route);
		System.out.println(v1.toString());
	}

	public static void sortTheRoute(Vector fltVec, String... route) {
		if (route.length <= 1) {
			return;
		}

		Vector v = new Vector(); // used for storing the route
		boolean[] found = new boolean[fltVec.size()];

		for (int i = 0; i < (route.length - 1); i++) {
			String origin = route[i];
			String dest = route[i + 1];

			// first see if there is a matching origin
			for (int j = 0; j < fltVec.size(); j++) {
				if (found[j]) {
					continue;
				}

				Flight flt = (Flight) fltVec.elementAt(j);
				if (flt.origin.equals(origin)
						|| ((i == 0) && origin.equals("MLH") && flt.origin
								.equals("BSL"))) {
					v.addElement(flt);
					found[j] = true;

					break;
				}
			}

			// now see if there is a matching destination
			for (int j = 0; j < fltVec.size(); j++) {
				if (found[j]) {
					continue;
				}

				Flight flt = (Flight) fltVec.elementAt(j);
				if (flt.dest.equals(dest)) {
					v.addElement(flt);
					found[j] = true;

					break;
				}
			}
		} // end for

		// now go through the records and make sure that we don't have any
		// AwbFlt left over
		for (int i = 0; i < found.length; i++) {
			if (found[i]) {
				continue;
			}

			Flight flt1 = (Flight) fltVec.elementAt(i);

			for (int j = 0; j < v.size(); j++) {
				Flight flt2 = (Flight) v.elementAt(j);

				if (flt2.dest.equals(flt1.origin)) {
					found[i] = true;

					if ((i + 1) >= v.size()) {
						v.addElement(flt1);
					} else {
						v.insertElementAt(flt1, i + 1);
					}

					break;
				} else if (flt2.origin.equals(flt1.dest)) {
					found[i] = true;
					v.insertElementAt(flt1, i);

					break;
				}
			}

			if (!found[i]) {
				v.addElement(flt1);
			}
		} // end for
		fltVec.removeAllElements();
		for (int i = 0; i < v.size(); i++) {
			fltVec.addElement((Flight) v.elementAt(i));
		}
	}

}

class Flight {
	public Flight(String origin, String dest) {
		this.origin = origin;
		this.dest = dest;
	}

	public String toString() {
		return this.origin + this.dest;
	}

	String origin;
	String dest;
}
