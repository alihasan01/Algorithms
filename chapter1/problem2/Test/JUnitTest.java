package chapter1.problem2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.problem2.source.Question2_CheckPermutation;

public class JUnitTest {

	@Test
	public void test() {
		Question2_CheckPermutation obj = new Question2_CheckPermutation();
		boolean result = obj.permutation("hello", "olleh");
		assertEquals(result , true);
		result = obj.permutation("Hellow ", "World");
		assertEquals(result , false);
		result = obj.permutation("", "ila");
		assertEquals(result , false);
		result = obj.permutation("Hello world", "world Hello");
		assertEquals(result , true);
		result = obj.permutation("", "");
		assertEquals(result , true);
		result = obj.permutation("", null);
		assertEquals(result , false);
		result = obj.permutation("ali", "ila");
		assertEquals(result , true);
	}

}
