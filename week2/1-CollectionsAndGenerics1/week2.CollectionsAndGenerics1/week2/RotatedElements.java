package week2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class RotatedElements{
	Collection collection;
	RotatedElements(Collection collection){
		this.collection = collection;
	}
	void rotate(Collection collection, int rotateStep ){ //
		Iterator it = collection.iterator(); // can't get collection.listiterator()
		Queue reversed = new LinkedList();
		while(it.hasNext()){
			reversed.add(it.next());
		}	for(int i = 0 ; i < Math.abs(collection.size() - rotateStep) ; i ++){
			Object a =reversed.poll();
			reversed.add(a);
		}
		System.out.println(reversed);
		
	}
	
}
