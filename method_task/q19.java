package method_task;
// Create a method that accepts a character and returns its ASCII value


public class q19 {
    public int asci(char ch) {
        return (int) ch;
    }

    public static void main(String[] args) {
        q19 obj = new q19();
        System.out.println("ASCII value: " + obj.asci('A'));
    }
}

