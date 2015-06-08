import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/**
 * @author Lazarov94
 *
 */
public class BQueue {
	
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable(){
			public void run(){
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		Thread thread2 = new Thread(new Runnable(){
			public void run(){
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void producer() throws InterruptedException {
		Random random = new Random();
		
		while(true){
			Integer puted = random.nextInt(100);
			queue.put(puted); // Put is w8ing while item is taken of the QUEUE, if it is full.
			System.out.println("The putted value is: " + puted);
		}
	}
	
	private static void consumer() throws InterruptedException{
		Random random = new Random();
		
		while(true){
			Thread.sleep(100); // we set the thread to sleep for a 0.1 seconds because it needs time to take off 
			if(random.nextInt(10)==0){ // we make it average 1 times per second ! 
				Integer value = queue.take(); // Take is w8ing while item is Put in the QUEUE, if is empty
				System.out.println("Taken value: " + value + " Queue size is: " + queue.size()); //sometimes 9 sometimes 10 
				
			}
		}
	}
}
