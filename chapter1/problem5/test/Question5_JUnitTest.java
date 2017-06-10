package chapter1.problem5.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.problem5.source.Question5_OneAway;

public class Question5_JUnitTest {

	@Test
	public void test() {
		Question5_OneAway caller = new Question5_OneAway();
		boolean expected = true;
		boolean actual = caller.oneEditAway("pale", "pal");
		assertEquals(expected, actual);
		
		expected = true;
		actual = caller.oneEditAway("pales", "pale");
		assertEquals(expected, actual);
		
		expected = true;
		actual = caller.oneEditAway("pale", "bale");
		assertEquals(expected, actual);
		
		expected = false;
		actual = caller.oneEditAway("pale", "bae");
		assertEquals(expected, actual);
		
		expected = true;
		actual = caller.oneEditAway("", "");
		assertEquals(expected, actual);
		
		expected = false;
		actual = caller.oneEditAway("abc", "");
		assertEquals(expected, actual);
		
		expected = false;
		actual = caller.oneEditAway("", "abc");
		assertEquals(expected, actual);
		
		expected = false;
		actual = caller.oneEditAway(null, "abc");
		assertEquals(expected, actual);
		
		expected = false;
		actual = caller.oneEditAway("I love Pakistan  ", "abc");
		assertEquals(expected, actual);
	}

}
