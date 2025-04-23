package if_else;
// 5. Write a JAVA program to check whether a year is a leap year or not. 
public class q5 {
    public static void main(String[] args) {
        int year = 2025;
        if (year%400==0)
        {
            System.out.println("It is a leap year.");
        }
        else if((year%4==0)&&(year%100!=0)) {
            System.out.println("It is a leap year.");
        }
        else {
            System.out.println("It is not a leap year.");
        }
    }
}
