// Input a number and display the factorial of that number using a  loop.
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        sc.close();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i; 
        }
        System.out.println("Factorial of " + num + " is: " + factorial); 
    }
}
