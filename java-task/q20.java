// Input a number and check if it is a perfect square using loop.
import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();
        boolean square = false;
        for (int i = 0; i * i <= num; i++) {
            if (i * i == num) {
                square = true;
                break;
            }
        }
        if (square) {
            System.out.println(num + " is  perfect square.");
        } else {
            System.out.println(num + " is not perfect square.");
        }
        
    }
}
