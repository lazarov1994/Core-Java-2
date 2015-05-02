package week3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class FindAllDuplicatedFiles {
	
	public static void walkTrought(Path path) throws IOException{
		Set bytesOfFiles = new HashSet();
		
		File root = new File(path.toString()); 
		File[] fileArray = root.listFiles();
		for(File f : fileArray){
			if(Files.isSymbolicLink(f.toPath())){
				if(Files.exists(Files.readSymbolicLink(f.toPath()))){
					bytesOfFiles.add(Files.readAllBytes(Files.readSymbolicLink(f.toPath())));
				}
				
			}
			
			
			
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
