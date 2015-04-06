package week2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Mian {
	static void returnFirstUniqueElement(Collection collection) { // SLOW SOLUTION . USE HASHSET 
		// int i = 0;
	//	HashMap<Object, Integer> a = new HashMap<Object, Integer>();
		Iterator it = collection.iterator();

		int helper = 0;
		ArrayList<Object> o = new ArrayList<Object>();

		while (it.hasNext()) {
			o.add(it.next());
		}

		for (int i = 0; i < o.size(); i++) {
			for (int j = 0; j < o.size(); j++) {
				// System.out.println("+");
				if (o.get(i).equals(o.get(j))) {
					helper++;

				}

			}

			if (helper == 1) {
				System.out.println(o.get(i));
				break;
			} else {
				helper = 0;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-
		List b = new ArrayList<Object>();
		b.add('c');
		b.add(1);
		b.add(2);
		OnOffCollection a = new OnOffCollection(b);
		a.add("c");
		a.getCollection();
		

	}

}
