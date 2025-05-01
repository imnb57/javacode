package method_task;
// Write a method to swap two numbers using a temporary variable


public class q7 {
    public void swapper(int a, int b){
        System.out.println("Before swap: "+a+","+b);
        int temp =0;
        temp =a;
        a=b;
        b=temp;
        System.out.println("After swap: "+a+","+b);
    }
    public static void main(String[] args) {
        q7 obj = new q7();
        obj.swapper(7, 8);
    }
}
