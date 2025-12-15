package rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyword {
	
	public static void main(String[] args) throws Exception {
		
		PrintWriter out = new PrintWriter(new FileWriter("C:\\io\\temp keyword.txt")) ;
		
		System.out.println("start writing your text here...");
		
		InputStreamReader sr = new  InputStreamReader(System.in);
		
		BufferedReader in = new BufferedReader(sr);
		
		String line = in.readLine();
		
		while (!line.equals("exit")) {
		out.println(line);
		line = in.readLine();
		}
		in.close();
		out.close();
		sr.close();
	
		}
		
	
	
				
		
	}


