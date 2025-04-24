// Write a program to find the sum of digits of a number using a loop.
import java.util.Scanner;
public class q21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        while(num > 0){
            sum += num % 10; 
            num /= 10;       
        }

        System.out.println("Sum of digits: " + sum);
    }
}