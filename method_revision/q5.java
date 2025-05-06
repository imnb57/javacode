// 5. Write a program to take two integer inputs from the user and print the sum and product of them.
import java.util.Scanner;
public class q5 {
    static int sum(int a, int b ){
        int sum = a+b;
        return sum;
    }
    static int product(int a, int b ){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int result = sum(a,b);
        int product = product(a,b);
        System.out.println("the sum is "+result);
        System.out.println("The product is "+product);
    }
}
