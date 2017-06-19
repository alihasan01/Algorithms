package chapter2.problem3.source;

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
	//It will take linear time O(n)
	//It will take constant space O(1)
	// I assume to take middle node and assign the every next value to the present value..
	//for e.g if list is {1,2,3,4,5} I take '3' in function and try to assign 3 node to 4
	// 4 node to 5 and so on..
	public node mySolution(node middle)
	{
		node current = middle;
		while(current.next != null)
		{
			current.data = current.next.data;
			current = current.next;
		}
		middle = current;
		current = null;	
		return current;

	}
	//It will take constant time O(1)
	//It will take constant space O(1)
	public void removeMiddle(node middle)
	{
		node tmp = middle.next;
		middle.data = tmp.data;
		middle.next = tmp.next;
	}
}
