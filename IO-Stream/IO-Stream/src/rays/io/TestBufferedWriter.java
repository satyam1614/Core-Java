package rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class TestBufferedWriter {
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter file = new BufferedWriter(new FileWriter("C:\\io\\satyam.txt"));
		
		file.write("public class stayam" + "\n" + "public static void main (string[]args{" + "\n" + "System.out.println();");
		file.newLine();
		
		System.out.println("satyam file with successfully ");
		
		file.close();
	}

}
