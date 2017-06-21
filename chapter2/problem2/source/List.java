package chapter2.problem2.source;

import java.util.Scanner;

import chapter2.problem2.source.node;

public class List
{
	public node buildList() //We are building linked list here.Forward building
	{
		node newnode , first , last;
		last = new node();
		first = null;
		int i = 1;
		while(i!=10)
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
			i++;
		}
		return first;
	}
	public node buildList1(String str) //We are building linked list here.Forward building
	{
		if (str == "" || str == null)
			return null;
		node newnode , first , last;
		last = new node();
		first = null;
		int i = 0;
		int n = str.length();
		while(n != 0)
		{
			newnode = new node();
			char ch = str.charAt(i);
			newnode.data = Character.getNumericValue(ch) ;
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
			n--;
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
	//Time complexity O(n)
    //Space complexity it has constant O(1)
	public node ReturnToKth(node head , int k) //MySolution
	{										   // I assume that I have to find list from kth element to last.
		int n = 1;							   // e.g 1,2,3,4,5,6  if kth is 3 the it should print 3,4,5,6.
		node current = head;
		node found = null;
		while(current != null)
		{
			if (n == k)
			{
				found = current;
				return found;
			}
			current = current.next;
			n++;
		}
		return current;
	}
	//Time complexity O(n)
	//But it will take extra space due to recursive calls.
	//Take linear time O(n)
	public int recursiveSolution(node head , int k)
	{
		if (head == null)
			return 0;
		
		int index = recursiveSolution(head.next , k) + 1;
		if (index == k)
			System.out.println(k + " th element to last node is " + head.data);
		return index;
		
	}
	//Time complexity O(n)
	//Space complexity it has constant O(1)
	public node iterativeSolution(node head , int k)
	{
		node p1 = head;
		node p2 = head;
		for (int i = 0 ; i < k ; i++ ) // We move our first pointer to the kth element from beginning.
		{
			if (p1 == null)
				return null;
			p1 = p1.next;
		}
		while(p1 != null)             // After reaching kth element we start next iterator from start and move our first iterator where it left.  
		{							   
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
	
}
