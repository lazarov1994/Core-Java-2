package week1;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Time {
	private String time,date;
	
	private Time(){
		this.time = "00:00:00";
		this.date = "01.01.2015";
	}
	
	Time(String time, String date){
		this.time = time;
		this.date = date;
	}
	
	public void setDate(String date){
		this.date = date;
	}
	
	public void setTime(String time){
		this.time = time;
	}
	
	public void now(){
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
		 
		   Date date = new Date();
		   System.out.println(dateFormat.format(date));
	}
	public String toString(){
		int counter1=0,counter2=0;
		char[] timeArray = time.toCharArray();
		for(int i = 0 ; i < timeArray.length ; i++){
			if(!Character.isDigit(timeArray[i])){
				timeArray[i] = ':';
				counter1++;
			}
		}
		if(counter1 != 2){
			return "Invalid input";
		}
		
		char[] dateArray = date.toCharArray();
		for(int i = 0 ; i < dateArray.length ; i++){
			if(!Character.isDigit(dateArray[i])){
				dateArray[i]='.';
				counter2++;
			}
			
		}
		if(counter2 != 2){
			return "Invalid input";
		}
		
		return new String(timeArray) + " " + new String(dateArray);
	}
	
	
	
}
