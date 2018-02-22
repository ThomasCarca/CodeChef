import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals(1, Main.solve("1 1 1 4 1"));
		assertEquals(2, Main.solve("2 1 2 4 1"));
		assertEquals(3, Main.solve("4 3 2 1 1"));
		assertEquals(4, Main.solve("4 4 2 3 1"));
		assertEquals(5, Main.solve("4 4 5 1 3"));
		assertEquals(6, Main.solve("6 4 4 5 3"));
		assertEquals(7, Main.solve("2 7"));
		assertEquals(8, Main.solve("8 7 6 5 4 3 2"));
	}

}
