// Input the age of a person and check if they are eligible to vote (18 or older).
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("No, you can't vote");
        }
    }
}
