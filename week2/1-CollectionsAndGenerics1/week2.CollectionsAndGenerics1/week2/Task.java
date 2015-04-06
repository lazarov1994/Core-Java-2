package week2;

import java.util.Comparator;

public class Task implements Comparator<Task>, Comparable<Task> {
	String nameOfTheTask;
	int priority;
	double timeForTask;
	String InfoAboutTheTask;
	boolean finished = false ;
	boolean cancelled = false;
	
	
	public void setName(String name){
		nameOfTheTask = name;
	}
	public String getName(){
			return nameOfTheTask;
	}
	public String toString(){
		return nameOfTheTask + "-" + Integer.toString(priority);
	}
	Task(){
		InfoAboutTheTask = "No information about this task";
	}
	Task(int p, double t, String info){
		priority = p;
		timeForTask = t;
		InfoAboutTheTask = info;
	}
	Task(int p){
		priority = p;
	}
	Task(double time){
		timeForTask = time;
	}
	Task(String info){
		InfoAboutTheTask = info;
	}
	public void setPriority(int p){
		priority = p;
	}
	public void setTimeForTask(int t){
		timeForTask = t;
	}
	public void giveInfo(String info){
		InfoAboutTheTask = info;
	}
	public int getPriority(){
		return priority;
	}
	public double getTimeForTask(){
		//System.out.println(timeForTask);
		return timeForTask;
	}
	public void getInfo(){
		System.out.println(InfoAboutTheTask);
	}

	public static void main(String[] args){
		StudyForUniversity a = new StudyForUniversity(23, 5.0 , "Peace of cake"); 
		StudyForUniversity a1 = new StudyForUniversity(8, 1.0 , "Peace of 2cake"); 
	//	a.setPriority(15);
	//	a.getTimeForTask();
		
		ToDoList lo = new ToDoList(18);
		lo.add(a);
		lo.add(a1);
		lo.add(new PlayDota2(1, 3.0 , "Lets1 rock"));
		lo.add(new StudyForUniversity(4, 3.0 , "Lets2 rock"));
		lo.add(new PlayDota2(1, 3.0 , "Lets3 rock"));
		
		System.out.println("The time remaind is: " + lo.getRemainingTime());
		lo.getTop();
		System.out.println("Can i finish on time: " + lo.canFinish());
		lo.markFinished(a);
		lo.getTop();
		lo.markCancelled(a1);
		lo.getTop();
		System.out.println("Is cancelled  "+a1.toString() + " " + a1.cancelled);
		System.out.println(lo.toString());
		
		
	}

	@Override
	public int compareTo(Task o) {
		if(this.priority==o.priority){
			return (int) (this.timeForTask - o.timeForTask);
		}
		else
		return this.priority-o.priority;//(int) (this.timeForTask - o.timeForTask);
	}
	@Override
	public int compare(Task o1, Task o2) {
		return o1.priority-o2.priority;
	}

}

class StudyForUniversity extends Task{
	public StudyForUniversity(){
		nameOfTheTask = "StudyForUniversity";
		priority = 8;
		timeForTask = 3;
		InfoAboutTheTask = "Not the interesting thing to do :s";
	}

	public StudyForUniversity(int i) {
		nameOfTheTask = "StudyForUniversity";
		priority = i;
	}
	public StudyForUniversity(int p, double t, String info){
		nameOfTheTask = "StudyForUniversity";
		priority = p;
		timeForTask = t;
		InfoAboutTheTask = info;
	}
	public StudyForUniversity(double time){
		timeForTask = time;
	}
	public StudyForUniversity(String info){
		InfoAboutTheTask = info;
	}
	
}
class PlayDota2 extends Task{
	public PlayDota2(){
		nameOfTheTask = "PlayDota2";
		priority = 1;
		timeForTask = 3;
		InfoAboutTheTask = "Lets get it on";
	}
	
	public PlayDota2(int i) {
		nameOfTheTask = "PlayDota2";
		priority = i;
	}
	public PlayDota2(int p, double t, String info){
		nameOfTheTask = "PlayDota2";
		priority = p;
		timeForTask = t;
		InfoAboutTheTask = info;
	}
	public PlayDota2(double time){
		nameOfTheTask = "PlayDota2";
		timeForTask = time;
	}
	public PlayDota2(String info){
		nameOfTheTask = "PlayDota2";
		InfoAboutTheTask = info;
	}
	
}

