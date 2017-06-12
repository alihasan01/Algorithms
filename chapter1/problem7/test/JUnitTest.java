package chapter1.problem7.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter1.problem7.source.Question7_MatrixRotation;

public class JUnitTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		int[][]mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12} , {13,14,15,16}};
		int[][]mat1 = {{13,9,5,1},{14,10,6,2},{15,11,7,3} , {16,12,8,4}};
		Question7_MatrixRotation test = new Question7_MatrixRotation();
		int[][] result = test.MatrixRotation(mat);
		assertEquals(mat1, result);
		
		int [][]mat3 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] mat4 = {{7,4,1},{8,5,2},{9,6,3}};
		result = test.MatrixRotation(mat3);
		assertEquals(mat4, result);
	}

}
