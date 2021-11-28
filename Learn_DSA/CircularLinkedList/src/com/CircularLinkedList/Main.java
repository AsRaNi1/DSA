package com.CircularLinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circular_Linked_List list  = new Circular_Linked_List();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.show();
        list.insertAt(3, 100);
        list.show();
        list.deleteAt(3);
        list.show();
    }
}
