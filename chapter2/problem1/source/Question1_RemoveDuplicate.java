package chapter2.problem1.source;

import java.util.HashSet;
import java.util.Scanner;

//2.1Remove Dups: Write code to remove duplicates from an unsorted linked list.
// there are two solutions of this problem in first we simply use a hash table and store data values in it.
// if the duplicate occurs we cant save it.

// In second solution we iterate the whole linked list.
// if duplicate found then we move to the link of next node and skip that duplicate value..

public class Question1_RemoveDuplicate {

	public static void main(String [] args)
	{
		List obj = new List();
		node head = obj.buildList();
		obj.print(head);
		obj.removeDuplicate1(head);
		System.out.println();
		obj.print(head);
	}

}
class node{
	public node next;
	public int data;
}
class List
{
	public node buildList() //We are building linked list here.Forward building
	{
		node newnode , first , last;
		last = new node();
		first = null;
		int i = 1;
		System.out.print("Enter data for linked list 0 to quit "); 
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		while(i!=0)
		{
			newnode = new node();
			newnode.data = i ;
			newnode.next = null;
			if (first  == null)
			{
				first = newnode;
				last = newnode;
			}
			else
			{
				last.next = newnode;
				last = newnode;
			}
			System.out.print("Enter data for linked list 0 to quit "); 
			i = sc.nextInt();
		}
		return first;
		
	}
	public void print(node head) //Printing linked list
	{
		node current = head;
		while (current != null)
		{
			System.out.print(current.data + " ");
			current =  current.next;
		}
	}
	//Time Complexity O(n^2)
	//Space complexity is constant
	//This solution is also best when buffer is not allowed to use
	public void removeDuplicate(node head)  //Remove duplicate function
	{
		node current = head;
		while (current != null)
		{
			node runner = current;
			while(runner.next != null)
			{
				if (runner.next.data == current.data)
				{
					runner.next = runner.next.next;
				}
				else
				{
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
	public void removeDuplicate1(node head)  //Remove duplicate function
	{
		HashSet<Integer> set = new HashSet<Integer>();
		node current = head , previous = null;
		while (current != null)
		{
			
			if(set.contains(current.data))
			{
				previous.next = current.next;
			}
			else
			{
				set.add(current.data);
				previous = current;
			}
			current = current.next;
		}
	}
}
