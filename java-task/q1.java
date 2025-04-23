// Write a Java program to input your full name and print a greeting message.
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Name:");
        String firstName = sc.nextLine();
        System.out.println("Enter your last Name:");
        String lastName = sc.nextLine();
        sc.close();
        System.out.println("Hello"+" "+firstName+" "+lastName);
    }
}
