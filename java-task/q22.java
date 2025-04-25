// Input a number and reverse it using loop.
import java.util.Scanner;
public class q22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int newnum=0;
        for(int i=0;num>0;i++){
            int digit = num%10;
            newnum=newnum*10+digit;
            num= num/10;
        }
        System.out.println(newnum);
    }
}