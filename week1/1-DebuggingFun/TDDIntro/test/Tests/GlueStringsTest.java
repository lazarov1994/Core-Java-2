package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class GlueStringsTest {
	private GlueStrings glueSome = new GlueStrings();

	@Before
	public void setUp() {
		glueSome = new GlueStrings();
	}
	@Test
	public void test1() {
		assertEquals("<-->", glueSome.agglutinationStrings("<-->"));
	}

	@Test
	public void test2() {
		assertEquals("c4", glueSome.agglutinationStrings(4,'c'));
	}

	@Test
	public void test3() {
		assertEquals("12.0 4 c 5.0", glueSome.agglutinationStrings(" ", 12F, 4, 'c', 5.0));
	}
	

}
