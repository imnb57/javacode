package loop;
// WAP to count the digits of a number using a while loop
import java.util.Scanner;
public class whileq {
    public static void main(String[] args) {
        int count = 0;
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
    }
}

