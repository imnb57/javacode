package switchcase;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's grade (A, B, C, D, or F): ");
        String grade = scanner.next().toUpperCase(); // Convert to uppercase to handle lowercase input
        double gpa;

        switch (grade) {
            case "A":
                gpa = 4.0;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "C":
                gpa = 2.0;
                break;
            case "D":
                gpa = 1.0;
                break;
            case "F":
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
                return;
        }

        System.out.println("The GPA value for grade " + grade + " is: " + gpa);
    }
}
