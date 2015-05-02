package week3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class CompressorDecompressor {
	static LinkedHashMap LHM = new LinkedHashMap();
	static StringBuilder compressedText = new StringBuilder();
	
	public static void compress(Path filePath) throws IOException{ // If it is a 1 line of text : Scanner
		File textFile = new File(filePath.toString());
		FileReader fr = new FileReader(textFile);
	//	BufferedReader br = new BufferedReader(new FileReader(textFile));
	//	LinkedHashMap LHM = new LinkedHashMap();	
		
		int symb;
	//	int cirt=0,prev=0; // Not a bad idea maybe ? 
		int coder=0;
		StringBuilder sb = new StringBuilder();
		StringBuilder compressed = new StringBuilder();
		Scanner sc = new Scanner(textFile);
		
		while ((symb = fr.read()) != -1){
			//cirt++;
			char r = (char) symb;
			
			if(r != ' ' && r != '\n'){
				if(r!='\n'){
					sb.append(r);
				}
			}
			else{
				if(r=='\n'){
					sb.deleteCharAt(sb.length()-1);
					if(LHM.containsKey(sb.toString())){
						compressed.append(LHM.get(sb.toString()));
						compressed.append('\n');
						//coder++;
					} 
					else{
						if(!sb.equals('\n')){
						LHM.put(sb.toString(),new String("~" + Integer.toString(coder)));
						compressed.append(LHM.get(sb.toString()));
						compressed.append('\n');
						coder++;
						}
					}
				}
				else{ // WHITESPACE 
					
					if(LHM.containsKey(sb.toString().toString())){
						//LHM.put(sb,LHM.get(sb));
						compressed.append(LHM.get(sb.toString()));
						compressed.append(' ');
						//coder++;
					} 
					else{
						LHM.put(sb.toString(),new String("~" + Integer.toString(coder)));
						compressed.append(LHM.get(sb.toString()));
						compressed.append(' ');
						coder++;
					}
				}
				
				sb.setLength(0);
			}
		}
		
		FileWriter fw = new FileWriter(textFile);

		char[] a = compressed.toString().toCharArray();
		for(char t : a){
			
			
			
			if(t != '\n'){
				fw.write(t);
			}
			else{
				fw.write("\r\n");
			}
		}
		fw.close();
		System.out.println(compressed);
		System.out.println(LHM);
	       int index = textFile.getAbsolutePath().indexOf(".");
	
	       String nameOfTheFIle = textFile.getAbsolutePath().substring(0, index);
	       File newFile = new File(nameOfTheFIle+".comp");
	       System.out.println(newFile.getAbsolutePath());
	       System.out.println(textFile.getAbsolutePath());
	       newFile.createNewFile();

	       
	       
	     boolean s = textFile.renameTo(newFile);
	       System.out.println("Was the file renamed? : " + s);
	       newFile.delete();
	}
	public static void deCompress(Path filePath){
		File a = new File(filePath.toString());
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		Path pt = Paths.get("C:\\Users\\Lazarov94\\Desktop\\JavaTestWithFIles\\compressionFIle.txt");
		compress(pt);
	}

}
