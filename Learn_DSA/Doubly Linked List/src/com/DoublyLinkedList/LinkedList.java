package com.DoublyLinkedList;

public class LinkedList {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }
    }

    public void insert_start(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void show(){
        Node n = head;

        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data+ "\n");
    }

    public void delete(int index){
        Node n = head;
        Node temp = new Node();
        if(index == 0){
            temp = n;
            head = temp.next;
        }
        else {
            for (int i = 0; i < index; i++) {
                temp = n;
                n = n.next;
            }
            temp.next = n.next;
            n.next.prev = temp;
        }
    }

    public void insertAt(int index, int data){
        Node n = head;
        Node node = new Node();
        node.data = data;
        for(int i=0; i<index; i++)
        {
            n = n.next;
        }
        node.next = n;
        node.prev = n.prev;
        n.prev.next = node;
        n.prev = node;
    }

}
