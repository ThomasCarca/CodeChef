import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals(0, Main.solve(4, "1 2 3 4"));
		assertEquals(0, Main.solve(4, "1 3 2 4"));
		assertEquals(1, Main.solve(4, "1 1 3 4"));
		assertEquals(1, Main.solve(4, "1 2 3 1"));
		assertEquals(1, Main.solve(4, "1 2 2 4"));
		assertEquals(2, Main.solve(4, "1 2 2 2"));
		assertEquals(2, Main.solve(4, "1 1 3 1"));
		assertEquals(3, Main.solve(4, "1 1 1 1"));
		assertEquals(0, Main.solve(1, "1"));
		assertEquals(1, Main.solve(2, "1 1"));
		assertEquals(0, Main.solve(2, "1 2"));
	}

}
