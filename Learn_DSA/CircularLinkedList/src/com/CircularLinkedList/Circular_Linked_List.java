package com.CircularLinkedList;

public class Circular_Linked_List {

    Node head;
    int size=0;
    public boolean isEmpty(){
        return head == null;
    }

    public void insert(int data){
        Node node = new Node();
        node.data = data;

        if(isEmpty()){
            head = node;
            node.next = head;
            size++;
        }

        else{
            Node n = head;

            while(n.next != head){
                n = n.next;
            }

            n.next = node;
            node.next = head;
            size++;
        }
    }

    public void size(){
        System.out.println("size ="+size);
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        Node temp = new Node();
        node.data = data;
        Node n = head;
        if(index == 0){
            node.next = head;
            head = node;
        }

        else{
            for(int i=0; i<index; i++)
            {
                temp = n;
                n = n.next;
            }
            temp.next = node;
            node.next = n;
        }
    }

    public void show(){
        Node n = head;

        while(n.next != head){
            System.out.println(n.data);
            n = n.next;
        }

        System.out.println(n.data+"\n");
    }

    public void deleteAt(int index){
        Node n = head;
        Node temp = new Node();
        if(index == 0){
            head = n.next;
        }

        else{
            for(int i=0; i<index; i++)
            {
                temp = n;
                n = n.next;
            }

            temp.next = n.next;
        }
    }
}
