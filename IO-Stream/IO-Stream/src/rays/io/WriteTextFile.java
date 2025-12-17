package rays.io;

import java.io.FileWriter;

public class WriteTextFile {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C://io//rays.txt");
		
		file.write("Hello rays");
		
		System.out.println("text data write successfully");
		
		file.close();
	}

}
