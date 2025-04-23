// Write a program to check whether a given number is positive, negative, or zero using if-else.
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();
        if(num<0){
            System.out.println("The number is negative");
        }
        else if (num>0){
            System.out.println("The number is positive");
        }
        else if(num ==0){
            System.out.println("The number is zero");
        }
    }
}
