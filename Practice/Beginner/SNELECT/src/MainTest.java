import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals("tie", Main.solve("sms"));
		assertEquals("snakes", Main.solve("ssms"));
		assertEquals("snakes", Main.solve("smss"));
		assertEquals("mongooses", Main.solve("smms"));
		assertEquals("snakes", Main.solve("s"));
		assertEquals("snakes", Main.solve("ss"));
		assertEquals("tie", Main.solve("ssm"));
		assertEquals("mongooses", Main.solve("sm"));
		assertEquals("mongooses", Main.solve("ssmmmmmm"));
		assertEquals("mongooses", Main.solve("mssm"));
		assertEquals("snakes", Main.solve("msssssm"));
		assertEquals("mongooses", Main.solve("m"));
		assertEquals("mongooses", Main.solve("mmm"));
		assertEquals("mongooses", Main.solve("msmsm"));
		assertEquals("mongooses", Main.solve("smsmsm"));
		assertEquals("mongooses", Main.solve("smsmsms"));
		assertEquals("mongooses", Main.solve("ssmmmss"));
		assertEquals("mongooses", Main.solve("ssmsmsmms"));
		assertEquals("mongooses", Main.solve("m"));
		assertEquals("mongooses", Main.solve("msms"));
		assertEquals("mongooses", Main.solve("smsms"));
		assertEquals("mongooses", Main.solve("smsm"));
		assertEquals("snakes", Main.solve("s"));
		assertEquals("snakes", Main.solve("smss"));
		assertEquals("snakes", Main.solve("sssm"));
		assertEquals("snakes", Main.solve("ssssmm"));
		assertEquals("snakes", Main.solve("smssmss"));
		assertEquals("snakes", Main.solve("sssssss"));
		assertEquals("snakes", Main.solve("sssmmmsss"));
		assertEquals("snakes", Main.solve("sssssmmm"));
		assertEquals("tie", Main.solve("sms"));
		assertEquals("tie", Main.solve("ssm"));
		assertEquals("tie", Main.solve("msmsss"));
		assertEquals("tie", Main.solve("ssmsms"));
		assertEquals("tie", Main.solve("mmmssss"));
		assertEquals("tie", Main.solve("ssssmmm"));
		assertEquals("tie", Main.solve("smssmssms"));
		assertEquals("tie", Main.solve("mssmmssmssss"));
		assertEquals("tie", Main.solve("mssmssssmssm"));
		assertEquals("tie", Main.solve("ssssmssmmssm"));
		assertEquals("tie", Main.solve("ssmssmmssmss"));
		assertEquals("tie", Main.solve("mssssmmssssm"));
		assertEquals("tie", Main.solve("msssssmmmssssm"));
		assertEquals("tie", Main.solve("msssssmmmmsssssm"));
	}

}
