package chapter1.problem9.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.problem9.source.Question9_StringRotation;

public class JUnitTest {

	@Test
	public void test() {
		Question9_StringRotation obj = new Question9_StringRotation();
		boolean expected = true;
		boolean actual = obj.stringRotation("Hello", "lloHe");
		assertEquals(expected , actual);
		
		expected = true;
		actual = obj.stringRotation("waterbottle", "erbottlewat");
		assertEquals(expected , actual);
		
		expected = false;
		actual = obj.stringRotation("water", "bottlewat");
		assertEquals(expected , actual);
		
		expected = true;
		actual = obj.stringRotation("water", "water");
		assertEquals(expected , actual);
		
		expected = false;
		actual = obj.stringRotation("", "water");
		assertEquals(expected , actual);
		
		expected = true;
		actual = obj.stringRotation("", "");
		assertEquals(expected , actual);
	}

}
