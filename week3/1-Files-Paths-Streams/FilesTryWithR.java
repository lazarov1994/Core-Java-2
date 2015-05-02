package week3;

class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
	}
	
}


public class FilesTryWithR {

	public static void main(String[] args) {
		try(Temp temp = new Temp()){ // we have to catch the EXCEPTION cause it throws (look temp)
			
		} catch (Exception e) { // CLOSE is automaticly called! 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
