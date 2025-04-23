// Write a program to print the multiplication table of a given number using loop.

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();
        int j =1;
        do{
            System.out.println(num+"*"+j+"="+num*j);
            j++;
        }while(j<11);

    }
}
