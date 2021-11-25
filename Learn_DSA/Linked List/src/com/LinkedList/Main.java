package com.LinkedList;

public class Main {

    public static void main(String[] args) {
	List list = new List();

    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.show();
    list.insert_start(40);
    list.show();
    list.insert(50);
    list.insert_start(5);
    list.show();
    list.insertAt(3, 15);
    list.show();
    list.delete(4);
    list.show();
    list.delete(0);
    list.show();

    }
}
