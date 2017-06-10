package chapter1.problem6.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.problem5.source.Question5_OneAway;
import chapter1.problem6.source.Question6_CompressedString;

public class Question6_JUnitTest {

	@Test
	public void test() {
		Question6_CompressedString caller = new Question6_CompressedString();
		String expected = "a2b3c2";
		String actual = caller.compressedString("aabbbcc");
		assertEquals(expected, actual);
		
	    expected = "abbcvbcc";
		actual = caller.compressedString("abbcvbcc");
		assertEquals(expected, actual);
		
		expected = "a10b3d1s1";
	    actual = caller.compressedString("aaaaaaaaaabbbds");
		assertEquals(expected, actual);
		
		expected = "";
	    actual = caller.compressedString("");
		assertEquals(expected, actual);
		
		expected = "";
	    actual = caller.compressedString(null);
		assertEquals(expected, actual);
		
	}

}
