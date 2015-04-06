package week1;

import java.util.ArrayList;

public class StackImpl implements Stack {
	//private int size;
	private ArrayList<Object> array = new ArrayList<Object>();
	private int top;
	
	//public StackImpl(int size){
	//	this.size = size;
	//	array = new Object[size];
	//	top=0;
	//}
	
	public Object push(Object object){
		if(!array.contains(object)){
			array.add(object);
		}
		else{ System.out.println("You can't push duplicates"); }
		
		return object;
	}
	public Object pop(){
		Object poped = array.get(array.size()-1);
		array.remove(array.size()-1);
		return poped;
	}
	public Object peek(){
		Object peeked = array.get(array.size()-1);
		System.out.println(array.get(array.size()-1));
		return  peeked;
	}
	public boolean isEmpty(){
		if(array.isEmpty()){
			return true;
		}
		return false;
	}
	public int length(){
		return array.size();
	}
	public void clear(){
		array.clear();
	}
	public void printElements(){
		System.out.println(array);
	}
}
