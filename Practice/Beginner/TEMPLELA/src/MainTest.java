import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		String[] t1 = new String[]{"1", "2", "3", "4", "5", "6", "5", "4", "3", "2", "1", "0"};
		String[] t2 = new String[]{"1", "2", "3", "4", "5", "6", "5", "4", "3", "2"};
		String[] t3 = new String[]{"1", "2", "3", "4", "5", "6", "5", "4", "3", "2", "2"};
		String[] t4 = new String[]{"2", "2", "3", "4", "5", "6", "5", "4", "3", "2", "2"};
		String[] t5 = new String[]{"1", "2", "3", "4", "5", "4", "5", "4", "3", "2", "1"};
		String[] t6 = new String[]{"1", "2", "3", "4", "5", "5", "5", "4", "3", "2", "1"};
		String[] t7 = new String[]{"1", "2", "3", "4", "3", "2"};
		String[] t8 = new String[]{"2"};
		String[] t9 = new String[]{"1"};
		String[] t10 = new String[]{"1", "2", "3", "2", "1"};
		String[] t11 = new String[]{"1", "2", "3", "4", "3", "2", "1"};
		assertEquals("no", Main.solve(t1));
		assertEquals("no", Main.solve(t2));
		assertEquals("no", Main.solve(t3));
		assertEquals("no", Main.solve(t4));
		assertEquals("no", Main.solve(t5));
		assertEquals("no", Main.solve(t6));
		assertEquals("no", Main.solve(t7));
		assertEquals("no", Main.solve(t8));
		assertEquals("yes", Main.solve(t9));
		assertEquals("yes", Main.solve(t10));
		assertEquals("yes", Main.solve(t11));
	}

}
