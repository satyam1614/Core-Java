package serialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class TestAccountSeriablizable {
	
	public static void main(String[] args) throws  IOException, Exception {
		
		Account a = new Account("5655685466594",30480.35);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("c://io//Account.txt"));
		
		out.writeObject(a);
		
		out.close();
		System.out.println(" object serialized successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("c://io//Account.txt"));
		
		System.out.println(in.readObject());
		
		in.close();
	}

}
