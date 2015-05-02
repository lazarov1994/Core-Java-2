package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Subtitles {
	public static void fixEncoding(Path path) throws IOException{
		File a = new File(path.toString());
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Lazarov94\\Desktop\\JavaTestWithFIles\\Sub\\1.txt"));
		byte[] data = Files.readAllBytes(path);
		bw.write(new String(data, "UTF-8"));
		
	}
	
	public static byte[] convertEncoding(byte[] bytes, String from, String to) throws UnsupportedEncodingException {
	    return new String(bytes, from).getBytes(to);
	}

	public static void main(String[] args) throws IOException {
		Path pt = Paths.get("C:\\Users\\Lazarov94\\Desktop\\JavaTestWithFIles\\Sub\\lost.s04e11.hdtv.xvid-2hd.srt");
		fixEncoding(pt);
	}

}
