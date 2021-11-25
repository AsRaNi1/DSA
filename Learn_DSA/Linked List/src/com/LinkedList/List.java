package com.LinkedList;

public class List {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null) {
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node n = head;
        while(n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data+"\n");
    }

    public void insert_start(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        Node n = head;
        Node temp = new Node();
        for(int i=0; i<index; i++)
        {
            temp = n;
            n = n.next;
        }
        temp.next = node;
        node.next = n;
    }

    public void delete(int index){
        Node n = head;
        Node temp = new Node();
        if(index == 0){
            head = n.next;
            n = null;
        }

        else {
            for (int i = 0; i < index; i++) {
                temp = n;
                n = n.next;
            }
            temp.next = n.next;
        }
    }
}
