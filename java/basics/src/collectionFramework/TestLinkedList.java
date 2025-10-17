package collectionFramework;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("runs");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        System.out.println(linkedList);

        linkedList.addFirst(3);
        linkedList.addLast(1);
        System.out.println(linkedList);
        System.out.println("First : " + linkedList.getFirst());
        System.out.println("Last : " + linkedList.getLast());

        // removing with condition
        linkedList.removeIf(item -> item % 2 == 0); // lambda expression
        System.out.println(linkedList);
        
    }
}
