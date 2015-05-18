/**
 * 
 */
package week5;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Lazarov94
 *
 */
public class JUnitTestCase {

	@Test
	public void test() {
		Human myHuman = new Human();
		 assertEquals("Human default name must be ", "George", myHuman.getName());
		
	}

}
