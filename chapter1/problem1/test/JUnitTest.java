package chapter1.problem1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.problem1.source.Question1_IsUnique;

public class JUnitTest {

	@Test
	public void test() {
		Question1_IsUnique test = new Question1_IsUnique();
		boolean result = test.IsUnique("Ali");
		assertEquals(result , true);
		result = test.IsUnique("hasan");
		assertEquals(result , false);
		result = test.IsUnique("");
		assertEquals(result , true);
		result = test.IsUnique(null);
		assertEquals(result , true);
	}

}
