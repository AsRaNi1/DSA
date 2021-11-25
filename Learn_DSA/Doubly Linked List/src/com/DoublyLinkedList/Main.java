package com.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list = new LinkedList();

        list.insert(30);
        list.show();
        list.insert(40);
        list.insert(50);
        list.show();
        list .insert(60);
        list.show();
        list.insert_start(10);
        list.show();
        list.insertAt(1, 20);
        list.show();
        list.delete(3);
        list.show();

    }
}
