package Exceptions;

public class TestWithExceptions {
	
	
	
	public void method4(){
		int a = 7;
		int b = 0;
		int c = a/b;
	}
	
	public void method3(){ // Now cause method3 is handled we can proceed to m2 and m1 and main.
		try{
		this.method4();
		System.out.println("After method4 completion");
		}
		catch(Exception e){
			System.out.println("Some ERROR");
		}
	}
	
	public void method2(){ // Cause the upper method is handled when it goes in try it will be OKAY and won't go in catch.
		try{
			this.method3();
			System.out.println("After method3 completion");
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void method1(){ // If i don't try-catch here the program will not execute! 
		//try{
			this.method2();
			System.out.println("After method2 completion");
	//	} catch(Exception e ){
	//		System.out.println(e.getMessage());
	//	}
	}
		
		
	
	
	public static void main(String[] args) {
		
		TestWithExceptions a = new TestWithExceptions();
		a.method1();
		System.out.println("After method1 completion");
		
	}

}
