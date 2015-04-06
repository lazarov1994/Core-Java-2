package week1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class MainTest {
	
	private Main mainProgram;
	
	public void setUp(){
		this.mainProgram = new Main();
	}
	@Test
	public void test() {
			assertEquals(3, mainProgram.getNumberOfDigits(123));
	        assertEquals(1, mainProgram.getNumberOfDigits(1));
	        assertEquals(3, mainProgram.getNumberOfDigits(120));
	        assertEquals(4, mainProgram.getNumberOfDigits(8995));
	}

}
