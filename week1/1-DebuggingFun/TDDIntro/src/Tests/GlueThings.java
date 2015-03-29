package Tests;

import java.util.Arrays;

public class GlueThings {
	public static Object[] agglutinationStrings(Object... input){
		if(input.length == 1){
			return input;
		}
		if(input.length==2){
			Object[] output1 = {input[1],input[0]}; 
			return output1;
		}
		Object[] output = new Object[(input.length-1)*2-1];
		for(int i = 1 ; i < output.length; i+=2){
			output[i]=input[0];
		}
		
		int j = 1;
		for(int i = 0 ; i < (input.length-1)*2; i+=2 ) { 
			output[i]  = input[j];
			j++;
		}
		return (output);
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(agglutinationStrings(' '))); 
	}
	
}
