// Input n and print the first n terms of the Fibonacci series.

import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.close();
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println(); 
    }
}
