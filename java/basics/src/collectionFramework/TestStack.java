package collectionFramework;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());

        // can use linked list as stack
        // linked list can be used as stack since 
        // array list in java is a doubly list with address etc
        
    }
}
