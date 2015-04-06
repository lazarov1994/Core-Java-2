package week1;

public class Pair {
	Object first;
	Object second;
	
	Pair (Object first, Object second){
		this.first = first;
		this.second = second;
	}
	
	public void getPair(){
		System.out.println("The first object is: " + this.first +" The second object is: " + this.second);
	}
	
	public String toString(){
		return "The variables of this class contains 2 objects. This variable contains the following objects: " + this.first + " and " + this.second;
	}
	
	public boolean equals(Pair a){
		if(this.first == a.first && this.second == a.second){
			return true;
		}
		
		return false;
		
	}
	
	
}
