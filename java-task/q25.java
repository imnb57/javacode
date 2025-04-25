// Write a program to count how many digits are in a given number using a loop.
import java.util.Scanner;
public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
        for (int i=0;num>0;i++){
            count++;
            num=num/10;
        }
        System.out.println("The number of digits are "+count);
    }
}
