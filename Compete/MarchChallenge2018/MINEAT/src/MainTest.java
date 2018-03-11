import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals(3, Main.solve(3, 3, "1 2 3"));
		assertEquals(2, Main.solve(3, 4, "1 2 3"));
		assertEquals(2, Main.solve(3, 5, "1 2 3"));
		assertEquals(1, Main.solve(3, 6, "1 2 3"));
		

		assertEquals(7, Main.solve(5, 5, "5 7 4 2 1"));
		assertEquals(5, Main.solve(5, 6, "5 7 4 2 1"));
		assertEquals(4, Main.solve(5, 7, "5 7 4 2 1"));
		assertEquals(4, Main.solve(5, 8, "5 7 4 2 1"));
		assertEquals(3, Main.solve(5, 9, "5 7 4 2 1"));
		assertEquals(3, Main.solve(5, 10, "5 7 4 2 1"));
		assertEquals(2, Main.solve(5, 11, "5 7 4 2 1"));
		assertEquals(2, Main.solve(5, 12, "5 7 4 2 1"));
		assertEquals(2, Main.solve(5, 13, "5 7 4 2 1"));
		assertEquals(2, Main.solve(5, 14, "5 7 4 2 1"));
		assertEquals(2, Main.solve(5, 15, "5 7 4 2 1"));
		assertEquals(2, Main.solve(5, 16, "5 7 4 2 1"));
		assertEquals(2, Main.solve(5, 17, "5 7 4 2 1"));
		assertEquals(2, Main.solve(5, 18, "5 7 4 2 1"));
		assertEquals(1, Main.solve(5, 19, "5 7 4 2 1"));
		assertEquals(1, Main.solve(5, 20, "5 7 4 2 1"));
		assertEquals(1, Main.solve(5, 21, "5 7 4 2 1"));
		assertEquals(1, Main.solve(5, 22, "5 7 4 2 1"));
		assertEquals(1, Main.solve(5, 23, "5 7 4 2 1"));
		
	}

}
