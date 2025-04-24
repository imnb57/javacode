// Write a program to input a number from 1 to 7 and display the day of the week using switch.
import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (1-7):");
        int num = sc.nextInt();
        sc.close();
        String day;
        switch(num) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid input! Please enter a number between 1 and 7.";
        }
        System.out.println("Day : " + day);
    }
}
