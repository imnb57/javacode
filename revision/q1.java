
// Write a program to input a sentence and count the number of uppercase and lowercase letters using a for loop.
import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String myinput = sc.nextLine();
        System.out.println(myinput);
        sc.close();
        // String [] words = myinput.split("");
        int ucount = 0;
        int lcount = 0;
        int lenstr = myinput.length();
        // System.out.println(Arrays.toString(words));
        Character a= ' ';
        for(int i=0;i<lenstr;i++){
            // System.out.println(words[i]);
            a=myinput.charAt(i);
            if(a>='a'&& a<='z'){
                lcount++;
            } else if(a>='A'&& a<='Z'){
                ucount++;
            }
        }
        System.out.println("lcount"+"="+lcount);
        System.out.println("lcount"+"="+ucount);
        
    }
}
