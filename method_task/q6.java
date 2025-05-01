package method_task;
// Create a method to check whether a given number is a palindrome prime



public class q6 {
    public void palindromecheck(int num){
        int reverse=0;
        int temp = num;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; 
                    break;
                }
            }
        }
        while(num>0){
            int digit = num % 10;
            reverse = reverse*10+digit;
            num /= 10;
        }
        if(reverse ==temp && isPrime){
            System.out.println("The number is palindrome prime");
        }
        else{
            System.out.println("The number is not palindrome prime");
        }
    }
    public static void main(String[] args) {
        q6 obj = new q6();
        obj.palindromecheck(757);
    }
}
