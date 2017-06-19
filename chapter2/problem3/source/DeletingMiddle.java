package chapter2.problem3.source;
//2.3 Delete Middle Node: Implement an algorithm to delete a node in the middle 
//In this solution what I have done is, take middle node in the function.
//1. Take temporary node assign middle.next to that temporary node.
//2. Assign middle.data to tmp.data . Its mean we are assigning the data value of next to middle node to middle node.
//3. Assigning middle.next to tmp.next it will do the job for maintaining link. Skip the useless node(node o be deleted)
import java.util.Scanner;
public class DeletingMiddle {
	public static void main(String [] args)
	{
		
		List obj = new List();
		node head = obj.buildList1("12345");
		obj.print(head);
		
		System.out.println();
		
		//obj.print(answer);
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
	    obj.removeMiddle(current);
		obj.print(head);
	}
}
