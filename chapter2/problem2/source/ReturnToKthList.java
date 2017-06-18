package chapter2.problem2.source;
//2.2 Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
//In this problem we use two pointers both in start pointing to head;
//we move first iterator to the kth element.
//and further move first iterator to the end as well start another pointer from start.
//this gives us length - k and hence we return kth to last element list
public class ReturnToKthList {
	public static void main(String [] args)
	{
		
		List obj = new List();
		node head = obj.buildList();
		obj.print(head);
		
		node ans = obj.iterativeSolution(head, 3);
		System.out.println();
		obj.print(ans);
		
	}
}
