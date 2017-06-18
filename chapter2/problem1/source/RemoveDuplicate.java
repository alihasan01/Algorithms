package chapter2.problem1.source;

public class RemoveDuplicate {
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
