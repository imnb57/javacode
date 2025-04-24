// Input a month number (1–12) and print the number of days in that month using switch.
import java.util.Scanner;
public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month  (1-12):");
        int month = sc.nextInt();
        sc.close();
        int days;
        switch(month) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10:
            case 12: 
                days = 31;
                break;
            case 4: 
            case 6: 
            case 9: 
            case 11: 
                days = 30;
                break;
            case 2: 
                days = 28; 
                break;
            default:
                System.out.println("Invalid month number");
                return; 
        }
        System.out.println("Number of days  "  + ": " + days);
    }
}
