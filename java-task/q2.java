// Take two numbers as input and print their sum, difference, product, and quotient.
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("The sum of two numbers is:"+(num1+num2));
        System.out.println("The product of two numbers is:"+(num1*num2));
        System.out.println("The difference of two numbers is:"+(num1-num2));
        System.out.println("The product of two numbers is:"+(num1/num2));

    }
}
