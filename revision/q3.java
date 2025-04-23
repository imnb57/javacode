// Write a program to input a word and print a new word formed by removing all duplicate characters using string functions and a loop.

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.nextLine();
        String modified = "";
        Character prevchar;
        Character nextchar;
        int lenstr = word.length();
        Character f = word.charAt(0);
        modified=Character.toString(f);
        for(int i=1;i<lenstr;i++){
            prevchar = word.charAt(i-1);
            nextchar = word.charAt(i);
            if(prevchar ==nextchar){
                modified+=" ";
            }else{
                modified+=nextchar;
            }
        }
        System.out.println(modified);
    }
}
