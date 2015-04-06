package week2;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Methods {
	void returnFirstUniqueElement(Collection collection){
		int i = 0;
		HashMap<Object, Integer> a = new HashMap<Object, Integer>();
		Iterator it = collection.iterator();
		while(it.hasNext()){
			a.put(it.next(), i);
			i++;
		}
	}
	static String converHashMapToString(HashMap<Object, Object> a ){
		StringBuilder output = new StringBuilder();
	//	Set set = a.keySet();
		output.append("{ ");
		for(Object i : a.keySet()){
			output.append(a.get(i));
			output.append(":");
			output.append(i);
			output.append(", ");
		}
		output.delete(output.length()-2, output.length());
		output.append(" }");
		return output.toString();
	}
	static String converHashMapToString1(HashMap<Object, Object> a ){
		StringBuilder output = new StringBuilder();
	//	Set set = a.keySet();
		output.append("{ ");
		for(Object i : a.keySet()){
			output.append(i);
			output.append(":");
			output.append(a.get(i));
			output.append(", ");
		}
		output.delete(output.length()-2, output.length());
		output.append(" }");
		return output.toString();
	}
	
	static String duplicateWords(String text){
		String[] b = text.split(" ");
		int value = 1;
		LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>();
		for(int i = 0 ; i < b.length ; i++){
			if(!map.containsKey(b[i])){
				map.put(b[i], 1);
			}
			else {
				int vall = (int) map.get(b[i]);
				map.put(b[i], vall+1 );
			}
		}
		
		
		return converHashMapToString1(map);
		
	}
	
	
	public static String uniqueValues(Collection<Object> in){
		LinkedHashMap<Object, Integer> map = new LinkedHashMap<Object, Integer>();
		Iterator it = in.iterator();
		Object[] arr = new Object[in.size()];
		int value = 1;
		int i = 0;
		while(it.hasNext()){
			arr[i] = it.next();
			i++;
		}
		for(int i1 = 0 ; i1 < arr.length ;i1++){
			
			if(map.containsKey(arr[i1])){
				int vall = map.get(arr[i1]);
				map.put(arr[i1], vall+1);
			}
			else{
				map.put(arr[i1], 1);
			}
			
		}
		for(Object i2 : map.keySet() ){
			if(map.get(i2).equals(1)){
				return i2.toString();
				
				}
			}
		return "there is no unique";
	}
	
	public static Collection duplicatingElements(Set<Object>... a ){
		LinkedHashMap<Object, Integer> map = new LinkedHashMap<Object, Integer>();
		HashSet<Object> hash = new HashSet<Object>();
		
		for(int i = 0; i<a.length ; i++){
			Iterator it = a[i].iterator();
			Object[] bb = new Object[a[i].size()];
			for(int j = 0; j < a[i].size() ; j++){
				bb[j] = it.next();
				if(map.containsKey(bb[j])){
					int vall = map.get(bb[j]);
					map.put(bb[j], vall+1 );
				}
				else{
					map.put(bb[j], 1);
				}
			}
			
		}
		for(Object i : map.keySet()){
			if(map.get(i).equals(a.length)){
				hash.add(i);
			}
		}
		return hash;
		
		
	}
	public static void main(String[] args){
		HashMap<Object, Object> a =new HashMap<Object, Object>();
		a.put(1, "lol1");
		a.put(2, "lol2");
		a.put(3, "lol3");
		a.put(4, "lol4");
		System.out.println(converHashMapToString(a));
		duplicateWords("Are you fuckin kiddin with me me me me litttle boyyyyy?! fuckin fuckin");
		System.out.println(duplicateWords("Are you fuckin fuckin fuckin kiddin with me me me me litttle boyyyyy?!"));
		Set list = new HashSet();
		list.add(5);
		list.add('c');
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(9);
		list.add(1);
		list.add(1);
		list.add("YOLO");
		list.add(5);
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(9);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(9);
		list.add(1);
		list.add('c');
		Set list2 = new HashSet();
		list2.add(5);
		list2.add("asdadas");
		System.out.println(uniqueValues(list));
		//List a = new ArrayList();
	
		System.out.println(duplicatingElements(list,list2));
		
		
	}
}
