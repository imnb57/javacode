import java.util.Scanner;
public class dowhileloop {
    public static void main(String[] args) {
        // Program to print numbers from 1 to 100 using while loop
        int i = 0;{
        }
        while(i<101){
            System.out.println(i);
            i++;
        }
        // Program to print the multiplication table of a given number using do-while loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();
        int j =1;
        do{
            System.out.println(num+"*"+j+"="+num*j);
            j++;
        }while(j<11);

    }
}
