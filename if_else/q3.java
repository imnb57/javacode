package if_else;
// 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
public class q3 {
    public static void main(String[] args){
        int a = 55;
        if (a%5==0 && a%11==0){
            System.out.println(" Yes,This number is divisible by 5 and 11");
        }
        else{
            System.out.println("No,the number is not divisible by 5 and 11");
        }

    }
}
