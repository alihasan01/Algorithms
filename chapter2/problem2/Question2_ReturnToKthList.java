package chapter2.problem2.source;

import java.util.Scanner;

import chapter2.problem2.source.List;
import chapter2.problem2.source.node;
//2.2 Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
//In this problem we use two pointers both in start pointing to head;
//we move first iterator to the kth element.
//and further move first iterator to the end as well start another pointer from start.
//this gives us length - k and hence we return kth to last element list
public class Question2_ReturnToKthList {
	public static void main(String [] args)
	{
		List obj = new List();
		node head = obj.buildList();
		obj.print(head);
		//node answer = obj.ReturnToKth(head, 6);
		int answer = obj.recursiveSolution(head, 5);
		System.out.println();
		//obj.print(answer);
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
