package week1;

public class Dog {
	private String name = "Gorin Nihsto Ne RAzbira";
	
	
	public Dog(String name){
		this.name = name;
	}
	
	public Dog() {
		
	}

	public void setName(String newName){
		this.name = newName;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void foo(Dog someDog) {
	    someDog.setName("Max");     // AAA
	    someDog = new Dog("Fifi");  // BBB
	    someDog.setName("Rowlf");   // CCC
	}
}
