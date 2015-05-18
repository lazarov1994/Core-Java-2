package week5;

import java.text.Annotation;


/**
 * @author Lazarov94
 *
 */

@ClassInfo (
		   author = "Lazarov94",
		   date = "05/05/2015",
		   lastModified = "05/05/2015",
		   lastModifiedBy = "Lazarov94",
		   reviewers = {"Jivko", "Mitko", "Moni"},
		   relatedClasses = {String.class,Double.class}
		)
public class Human {
	String name;
	int age;
	
	Human(){
		name = "George";
		age = 20;
	}
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	String getName(){
		return this.name;
	}
	
	int getAge(){
		return this.age;
	}
	
	void getInfo(){
		System.out.println("The Human is called " + name +" and he is " + age + "years old");
	}
	
	public static void main(String[] args){
		Human newHuman = new Human();
		//Class cl = 
		java.lang.annotation.Annotation[] a = newHuman.getClass().getAnnotations();
		for(int i = 0 ; i < a.length ; i++){
			System.out.println(a[i]);
			
		}
	}
}
