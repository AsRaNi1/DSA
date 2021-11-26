package com.StackLinkedList;

public class Linked_Stack {
    Node top;

    public void push(int data){
        Node node = new Node();
        node.data = data;
        if(top == null){
            top = node;
        }
        else{
            node.next = top;
            top = node;
        }
    }

    public void show(){
        Node n = top;

        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data+"\n");
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else {
            top = top.next;
        }
    }
    public void peek(){
        System.out.println(top.data);
    }
}
