package week3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class BrokenLinks { // Scanner предварително си разбива инпута в структури от данни и знае винаги за константно време кои е некст инт дабъл
	
	public static void walkThrought(String path) throws IOException{ // Take folder 
		
		File root = new File(path); // The root given by the user
		File[] fileArray = root.listFiles(); // Putting the files which r in the root in to this array
		//Scanner a = new Scanner(root);

		if(fileArray.length == 0){
			System.out.println("Folder is empty");
			return;
		}
		
		for(File f : fileArray){
			
			if(f.isDirectory()){ // should we chek 
				System.out.println("This file is a FOLDER: " + f.getName());
				walkThrought(f.getAbsolutePath());
			}
			else {
				System.out.println("This file is a FILE xD: " + f.getName());
				if(Files.isSymbolicLink(f.toPath()) && !Files.exists(Files.readSymbolicLink(f.toPath()))){
					System.out.println(f.getName()+ " Is a bad symbolic link! ");
				}
			}
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		Path target = Paths.get("C:\\Users\\Lazarov94\\Desktop\\JavaTestWithFIles\\t1.txt");
		Path newLink = Paths.get("C:\\Users\\Lazarov94\\Desktop\\JavaTestWithFIles\\SymbolicLink.txt");
		/*System.out.println(target);
		File a = new File(target.toString());
		BufferedReader br = new BufferedReader(new FileReader(a));
		System.out.println("d first line is: " + br.readLine());
		System.out.println("The name of the files is: " + a.getName());*/
		try {
			Files.createSymbolicLink(newLink, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("My Windows sucks");
		}
		walkThrought("C:\\Users\\Lazarov94\\Desktop\\JavaTestWithFIles");
	}

}
