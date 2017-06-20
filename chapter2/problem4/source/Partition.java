package chapter2.problem4.source;
import chapter2.problem4.source.node;
public class Partition {
	
	public static void main(String []args)
	{
		List obj = new List();
		node head = obj.buildList("32562934");
		obj.print(head);
		node answer = obj.partitionList(head, 9);
		System.out.println();
		obj.print(answer);
	}

}
