package week2;

import java.util.Collection;

public class OnOffCollection { //add all methods
	Collection<Object> collect;
	
	
	OnOffCollection(Collection<Object> collect){
		
		this.collect = collect;
	}
	
	public void add(Object a){
		if(collect.contains(a)){
			collect.remove(a);
			//collect.add(a);
		}
		else collect.add(a);
	}
	
	public void getCollection(){
		System.out.println(collect);
		
	}
	
}		
