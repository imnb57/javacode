package method_task;
// Write a method to swap two numbers without using a temporary variable


public class q8 {
    public void swapper(int a, int b){
        System.out.println("Before swap: "+a+","+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: "+a+","+b);
    }
    public static void main(String[] args) {
        q8 obj = new q8();
        obj.swapper(6, 9);
    }
}
