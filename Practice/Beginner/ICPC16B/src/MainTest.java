import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals("no", Main.solve(2, "2 3"));
		assertEquals("no", Main.solve(2, "2 2"));
		assertEquals("no", Main.solve(2, "2 -1"));
		assertEquals("no", Main.solve(2, "-1 2"));
		assertEquals("no", Main.solve(2, "3 2"));
		assertEquals("no", Main.solve(3, "2 1 2"));
		assertEquals("no", Main.solve(3, "1 2 2"));
		assertEquals("no", Main.solve(3, "2 2 1"));
		assertEquals("no", Main.solve(3, "2 1 -2"));
		assertEquals("no", Main.solve(3, "-2 -1 2"));
		assertEquals("no", Main.solve(3, "-2 1 2"));
		assertEquals("no", Main.solve(3, "-2 -1 -1"));
		
		assertEquals("yes", Main.solve(2, "1 1"));
		assertEquals("yes", Main.solve(1, "3"));
		assertEquals("yes", Main.solve(2, "1 0"));
		assertEquals("yes", Main.solve(2, "0 1"));
		assertEquals("yes", Main.solve(2, "-3 1"));
		assertEquals("yes", Main.solve(2, "1 -3"));
		assertEquals("yes", Main.solve(3, "-1 1 -1"));
		assertEquals("yes", Main.solve(3, "1 -1 1"));
		assertEquals("yes", Main.solve(3, "1 2 1"));
		assertEquals("yes", Main.solve(3, "1 1 1"));
		assertEquals("yes", Main.solve(3, "0 0 0"));
		assertEquals("yes", Main.solve(3, "-1000000000 1 0"));
	}

}
