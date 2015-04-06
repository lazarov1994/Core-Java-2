package week2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ToDoList  {
	ArrayList<Task> collection;
	int hoursRemaining;
	
	ToDoList(int tryMe){
		hoursRemaining = tryMe;
		collection = new ArrayList<Task>();
	}
	
	void add(Task t){
		collection.add(t);
	}
	
	void markFinished(Task t){
		System.out.println("You just mark this task as finish.");
		t.finished = true;
		collection.remove(t);
	}
	void markCancelled(Task t){
		System.out.println("You just mark this task as cancelled.");
		t.cancelled = true;
		collection.get(collection.indexOf(t)).setPriority(0);
		collection.get(collection.indexOf(t)).setTimeForTask(0);
		collection.get(collection.indexOf(t)).setName((collection.get(collection.indexOf(t)).getName() + "(cancelled)"));
		
		
		//collection.remove(t);
	}	
	void getTop(){
		Collections.sort(collection);
		System.out.println(collection.toString());
		System.out.println("the top element is: " + collection.get(collection.size()-1).getPriority());
		System.out.println("The most important task for the moment is: " + collection.get(collection.size()-1).nameOfTheTask);
	}
	boolean canFinish(){
		double can = 0;
		for(int i = 0 ; i < collection.size() ; i ++) {
		
			can = can + collection.get(i).getTimeForTask();
		}
		
		
		if(can <= this.hoursRemaining) return true;
		else
		return false;
		
	}
	int getRemainingTime(){
		double can = 0;
		for(int i = 0 ; i < collection.size() ; i ++) {
			can = can + collection.get(i).getTimeForTask();
		}
		return (int) (hoursRemaining - can);
		
	}
	public String toString(){
		return collection.toString();
	}
}
