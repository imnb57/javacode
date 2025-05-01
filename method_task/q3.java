package method_task;
// Write a method to determine whether a number is a Harshad number or not



public class q3 {
    public void harshadcheck(int num) {
       int temp = num;
       int sum = 0;
 
       while(num>0){
          int digit = num % 10;
          sum += digit;
          num /= 10;
         }
 
       if (temp % sum == 0) {
          System.out.println("this is harshad number");
       } else {
          System.out.println("not a harshad number");
       }
 
    }
 
    public static void main(String[] args) {
       q3 obj = new q3();
       obj.harshadcheck(90);
    }
 }
 