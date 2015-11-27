package net.jcornelioguzman.quick;

public class StringBuilderTest {

	public static void main(String[] args) {
		// rejectionRemarks();
		String effectiveDate = "20120807";

		final int end = 6;
		final String dateMonth = effectiveDate.substring(0, end);

		System.out.println(dateMonth);
	}

	private static void rejectionRemarks() {
		String remarks = "\nYour Charge In Rate: 3.4499999999999997"
				+ "\nYour Charge Out Rate: 123.45679"
				+ "\nYour Charge Exchange Rate Ratio: 35.784576811594206*][*"
				+ "\nYOUR CHARGE" + "In Rate: 3.4499999999999997"
				+ "\nOut Rate: 123.45679" + "Ratio: 35.784576811594206*]";
		StringBuilder newRemark = new StringBuilder();
		newRemark.append(remarks);
		if (newRemark.indexOf("[*") != -1) {
			// newRemark.delete(newRemark.indexOf("[*"), newRemark.length());
			newRemark.setLength(newRemark.indexOf("[*"));
		}
		newRemark.append("\n[* YOUR CHARGE");
		newRemark.append("\nIn Rate: ").append(5);
		newRemark.append("\nOut Rate: ").append(1);
		newRemark.append("\nRatio: ").append(0.2);
		newRemark.append(" *]\n");
		newRemark.append("\n{* WE ACCEPT");
		newRemark.append("\nIn Rate: ").append(4);
		newRemark.append("\nOut Rate: ").append(2);
		newRemark.append("\nRatio: ").append(0);
		newRemark.append(" *}\n");
		System.out.println(newRemark.toString());
	}
}
