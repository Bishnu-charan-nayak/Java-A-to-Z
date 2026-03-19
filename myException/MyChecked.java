package myException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class MyAlpha{
	
	public void m1() throws IOException {
		
		FileReader fr = new FileReader("\"C:\\Users\\\\OneDrive\\Desktop\\Ankita Application.pdf\"");

			fr.read();

	}
	
}

public class MyChecked {

	public static void main(String[] args) throws FileNotFoundException {
		 
		MyAlpha a1 = new MyAlpha();
		try {
			a1.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

}