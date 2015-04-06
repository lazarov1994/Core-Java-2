package week2;

public class Exceotion {

	public static int tryCatchFinally(){
		try{
			throw new RuntimeException("my Exception");
		} catch(RuntimeException e){
			System.out.println((e.getMessage()));
			return 0;
		} finally{
			return 1;
		}
	}
	
	
	
	public static void main(String[] args) {
		try{
			throw new Error("My error");
		} catch (Error a){
			System.out.println(a.getMessage());
		}
		System.out.println(tryCatchFinally());
	}
	

}
