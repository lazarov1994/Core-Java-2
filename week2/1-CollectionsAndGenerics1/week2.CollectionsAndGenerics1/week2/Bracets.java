package week2;

import java.util.Stack;

public class Bracets {
	private String input;
	Bracets(String input){
		this.input = input;
	}
	
	public boolean isCorrect(){
		char[] a = input.toCharArray();
		Stack<Character> here = new Stack<Character>();
		if(a.length == 0){
			return true;
		}
		if( a[a.length-1] == '('){
			return false;
		}
		if(a[0] == '(') {
		for(int i = 0 ; i < a.length ; i++){
			if(a[i] == '('){
				here.push(a[i]);
			}
			else{ //if a[i] is ')'
				if(!here.isEmpty() && here.peek() == '('){
					here.pop();
				}
				else if(a[i] == ')' && here.isEmpty()){
					return false;
				}
				else
					return true;
			}
			}
		} else return false;
		return here.isEmpty();
	}
}
