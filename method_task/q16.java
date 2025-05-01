package method_task;
// Write a method to check if a number is a Kaprekar number


public class q16 {
    public void Kaprekar(int num) {
        if (num == 1) {
            System.out.println(num + " is a Kaprekar number");
            return;
        }
        int square = num * num;
        int digits = 0;
        int temp = square;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        int divisor = 1;
        for (int i = 1; i < digits; i++) {
            divisor *= 10;
            int part1 = square / divisor;
            int part2 = square % divisor;

            if (part2 > 0 && (part1 + part2) == num) {
                System.out.println(num + " is a Kaprekar number");
                return;
            }
        }
        System.out.println(num + " is not a Kaprekar number");
    }

    public static void main(String[] args) {
        q16 obj = new q16();
        obj.Kaprekar(45);
    }
}
