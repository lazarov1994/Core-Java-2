package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberOfDigitsTest {
	private NumberOfDigits number;
	@Before
	public void setUp(){
		number = new NumberOfDigits();
	}
	@Test
	public void test() {
			assertEquals(1, number.getNumberOfDigits(2));
	        assertEquals(3, number.getNumberOfDigits(544));
	        assertEquals(4, number.getNumberOfDigits(5505));
	        assertEquals(1, number.getNumberOfDigits(01));
	}

}
