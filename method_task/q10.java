package method_task;
// Write a method to print all factors of a number


public class q10 {
    public void factors(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        q10 obj = new q10();
        obj.factors(10);
    }
}
