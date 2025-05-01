package method_task;
// Write a method that returns the sum of squares of digits of a number



public class q14 {
    public int squaresum(int num){
        int result=0;
        while(num>0){
            int digit = num%10;
            result = result+(digit*digit);
            num = num/10;
        }
        return result;
    }
    public static void main(String[] args) {
        q14 obj = new q14();
        int output= obj.squaresum(23);
        System.out.println("The sum of the square of digit is: "+output);
    }
}
