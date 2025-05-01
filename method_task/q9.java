package method_task;
// Create a method to find the sum of the first n natural numbers


public class q9 {
    public void totalsum(int n){
        int sum = 0;
        for(int i =1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("The total sum is: "+sum);
    }
    public static void main(String[] args) {
        q9 obj = new q9();
        obj.totalsum(3);
    }
}
