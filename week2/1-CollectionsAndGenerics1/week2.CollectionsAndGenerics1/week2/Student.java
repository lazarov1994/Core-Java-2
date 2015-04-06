package week2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Student implements Comparator<Student>, Comparable<Student> {
	private String name;
	private int grade;
	
	public Student(){
		name = "Paulo Quelio";
		grade = 7;
	}
	public Student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	public void getGrade(){
		System.out.println("Grade: "+ grade + " Name: "+name);
	}
	@Override
	public int compareTo(Student arg0) {
		if(arg0.grade == this.grade){
		return (this.name).compareTo(arg0.name);}
		else
			return this.grade - arg0.grade;
	}

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.grade - arg1.grade;
	}
	
	public static void main(String[] args){
		List<Student> b = new ArrayList();
		Student a1 = new Student();
		Student a4 = new Student("Alabama", 9);
		Student a6 = new Student("Bitch Niggah", 5);
		Student a5 = new Student("Abrakadabra", 5);
		Student a2 = new Student("Horhe", 6);
		
		
		b.add(a1);
		b.add(a2);
		b.add(a4);
		b.add(a5);
		b.add(a6);
		Collections.sort(b);
		for(Student s : b){
			s.getGrade();
		}
		
	}


	
	
}
