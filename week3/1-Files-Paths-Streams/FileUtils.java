package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FileUtils {
	
	
	/*class Singleton { // One of most common paterns, also see lazy inizialize patern
						// Difference between singolton and utility class
		private static Singleton instance = null;
		
		private int a;
		
		public static Singleton getInstance(){
			return instance;
		}
		
		private Singleton(){
			
		}
		
	}*/
	private static FileUtils instance = null;
	
	public static FileUtils getInstance(){
		if(instance == null){
			instance = new FileUtils();
		}
		return instance;
	}
	
	private FileUtils(){
		
	}
	
	static String readFrom(File file) throws IOException{  // Ex: 1
		FileInputStream fis = new FileInputStream(file);
		int content;
		StringBuilder strB = new StringBuilder();
		while((content = fis.read()) != -1){
			strB.append((char) content);
		}
		if(fis!= null){
			fis.close();
		}
		return new String(strB);
	}
	
	String readFrom(Path path) throws IOException{
		File file = new File(path.toString());
		return readFrom(file);
	}
	
	static void writeTo(File file, String content) throws IOException{  // Ex: 1
		if(!file.exists()){
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.close();
	}
	
	
	static Map<String, String> parseProperties(File file) throws IOException{  // Ex: 2
		
		Map<String, String> map = new HashMap<String, String>();
		FileReader fr = new FileReader(file);
		BufferedReader bf = new BufferedReader(fr);
		String line = new String();
		 
		while((line= bf.readLine()) != null){
			if(line.startsWith("#")){
				continue;
			}
			else{
				int indexOF = line.indexOf("=");
				map.put( line.substring(0, indexOF) , line.substring(indexOF, line.length()));
			}
		}
		return map;
	}
	
	public static URI reduce_file_path(String path) throws URISyntaxException{ // Ex: 5
		return new URI(path).normalize();
	}
	
	public static void main(String[] args) throws IOException, URISyntaxException{
		File file = new File("prop");
		System.out.println(reduce_file_path("/etc/../etc/../etc/../").toString());;
		System.out.println(parseProperties(file));
		
		
	}
	
	
	
}
