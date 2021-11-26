package com.QueueLinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue_Linked queue = new Queue_Linked();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.show();
        queue.dequeue();
        queue.show();
        queue.first();
        queue.size();
    }
}
