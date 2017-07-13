package chapter2.problem5.source;

import java.util.HashSet;

import chapter2.problem5.source.Node;

/**
 * @author Ali
 * 2.1Remove Dups: Write code to remove duplicates from an unsorted linked list.
 * Solution:
 * There are two solutions of this problem in first
 * we simply use a hash table and store data values in it.
 * if the duplicate occurs we can't save it.
 * In second solution we iterate the whole linked list.
 * if duplicate found then we move to the link of
 *  next Node and skip that duplicate value..
 */
public class List {
    
    private Node head;
    /**
     * Constructor
     *      */
    public void List() {
        head = null;
    }
    /**
     * //We are building linked list here.Forward building
     * @return Node after building list
     */
    public Node buildList() {
        Node newNode, first, last;
        last = new Node();
        first = null;
        int i = 1;
        int n = 1;
        while (i != 10) {
            newNode = new Node();
            newNode.data = n;
            newNode.next = null;
            if (first  == null) {
                first = newNode;
                last = newNode;
                head = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
            if (i % 2 == 0) {
                n = n + 1;
            }
            i++;
        }
        return head;
    }
     /**
     * //We are building linked list here.Forward building.
     * @return Node after building list
     * @param inputArray contains input of element
     */
    public Node buildList1(final int[]inputArray) {
        Node newNode, first, last;
        last = new Node();
        first = null;
        int length = inputArray.length;
        int i = 0;
        while (length != 0) {
            newNode = new Node();
            newNode.data = inputArray[i];
            newNode.next = null;
            if (first  == null) {
                first = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
            i++;
            length--;
        }
        return first;
    }
    /**We are building linked list here.Forward building.
     * @return Node after building list
     * @param str get string to build the list.
     * */
    public Node buildList1(final String str) {
        if (str == "" || str == null) {
            return null;
        }
        Node newNode, first, last;
        last = new Node();
        first = null;
        int i = 0;
        int n = str.length();
        while (n != 0) {
            newNode = new Node();
            char ch = str.charAt(i);
            newNode.data = Character.getNumericValue(ch);
            newNode.next = null;
            if (first  == null) {
                first = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
            n--;
            i++;
        }
        return first;
    }
    /** Printing a linked list.
     * @param head Node get the head Node to print the list
     * */
    public void print(final Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current =  current.next;
        }
    }
    /**
    * Time Complexity O(n^2)
    * Space complexity is constant
    * This solution is also best when buffer is not allowed to use.
    * Remove duplicate function
    * @param head of linked list
    * */
     public Node sumLists(Node l1, Node l2, final int carry) {
         if (l1 == null && l2 == null && carry == 0) {
             return null;
         }
         Node answer = new Node();
         int value = carry;
         if (l1 !=  null) {
             value = value + l1.data;
         }
         if (l2 !=  null) {
             value = value + l2.data;
         }
         answer.data = value % 10;
         if (l1 != null || l2 != null) {
             Node Next = sumLists(l1 == null ? null : l1.next, l2 == null ? null : l2.next, value >=10 ? 1 : 0);
             answer.next = Next;
         }
        return answer;
    }
}
