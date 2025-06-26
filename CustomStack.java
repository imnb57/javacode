// // 2. You are tasked with implementing a stack data structure in Java without using any built-in libraries. Your goal is to create a CustomStack class that can handle various operations. The class should have the following functionalities:

// push(int val): Adds an integer value val to the top of the stack.

// pop(): Removes and returns the element at the top of the stack.

// peek(): Returns the element at the top of the stack without removing it.
// isEmpty(): Checks if the stack is empty and returns a boolean value indicating the result.

// isFull(): Checks if the stack is full and returns a boolean value indicating the result.
public class CustomStack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        if (isFull()) return;
        stackArray[++top] = val;
    }

    public int pop() {
        if (isEmpty()) return -1;
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) return -1;
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
 class TestStack {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());  
        System.out.println("Popped: " + stack.pop());           
        System.out.println("Top after pop: " + stack.peek());   

        while (!stack.isEmpty()) {
            System.out.println("Popping: " + stack.pop());
        }

        stack.pop();
    }
}

