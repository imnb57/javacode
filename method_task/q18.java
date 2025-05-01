package method_task;
// Write a method to generate the first n terms of the Fibonacci series


public class q18 {
    public void fibo(int num) {
        int a = 0, b = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        q18 obj = new q18();
        obj.fibo(5);
    }
}
