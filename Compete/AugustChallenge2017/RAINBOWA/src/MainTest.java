import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		char[] valid1 = new char[]{'1', '2', '3', '4', '5', '6', '7', '6', '5', '4', '3', '2', '1'};
		char[] valid2 = new char[]{'1', '1', '2', '3', '4', '5', '6', '7', '6', '5', '4', '3', '2', '1', '1'};
		char[] valid3 = new char[]{'1', '2', '3', '4', '5', '6', '7', '7', '7', '7', '6', '5', '4', '3', '2', '1'};
		char[] valid4 = new char[]{'1', '2', '3', '3', '3', '3', '4', '5', '5', '6', '7', '7', '7', '6', '5', '5', '4', '3', '3', '3', '3', '2', '1'};
		char[] valid5 = new char[]{'1', '1', '1', '2', '2', '3', '4', '5', '6', '6', '6', '7', '7', '7', '7', '6', '6', '6', '5', '4', '3', '2', '2', '1', '1', '1'};
		char[] valid6 = new char[]{'1', '1', '1', '1', '2', '3', '4', '5', '6', '7', '6', '5', '4', '3', '2', '1', '1', '1', '1'};
		char[] valid7 = new char[]{'1', '2', '3', '4', '5', '6', '6', '6', '7', '6', '6', '6', '5', '4', '3', '2', '1'};
		char[] valid8 = new char[]{'1', '2', '3', '4', '4', '5', '6', '6', '6', '7', '6', '6', '6', '5', '4', '4', '3', '2', '1'};
		
		char[] invalid1 = new char[]{'1', '2', '3', '4', '5', '6', '6', '5', '4', '3', '2', '1'};
		char[] invalid2 = new char[]{'1', '2', '3', '4', '5', '6', '8', '6', '5', '4', '3', '2', '1'};
		char[] invalid3 = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '8', '7', '6', '5', '4', '3', '2', '1'};
		char[] invalid4 = new char[]{'1', '2', '3', '3', '3', '3', '4', '5', '5', '6', '7', '8', '7', '6', '5', '5', '4', '3', '3', '3', '3', '2', '1'};
		char[] invalid5 = new char[]{'1', '2', '3', '4', '5', '6', '6', '5', '4', '3', '2', '1'};
		char[] invalid6 = new char[]{'1', '2', '3', '4', '5', '6', '6', '6', '7'};
		char[] invalid7 = new char[]{'1', '2', '3', '4', '5', '6', '6', '6', '7', '7', '7', '7', '7'};
		
		assertEquals("yes", Main.solve(valid1));
		assertEquals("yes", Main.solve(valid2));
		assertEquals("yes", Main.solve(valid3));
		assertEquals("yes", Main.solve(valid4));
		assertEquals("yes", Main.solve(valid5));
		assertEquals("yes", Main.solve(valid6));
		assertEquals("yes", Main.solve(valid7));
		assertEquals("yes", Main.solve(valid8));
		
		assertEquals("no", Main.solve(invalid1));
		assertEquals("no", Main.solve(invalid2));
		assertEquals("no", Main.solve(invalid3));
		assertEquals("no", Main.solve(invalid4));
		assertEquals("no", Main.solve(invalid5));
		assertEquals("no", Main.solve(invalid6));
		assertEquals("no", Main.solve(invalid7));
	}

}
