package Tests;

public class GlueStrings {

	public String agglutinationStrings(Object... input){
		StringBuilder helper = new StringBuilder();
		/*if(input.length == 1){
			return (String) input[0].toString();
		}
		if(input.length == 2){
			return (String) input[1].toString() + (String) input[0].toString();
	}*/ // the 2 cases are the answer of test1 n test2
		for(int i = 0; i < input.length ; i++){ 
			
			helper.append(input[i]);
			helper.append(input[0]);
		}
	
	//	helper.delete(helper.length() - input[0].toString().length(), helper.length()); //  for loops should start from 1 and this line should be added also. 
		return new String(helper);
		
		
	}

}
