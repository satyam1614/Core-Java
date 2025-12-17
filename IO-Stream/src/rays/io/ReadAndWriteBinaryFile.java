package rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {
		
		String source = ("C:\\io\\shinchan.jpeg");
				
		String  target =("c://io//cartoon.jpeg");
		
		FileInputStream in = new FileInputStream (source);
		
		FileOutputStream out = new FileOutputStream(target);
		
		int i = in.read();
		
		while (i != -1) {
			
			out.write(i);
			
			i = in.read();
		}
		 in.close();
		 out.close();
		 System.out.println("sucessfullyy....");
		
	}

}
