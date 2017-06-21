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
		String expected = geExpectedtResult(ans);
		String actual = "789";
		assertEquals(expected , actual);
		
		head = obj1.buildList1("123456789");
		ans = obj1.iterativeSolution(head, 5); 
		expected = geExpectedtResult(ans);
		actual = "56789";
		assertEquals(expected,actual);
		
		head = obj1.buildList1("");
		ans = obj1.iterativeSolution(head, 5); 
		expected = geExpectedtResult(ans);
		actual = null;
		assertEquals(expected,actual);
		
		head = obj1.buildList1(null);
		ans = obj1.iterativeSolution(head, 5); 
		expected = geExpectedtResult(ans);
		actual = null;
		assertEquals(expected,null);
		
		head = obj1.buildList1("12345");
		ans = obj1.iterativeSolution(head, 0); 
		expected = geExpectedtResult(ans);
		actual = null;
		assertEquals(expected,actual);
		
		head = obj1.buildList1("12345");
		ans = obj1.iterativeSolution(head, 5); 
		expected = geExpectedtResult(ans);
		actual = "12345";
		assertEquals(expected,actual);

		head = obj1.buildList1("12345");
		ans = obj1.iterativeSolution(head, 6); 
		expected = geExpectedtResult(ans);
		System.out.println(expected);
		actual = null;
		assertEquals(expected,actual);
		
	}
	public String geExpectedtResult(node head)
	{
		if (head == null)
			return null;
	    String expected = "";
	    node current = head;
		while(current != null)
		{
			expected = expected + current.data;
			current = current.next;
		}
		return expected;	
	}


}
