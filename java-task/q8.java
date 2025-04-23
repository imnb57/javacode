// Write a program to input a character and check if it is a vowel or a consonant using if-else.
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char vowel = sc.next().charAt(0); 
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' ||
            vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
            System.out.println("The char is vowel");
        } else {
            System.out.println("The character is not vowel");
        }
        sc.close();
    }
}
