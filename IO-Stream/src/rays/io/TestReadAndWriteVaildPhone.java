package rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestReadAndWriteVaildPhone {

	public static void main(String[] args) throws Exception {

		FileReader source = new FileReader("C://io//phone.txt");
		FileWriter target = new FileWriter("C://io//vaildphone.txt");

		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(target);

		String phone = br.readLine();

		while (phone != null) {
			if (phone.length() == 10) {
				System.out.println(phone);
				bw.write(phone);
				bw.newLine();
			}
			phone = br.readLine();
		}

		br.close();
		bw.close();

	}

}
