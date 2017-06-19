package chapter2.problem1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter2.problem1.source.List;
import chapter2.problem1.source.node;

public class RemoveDuplicateTest {

	@Test
	public void Test()
	{
		
		List obj1 = new List();
		node head = obj1.buildList(); //List has element 112233445
		obj1.print(head);
	    obj1.removeDuplicate1(head);
		String expected = "";
		node current = head;
		while(current != null)
		{
			expected = expected + current.data;
			current = current.next;
		}
		assertEquals(expected , "12345");
		assertNotEquals(expected,"");
		assertNotEquals(expected,"12345678900976431");
		assertNotEquals(expected,null);
		
		obj1 = new List();
		head = obj1.buildList1(); //List has element 12345
		obj1.print(head);
	    obj1.removeDuplicate1(head);
	    expected = "";
		current = head;
		while(current != null)
		{
			expected = expected + current.data;
			current = current.next;
		}
		assertEquals(expected , "12345");
		assertNotEquals(expected,"");
		assertNotEquals(expected,"12345678900976431");
		assertNotEquals(expected,null);
		
		//return first;
	}
	

}
