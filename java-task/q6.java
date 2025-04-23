// Take a number from the user and print whether it is even or odd.
import java.util.Scanner;
public class q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int a = sc.nextInt();
        sc.close();
        if (a%2 == 0){
            System.out.println("The number is even");
        }
        else if(a%2!=0){
            System.out.println("The number is odd");
        }
    }
}
