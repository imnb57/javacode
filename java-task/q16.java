// Take two numbers and an operator (+, -, *, /) and perform the operation using switch.
import java.util.Scanner;
public class q16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number:");
        float num2 = sc.nextFloat();
        System.out.println("Enter operator (+, -, *, /):");
        char op = sc.next().charAt(0);
        sc.close();
        float result;
        switch(op){
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}