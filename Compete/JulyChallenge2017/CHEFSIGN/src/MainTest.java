import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals(1, Main.solve("="));
		assertEquals(1, Main.solve("=="));
		assertEquals(2, Main.solve("<"));
		assertEquals(2, Main.solve(">"));
		assertEquals(2, Main.solve("<>"));
		assertEquals(2, Main.solve("><"));
		assertEquals(2, Main.solve("<="));
		assertEquals(2, Main.solve("=<"));
		assertEquals(2, Main.solve(">="));
		assertEquals(2, Main.solve("=>"));
		assertEquals(2, Main.solve("<>"));
		assertEquals(2, Main.solve("><"));
		assertEquals(2, Main.solve("==>="));
		assertEquals(3, Main.solve("<<"));
		assertEquals(3, Main.solve("<<>>"));
		assertEquals(3, Main.solve(">><<"));
		assertEquals(3, Main.solve("<>>"));
		assertEquals(3, Main.solve("><>>"));
		assertEquals(4, Main.solve("<>>>"));
		assertEquals(5, Main.solve("<<<<"));
		assertEquals(5, Main.solve(">>>>"));
		assertEquals(6, Main.solve(">>><>>>"));
		assertEquals(5, Main.solve(">>><<>>>"));
		assertEquals(6, Main.solve("><>>><>>>"));
		assertEquals(9, Main.solve("<<<<<>>>>>>>>"));
		assertEquals(2, Main.solve("<><><><><><><><><"));
		assertEquals(10, Main.solve("<<<<<>>>>>>>><<<<<<<<<"));
		assertEquals(10, Main.solve("<=<<<=<>=>=>==>=>>>=>=<=<<<==<==<=<=<=<><"));
		assertEquals(10, Main.solve("<=<<<=<>=>=<>=>==<>=>=>>>=>=<==<<<==<==<=<==<=<><"));
		assertEquals(3, Main.solve("<<>><>"));
		assertEquals(3, Main.solve("<<>><><>"));
		assertEquals(3, Main.solve("<><<>><><>"));
		assertEquals(3, Main.solve("<<><>><><>"));
		assertEquals(5, Main.solve("<<<<>>>><<>><<<<>><<>>>>"));
		assertEquals(6, Main.solve("<<<<>>>><<>><<<<>><<>>>>>"));
		assertEquals(3, Main.solve("<>><<>"));
		assertEquals(5, Main.solve(">>>>"));
		assertEquals(5, Main.solve(">>>><"));
		assertEquals(5, Main.solve(">>>><<"));
		assertEquals(5, Main.solve(">>>><<<"));
		assertEquals(5, Main.solve(">>>><<<<"));
		assertEquals(6, Main.solve(">>>><<<<<"));
		assertEquals(6, Main.solve("<<><<><<><<"));
		assertEquals(6, Main.solve(">><>><>><>>"));
		assertEquals(15, Main.solve("<<<<<<<<<<>><<<<>><<<<>>>>>>>>>>>>>>"));
		assertEquals(16, Main.solve("<<<<<<<<<<>><<<<>><<<<>>>>>>>>>>>>>>>"));
		assertEquals(16, Main.solve("<<<<<<<<<<=>><<<<=>><<<<=>>>>>>>>>>>>>>>"));
		assertEquals(16, Main.solve("<<<<=<<<<<<=>><<<<=>><<<<=>>>>>>>>>>>=>>>>"));
		assertEquals(2, Main.solve("<==><==>"));
		assertEquals(2, Main.solve("<==>==<==>"));
		assertEquals(3, Main.solve("<==<==>==>"));
		
	}

}
