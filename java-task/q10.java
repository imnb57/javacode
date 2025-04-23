// Write a program to take a number from the user and print whether it is a leap year or not.
import java.util.Scanner;
public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        if (year%400==0)
        {
            System.out.println("It is a leap year.");
        }
        else if((year%4==0)&&(year%100!=0)) {
            System.out.println("It is a leap year.");
        }
        else {
            System.out.println("It is not a leap year.");
        }
    }
}
