package net.jcornelioguzman.quick;

import java.io.FileOutputStream;

public class LastIndexOfTest {

	public static void main(String[] args) {
		String feedFileName = "filename.txt";
		System.out.println(feedFileName.substring(0,
				feedFileName.lastIndexOf(".txt"))
				+ "." + 000555);
		String logData = " asdfasf RTNG";
		int pos = logData.indexOf("RTNG");
		if (pos > 0) // if RTNG is present
		{
			System.out.println(logData.substring(0, pos) + "D");
		}

		FileOutputStream fos;
		try {
			fos = new FileOutputStream(
					"D:\\00 CHAMP\\00 Sprints\\CSP 2015\\CSP Release 15.8\\Sprint 15.8-3\\try.txt");

			fos.write("Try lang..".getBytes());
			fos.write("\r\n".getBytes());
			fos.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
