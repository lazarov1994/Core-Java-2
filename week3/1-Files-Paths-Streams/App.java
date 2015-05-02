package week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File file = new File("text2.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){ // try with R automatically closes the BR n the above.
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find the file " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}
	}

}
