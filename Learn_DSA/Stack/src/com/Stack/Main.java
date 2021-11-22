package com.Stack;

public class Main {
    static int size;
    int arr[];
    int top;

    Main(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty(){
       return (top == -1);
    }

    public boolean isFull(){
        return (size-1 == top);
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println(arr[top]);
        }
        else{
            System.out.println("Stack is Empty");
        }
    }

    public void push(int var){
        if(!isFull()){
            top++;
            arr[top] = var;
            System.out.println("Pushed: "+ var);
        }
        else{
            System.out.println("Stack is Full");
        }
    }

    public int pop(){
        if(!isEmpty()){
            System.out.println("popped:"+ arr[top]);
            arr[top] = 0;
            top--;
            return arr[top];
        }
        else{
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public void see(){
        for(int i = 0; i<top+1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
	// write your code here
        Main stack = new Main(size = 7);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.see();
        stack.pop();
        stack.see();
    }
}
