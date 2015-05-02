package week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files1 {
	BufferedReader br = null;
	File file = new File("text.txt");{
	
	try {
		FileReader fr = new FileReader(file);

		br = new BufferedReader(fr);

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

	} catch (FileNotFoundException e) {
		System.out.println("File not found: " + file.toString());
	} catch (IOException e) {
		System.out.println("Unable to read the file" + file.toString());
	} finally {
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Can't close file: " + file.toString());
		} catch (NullPointerException ex) {

		}
	}
	}
}

