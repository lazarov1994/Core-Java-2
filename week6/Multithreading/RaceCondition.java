/**
 * 
 */

/**
 * @author Lazarov94
 *
 */
public class RaceCondition {

	public static int counter = 0;
	public synchronized static void increment(){
		counter++;
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0 ; i < 2000 ; i++){
					
					increment();
					
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i = 0 ; i < 2000 ; i++){
					increment();
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		long start = System.currentTimeMillis();
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("Time needed: " + (end-start) + "\n"+ "Counter is: " + counter);
		
	}

}
