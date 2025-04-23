// Take a number n and print the sum of first n natural numbers using a loop.
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

    }
}
