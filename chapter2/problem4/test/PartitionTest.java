package chapter2.problem4.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter2.problem4.source.List;
import chapter2.problem4.source.node;

public class PartitionTest {

	@Test
	public void test() {
		String actual = "32562349";
		List obj = new List();
		node head = obj.buildList("32562934");
		node answer = obj.partitionList(head, 9);
		String expected = expectedResult(answer);
		assertEquals(actual , expected);
		
		
		actual = "123456789";
		obj = new List();
		head = obj.buildList("123456789");
		answer = obj.partitionList(head, 5);
		expected = expectedResult(answer);
		assertEquals(actual , expected);
		
		actual = "1423431756586789";
		obj = new List();
		head = obj.buildList("1427354658637819");
		answer = obj.partitionList(head, 5);
		expected = expectedResult(answer);
		assertEquals(actual , expected);
		
		actual =  null;
		obj = new List();
		head = obj.buildList("");
		answer = obj.partitionList(head, 5);
		if (answer == null)
			expected = null;
		assertEquals(actual , expected);
		
		actual =  null;
		obj = new List();
		head = obj.buildList(null);
		answer = obj.partitionList(head, 5);
		if (answer == null)
			expected = null;
		assertEquals(actual , expected);
	}
	
	
	public String expectedResult(node head)
	{
		String expected = "";
		while(head != null)
		{
			expected = expected + head.data;
			head = head.next;
		}
		return expected;
	}

}
