package Tests;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class FilePath {
	public String reduce_file_path (String path){
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList(path.split("/++")));
		StringBuilder output = new StringBuilder();
	
		
		if(myList.isEmpty()){
			return "Invalide input";
		}

		for(int i = 1 ; i < myList.size() ; i++){ //it should start from 0
			
			if(!myList.get(i).equals(".") && !myList.get(i).equals("..")){
				output.append(myList.get(i));
				output.append("/");

			}
			
			else if(myList.get(i).equals(".")){

				myList.remove(i);
				// i--; // Of course
				
				
			}
			
			else if(myList.get(i).equals("..")){
	     	
				
				output.delete(output.length()-1-(myList.get(i-1).length()), output.length()); //-2 for the / at the start and / at the end like /radorado/
				output.append('/');

				break; // delete
			}
		}
		if(output.length() == 1 && output.charAt(output.length()-1) == '/'){
			return new String(output);
		}
		else if(output.length() != 0 && output.charAt(output.length()-1) == '/' ){
			output.deleteCharAt(output.length()-1);
		}
			
		return new String(output);
	}

	
}
