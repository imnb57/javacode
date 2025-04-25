// Take a number and check whether it is a palindrome or not using if-else and loop.
import java.util.Scanner;
public class q23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int original = num;
        int reversed=0;
        for(int i=0;num>0;i++){
            int digit = num%10;
            reversed=reversed*10+digit;
            num= num/10;
        }
        System.out.println(reversed);
        if(reversed==original){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}
