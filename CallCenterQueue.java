// 4. Implement a call center queue using an array-based implementation of a queue. The program should allow call center agents to handle incoming calls in a fair manner. Implement the following functionalities:

// a. Add an incoming call to the queue.

// b. Serve and handle the next call in the queue.

// c. Display the current call queue.

// d. Display the number of pending calls.

// e. Exit the program.
import java.util.Scanner;

public class CallCenterQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CallCenterQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCall(String call) {
        if (isFull()) return;
        rear = (rear + 1) % capacity;
        queue[rear] = call;
        size++;
    }

    public String serveCall() {
        if (isEmpty()) return null;
        String call = queue[front];
        front = (front + 1) % capacity;
        size--;
        return call;
    }

    public void displayQueue() {
        if (isEmpty()) return;
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.println(queue[i]);
            i = (i + 1) % capacity;
        }
    }

    public int pendingCalls() {
        return size;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        CallCenterQueue queue = new CallCenterQueue(10);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Call");
            System.out.println("2. Serve Call");
            System.out.println("3. Display Queue");
            System.out.println("4. Pending Calls");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();
            sc.close();

            switch (choice) {
                case 1:
                    System.out.print("Enter Caller Name/ID: ");
                    String call = sc.nextLine();
                    queue.addCall(call);
                    break;
                case 2:
                    String served = queue.serveCall();
                    if (served != null)
                        System.out.println("Serving: " + served);
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Pending Calls: " + queue.pendingCalls());
                    break;
                case 5:
                    return;
            }
        }
    }
}

