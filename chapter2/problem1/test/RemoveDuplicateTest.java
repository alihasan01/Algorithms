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
		String expected = geExpectedtResult(head);
		String actual = "12345";
		assertEquals(expected , actual);
		
		head = obj1.buildList1("");           //In builtList1 I am passing string to test list.
		expected = geExpectedtResult(head);   //String contain any values to built list.
		actual =  null;                       //In builtlist1 function I get character by character value and store in nodes.
		assertEquals(expected,actual);
		
		head = obj1.buildList1(null);         
		expected = geExpectedtResult(head);   
		actual =  null;
		assertEquals(expected,null);
		
		head = obj1.buildList1("1234567"); //List has element 12345
		obj1.print(head);
	    obj1.removeDuplicate1(head);
	    expected = geExpectedtResult(head);
	    actual = "1234567";
		assertEquals(expected , actual);
		
		//return first;
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
