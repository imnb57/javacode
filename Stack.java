 // 1. As a software developer, you have been assigned a task to implement a stack data structure in Java. Your goal is to create a Java class named Stack.java that represents a stack using a array. Implement the following operations:

// push(int element): Adds an integer value element to the top of the stack.

// pop(): Removes and returns the element at the top of the stack.

// peek(): Returns the element at the top of the stack without removing it.

// isEmpty(): Checks if the stack is empty and returns a boolean value indicating the result.

// size(): Returns the number of elements currently in the stack.

// Your task is to write the Stack.java class and provide the necessary implementation for these operations using a array as the underlying data structure. Ensure that the stack follows the last-in, first-out (LIFO) principle.
public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        arr[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }
}
class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());  
        System.out.println(stack.pop());   
        System.out.println(stack.size()); 
        System.out.println(stack.isEmpty());
    }
}

