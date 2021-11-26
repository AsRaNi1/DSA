package com.StackLinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Linked_Stack stack = new Linked_Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.show();
        stack.pop();
        stack.show();
        stack.push(40);
        stack.push(50);
        stack.show();
        stack.peek();
    }
}
