package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {
	
	public void readFIle()throws FileNotFoundException{
		FileReader fr = new FileReader("Test");
	}
	
	public static void main(String[] args) throws FileNotFoundException { // I must handle it with throws or i have to go for try catch blok
		ThrowsDemo td = new ThrowsDemo(); // When I am in the main he is D last method and with
										  // that throws FileNotFoundException that I declared just not to handle
										  // the exception. I am giving the responsibility to handle d EXCEPTIO 
										  // to someone else BUT MAIN IS THE LAST CLASS, so bitch surround it with throw catch blocks.
		td.readFIle();
	}

}
