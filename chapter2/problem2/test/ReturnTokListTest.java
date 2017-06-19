package chapter2.problem2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import chapter2.problem2.source.List;
import chapter2.problem2.source.node;

public class ReturnTokListTest {

	@Test
	public void test() {
		List obj1 = new List();
		node head = obj1.buildList(); //List has element 112233445
		obj1.print(head);
		node ans = obj1.iterativeSolution(head, 3); //List has element 1,2,3,4,5,6,7,8,9
		String expected = "";
		node current = ans;
		String actual = "789";
		while(current != null)
		{
			expected = expected + current.data;
			current = current.next;
		}
		System.out.println(expected);
		assertEquals(expected , actual);
		assertNotEquals(expected,"");
		assertNotEquals(expected,"12345678900976431");
		assertNotEquals(expected,null);
		
		obj1 = new List();
		head = obj1.buildList(); //List has element 12345
		obj1.print(head);
		ans = obj1.iterativeSolution(head, 5);
	    expected = "";
		current = ans;
		actual = "56789";
		while(current != null)
		{
			expected = expected + current.data;
			current = current.next;
		}
		assertEquals(expected , actual);
		assertNotEquals(expected,"");
		assertNotEquals(expected,"12345678900976431");
		assertNotEquals(expected,null);
		
	}

}
