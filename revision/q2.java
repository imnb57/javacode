// Write a program that takes a sentence and replaces all vowels with * using a for loop and if-else.

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String myinput = sc.nextLine();
        Character a = ' ';
        String modified="";
        int lenstr = myinput.length();
        for (int i=0;i<lenstr;i++){
            a = myinput.charAt(i);
            if(a =='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                modified = myinput.replace(a, '*');
            }
        }
        System.out.println(modified);
    }
}
