package chapter2.problem4.source;

import chapter2.problem4.source.node;
//2.4 Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
//before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
//to be after the elements less than x (see below). The partition element x can appear anywhere in the
//"right partition"; it does not need to appear between the left and right partitions.


//In this solution I have used two lists.
//I traversed whole linked list and check value of node is greater then x or less.
//1. If less than save it in first list
//2. If greater save it in other.
//at the end I merge two lists

public class List
{
	public node buildList(String str) //We are building linked list here.Forward building
	{
		node n = null;
		if (str == "" || str == null)
			return n;
		node newnode , first , last;
		last = new node();
		first = null;
		int i = str.length();
		int j = 0;
		while(i!=0)
		{
			newnode = new node();
			char ch = str.charAt(j);
			newnode.data =  Character.getNumericValue(ch);
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
			i--;
			j++;
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
	//Time Complexity is linear O(n)
	//Space complexity constant O(1)
	public node partitionList(node head  , int value)
	{
		if (head == null)
			return null;
		node firstStart = null;
		node firstEnd = null;
		node secondStart = null;
		node secondEnd = null;
		while(head != null)
		{
			node temp = head.next;
			head.next = null;
			if (head.data < value)
			{
				if(firstStart == null)
				{
					firstStart = head;
					firstEnd = head;
				}
				else
				{
					firstEnd.next = head;
					firstEnd = head;
				}
			}
			else
			{
				if(secondStart == null)
				{
					secondStart = head;
					secondEnd = head;
				}
				else
				{
					secondEnd.next = head;
					secondEnd = head;
				}	
			}
			head = temp;
		}
		firstEnd.next = secondStart;
		return firstStart;
	}
	
}
