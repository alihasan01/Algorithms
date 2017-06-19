package chapter2.problem3.test;

import static org.junit.Assert.*;

import org.junit.Test;
import chapter2.problem3.source.*;
public class DeletingMiddleTest {

	@Test
	public void test() {
		List obj = new List();
		String actual = "1245";
		String expected = "";
		node tmp = obj.buildList1("12345");
		node middle = findMiddle(tmp);
	    obj.removeMiddle(middle);
		while(tmp != null)
		{
			expected = expected + tmp.data;
			tmp = tmp.next;
		}
		assertEquals(actual,expected);
		
		
		actual = "12356";
		expected = "";
		tmp = obj.buildList1("123456");
		middle = findMiddle(tmp);
	    obj.removeMiddle(middle);
		while(tmp != null)
		{
			expected = expected + tmp.data;
			tmp = tmp.next;
		}
		assertEquals(actual,expected);
		
		actual = "1122334455677889900";
		expected = "";
		tmp = obj.buildList1("11223344556677889900");
		middle = findMiddle(tmp);
	    obj.removeMiddle(middle);
		while(tmp != null)
		{
			expected = expected + tmp.data;
			tmp = tmp.next;
		}
		assertEquals(actual,expected);
		
		actual = null;
		tmp = obj.buildList1("");
		if (tmp ==  null)
			expected = null;
		assertEquals(actual,expected);
		
		actual = null;
		tmp = obj.buildList1(null);
		if (tmp ==  null)
			expected = null;
		assertEquals(actual,expected);

	}
	
	//Function to find the middle node.
	public node findMiddle(node head)
	{
		if (head == null)
			return null;
		node current = head;
		node iterator = head;
		while(iterator != null)
		{
			if(iterator.next != null)
			{
				iterator = iterator.next.next;
				current = current.next;
			}
			else
			{
				iterator = iterator.next;
			}
		}
		return current;
	}
}
