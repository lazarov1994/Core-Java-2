package Exceptions;

public class DatabaseCorruptedException extends RuntimeException {
	public String getMessage(){
		return "You have tried to declare a corupted database object." ;
	}
}
class Users{
	String username;
	Users(String name) throws DatabaseCorruptedException {
		if(name != ""){
			username = name;
		}
		else{
			throw new DatabaseCorruptedException();
		}
	}
}