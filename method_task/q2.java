package method_task;
// Create a method to convert a given number of days into years, months, and days


public class q2 {
    public void daysconvert(int num) {
        if (num < 30) {
            System.out.println("This is " + num + " days");
        }
        else if (num >= 30 && num < 365) {
            int month = num / 30;
            int days = num % 30;
            System.out.println("This is " + month + " month and " + days + " day");
        }
        else if (num >= 365) {
            int years = num / 365;
            int remaining = num % 365;
            int month = remaining / 30;
            int days = remaining % 30;
            System.out.println("This is " + years + " year, " + month + " month, and " + days + " day");
        }
    }

    public static void main(String[] args) {
        q2 obj = new q2();
        obj.daysconvert(345); 
    }
}
