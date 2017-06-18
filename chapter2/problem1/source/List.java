package chapter2.problem1.source;

import java.util.HashSet;

public class List
{
	public node buildList() //We are building linked list here.Forward building
	{
		node newnode , first , last;
		last = new node();
		first = null;
		int i = 1;
		int n = 1;
		while(i!=10)
		{
			newnode = new node();
			newnode.data = n ;
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
			if(i % 2 == 0)
				n = n + 1 ;
			i++;
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
	//Time Complexity O(n)
	//Space complexity is constant
	//This solution is also best when buffer is not allowed to use
	//In this solution we have used hash table to string node data. 
	//If the duplicate occurs in hash table it move next skip that node lined  to the next one.
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
