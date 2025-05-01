package method_task;
// Create a method to reverse an integer number without converting it to a string

public class q17 {
    public void reverse(int num){
        int reverse =0;
        int digit =0;
        while(num>0){
            digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;
        }
        System.out.println("The reversed number is :"+reverse);
    }
    public static void main(String[] args) {
        q17 obj = new q17();
        obj.reverse(123);
    }
}
