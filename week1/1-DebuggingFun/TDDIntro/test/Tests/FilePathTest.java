package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FilePathTest {
	FilePath path = new FilePath();

	@Before
	public void setUp() {
		this.path = new FilePath();
	}

	@Test
	public void test() {
		assertEquals(
				"/home/radorado/code/hackbulgaria",
				path.reduce_file_path("/home//radorado/code/./hackbulgaria/week0/../"));
	}

	@Test
	public void test1() {

		assertEquals("/home",
				path.reduce_file_path("/home//sweet//././././../"));

	}
	
	@Test
	public void test3() {

		assertEquals("/home",
				path.reduce_file_path("//home//"));

	}
	@Test
	public void test4() {

		assertEquals("/",
				path.reduce_file_path("///////home///.//..///"));

	}
	
	@Test
	public void test5() {
		assertEquals(
				"/home/code/hackbulgaria/week1/week2",
				path.reduce_file_path("/home//radorado/../code/./hackbulgaria/week0/../week1/week2/week3/../"));
	}


}
