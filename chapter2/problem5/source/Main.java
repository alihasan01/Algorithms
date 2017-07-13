package chapter2.problem5.source;

import chapter2.problem5.source.List;
import chapter2.problem5.source.Node;

public class Main {
    public static void main(String [] args) {
        List obj = new List();
        int []input = {7,1,6};
        int []input1 = {5,9,2};
        Node head1 = obj.buildList1(input);
        Node head2 = obj.buildList1(input1);
        obj.print(head1);
        System.out.println();
        obj.print(head2);
        Node result = obj.sumLists(head1, head2, 0);
        System.out.println();
        obj.print(result);
    }

}
