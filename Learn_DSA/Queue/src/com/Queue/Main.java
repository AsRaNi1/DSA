package com.Queue;

public class Main {

    int size;
    int arr[];
    int front;
    int back;
    int num;

    Main(int size){
        this.size = size;
        this.arr = new int[size];
        this.front = 0;
        this.back = -1;
        this.num = 0;
    }

    public boolean isEmpty(){
        return back == -1;
    }

    public boolean isFull(){
        return size-1 == back;
    }

    public void peek(){
        if(!isEmpty()){
        System.out.println("Front element = "+ arr[front]);
        }
        else{
            System.out.println("The queue is empty");
        }
    }

    public void enqueue(int value){
        if(!isFull()){
            back++;
            arr[back] = value;
            System.out.println("Inserted: "+ value);
            num++;
        }
        else{
            System.out.println("The queue is full");
        }
    }

    public void dequeue(){
        if(!isEmpty()){
            System.out.println("Removed: "+ arr[front]);
            size--;
            front++;
        }
        else{
            System.out.println("The queue is Empty");
        }
    }

    public static void main(String[] args) {
	// write your code here
        Main queue = new Main(8);

        queue.peek();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.peek();
        queue.dequeue();
        queue.peek();
    }
}
