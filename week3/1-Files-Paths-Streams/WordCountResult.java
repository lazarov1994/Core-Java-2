package week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordCountResult { // Ex: 3
	int lines;
	int words;
	int characters;

	WordCountResult() {

	}

	WordCountResult(int lines, int words, int characters) {
		this.lines = lines;
		this.words = words;
		this.characters = characters;

	}
	public String toString(){
		return new String("lines: " + lines +" words: " + words + " chars: " + characters);
	}
	static WordCountResult wordCount(Path path) throws IOException { // too many edge cases! PS: Scanner would be good
		int a = 1, b = 0, c = 0, r = 0;
		
		File file = new File(path.toString());
		FileReader fr = new FileReader(file);
		char letter = ' ';
		while ((r = fr.read()) != -1) {
			
			char ch = (char) r;
			System.out.println("Char is : " + ch);
			if ( ch!=' '){//Character.isLetter(ch))  {
				c++;
				letter = ch;
			} 
			if (ch == '\n') {
				a++;
			}
			if(ch == ' ' && letter!=' ' || ch == 39){ // 39 is apostrophe EX: I'm (2 words).
				b++;
				letter = ' ';
			}
			
		}
		WordCountResult result = new WordCountResult(a,b+a,c); // The number of words are b+a cause we don't finish the line with whitespace.
		return result;

	}

	
	

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\Lazarov94\\Desktop\\LALA.txt");
		System.out.println(wordCount(path).toString());
	
	}

}
