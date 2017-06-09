package chapter1.problem4.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.problem4.source.Question4_PalindromePermutation;

public class JUnitTestPalindromePermutation {

	@Test
	public void test() {
		Question4_PalindromePermutation obj = new Question4_PalindromePermutation();
		boolean actual = false;
		boolean expected = obj.PermutationPelindrome("Hello");
		assertEquals(actual , expected);
		
		actual = true;
        expected = obj.PermutationPelindrome("");
		assertEquals(actual , expected);
		
		actual = true;
        expected = obj.PermutationPelindrome("HelleH");
		assertEquals(actual , expected);
		
		actual = true;
        expected = obj.PermutationPelindrome("aabbxxsps");
		assertEquals(actual , expected);
		
		actual = false;
        expected = obj.PermutationPelindrome("I love Pakistan.");
		assertEquals(actual , expected);
		
		actual = false;
        expected = obj.PermutationPelindrome(null);
		assertEquals(actual , expected);
	}

}
