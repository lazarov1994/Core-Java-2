package week2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MeanMedianModeRange implements Statistics {

	Collection<Integer> collection;
	double Mean ;
	int Range = 0;
	int first = 0;
	int size = 0;
	int maxEl = first;
	int out = 0;
	int Mode = 0;
	int MID = 0;
	int MID1 = 0;
	Set<Integer> listMode = new HashSet<Integer>();
	HashMap<Integer, Integer> helper = new HashMap<Integer, Integer>();
	List<Integer> mid = new ArrayList<Integer>();
	
	// Iterator first = (Iterator) collection.iterator();

	MeanMedianModeRange(Collection<Integer> collection) {
		this.collection = collection;

	}

	public Object add(Integer a) {
		Collections.sort(mid);
		mid.add(a);
		if (collection.isEmpty()) {
			collection.add(a);
			first = a;
			
			this.Mean = a;
			size++;
			helper.put(a, 0);
		} else {
			if(a>maxEl){
				maxEl = a;
			}
			collection.add(a);
			size++;
			if(helper.containsKey(a)){
				//System.out.println("key: " + a);
				int value = helper.get(a);
				helper.put(a, value+1);
				
			} else {
				helper.put(a, 0);
			}
			this.Mean = (this.Mean + a)/size;
			
			this.Range = maxEl - first; // it can be down
		}
		
		//System.out.println(helper);
	
		for(int i : helper.keySet()){
			if(Mode < helper.get(i) ){
				//System.out.println(helper.get(i));
				Mode = helper.get(i);
				out = i;
				listMode.clear();
				listMode.add(i);
			}
			else if( Mode == helper.get(i)){
					listMode.add(i);
				}
			
		}
		if(size%2==0){
			MID = (mid.get((size/2)-1) + mid.get(size/2))/2;
		}
		else{
			MID1 = mid.get(size/2);
		}
		//System.out.println("The mode of the collection is: "+out);
		return a;

	}

	@Override
	public double getMean() {
		//System.out.println("The mean of the collecition is: "+this.Mean/size);
		return this.Mean;
	}

	@Override
	public int getMedian() {
		
		//System.out.println(mid);
		if(size%2==0){
			return MID;
			//System.out.println("The median of the collection is: "+(mid.get((size/2)-1) + mid.get(size/2))/2);
		}
		else {
			return MID1 ;
			//System.out.println("The median of the collection is: "+mid.get(size/2));
		}
	}

	@Override
	public Set getMode() {
		return listMode;
	}

	@Override
	public int getRange() {
		//System.out.println("The range of the collection is: "+this.Range);
		return this.Range;
	}
	public static void main(String[] args){
		/*List<Integer> a = new ArrayList();
	
		MeanMedianModeRange b =  new MeanMedianModeRange(a);
		b.add(1);
		b.add(1);
		b.add(2);
		b.add(11);
		b.add(11);
		b.add(11);
		b.add(11);
		b.add(5);
		b.add(5);
		b.add(2);
		b.add(5);
		b.add(5);
		b.add(1);
		b.add(1);*/
		
		MeanMedianModeRange numbers = new MeanMedianModeRange(new ArrayList());
        for (int i = 0; i < 10000; i++) {
            numbers.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            numbers.getMean();
            numbers.getMedian();
            numbers.getMode();
            numbers.getRange();   
        }
        
        
        System.out.println(System.currentTimeMillis() - start);
	
		//System.out.println("Mean "+ b.getMean() + " Range " + b.getRange() + " Mode " + b.getMode() + " Median " + b.getMedian());
	}

}
