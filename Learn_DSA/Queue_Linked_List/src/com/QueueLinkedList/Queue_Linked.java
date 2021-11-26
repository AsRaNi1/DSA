package com.QueueLinkedList;

public class Queue_Linked {

    Node front;
    Node rear;
    int size = 0;

    public boolean isEmpty(){
        return rear==null;
    }

    public void enqueue(int data){
        Node node = new Node();
        node.data = data;
        if(isEmpty()){
            rear = node;
            front = node;
            size++;
        }
        else{
            rear.next = node;
            rear = node;
            size++;
        }
    }

    public void show(){
            Node n = front;
            while(n.next != null){
                System.out.println(n.data);
                n = n.next;
            }
        System.out.println(n.data+"\n");
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            front = front.next;
            size--;
        }
    }

    public void first(){
        System.out.println(front.data+"\n");
    }

    public void size(){
        System.out.println("Size of the Queue is "+ size+"\n");
    }
}
