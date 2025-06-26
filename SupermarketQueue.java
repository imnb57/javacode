// // 
// 3. Design a program that simulates a supermarket queue management system using an array-based implementation of a queue. The system should allow customers to join the queue, get served, and exit the queue. Implement the following functionalities:

// a. Add a customer to the queue.

// b. Serve the next customer in the queue.

// c. Display the current queue.

// d. Display the number of customers in the queue.

// e. Exit the program
import java.util.Scanner;

public class SupermarketQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public SupermarketQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCustomer(String name) {
        if (isFull()) return;
        rear = (rear + 1) % capacity;
        queue[rear] = name;
        size++;
    }

    public String serveCustomer() {
        if (isEmpty()) return null;
        String name = queue[front];
        front = (front + 1) % capacity;
        size--;
        return name;
    }

    public void displayQueue() {
        if (isEmpty()) return;
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.println(queue[i]);
            i = (i + 1) % capacity;
        }
    }

    public int countCustomers() {
        return size;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        SupermarketQueue queue = new SupermarketQueue(20);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Number of Customers");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();
            sc.close();
            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    queue.addCustomer(name);
                    break;
                case 2:
                    String served = queue.serveCustomer();
                    if (served != null)
                        System.out.println("Serving: " + served);
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Number of Customers: " + queue.countCustomers());
                    break;
                case 5:
                    return;
            }
        }
    }
}
