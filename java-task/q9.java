// Take marks of five subjects and calculate the total, percentage, and grade using if-else.
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject1:");
        int sub1 = sc.nextInt();
        System.out.println("Enter the marks of subject2:");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks of subject3:");
        int sub3 = sc.nextInt();
        System.out.println("Enter the marks of subject4:");
        int sub4 = sc.nextInt();
        System.out.println("Enter the marks of subject5:");
        int sub5 = sc.nextInt();
        sc.close();
        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("The total marks obtained are: " + totalMarks);
        float percentage = ((float) totalMarks / 500) * 100;
        System.out.println("The percentage obtained is: " + percentage + "%");
        if (percentage >= 90) {
            System.out.println("You obtained grade A+");
        } else if (percentage >= 80) {
            System.out.println("You obtained grade A");
        } else if (percentage >= 70) {
            System.out.println("You obtained grade B");
        } else if (percentage >= 60) {
            System.out.println("You obtained grade C");
        } else if (percentage >= 50) {
            System.out.println("You obtained grade D");
        } else {
            System.out.println("You obtained grade F");
        }
    }
}

