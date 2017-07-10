import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals(33, Main.solve(20, 3));
		assertEquals(12, Main.solve(10, 2));
		assertEquals(3, Main.solve(8, 5));
		assertEquals(9, Main.solve(6, 1));		
		assertEquals(0, Main.solve(2, 5));	
		assertEquals(1, Main.solve(6, 5));		
		assertEquals(0, Main.solve(1, 1));
		assertEquals(10, Main.solve(13, 4));
		assertEquals(45, Main.solve(19, 2));
	}

}
