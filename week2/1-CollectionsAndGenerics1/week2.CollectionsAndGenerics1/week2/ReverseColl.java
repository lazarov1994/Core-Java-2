package week2;

import java.util.Collection;

public class ReverseColl {
	static Collection collection;
	
	ReverseColl(Collection collection){
		this.collection = collection;
	}
	
	
	static <T> void reverse (){
		Object[] a = collection.toArray();
		Object helper = new Object();
		System.out.println(collection);
		collection.clear();
		for(int i = 0 ; i < a.length/2 ; i++){
			helper = a[i];
			a[i] = a[a.length-i];
			a[a.length-i] = helper;
		}
		for(int i  = 0 ; i < a.length ; i++){
			collection.add((T) a[a.length-1-i]);
		}
		System.out.println(collection);
		
	}
}
