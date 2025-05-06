
// 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.
public class q1 {
    static boolean age(int age){
       if (age<18){
        return false;
       }
       else if(age>=18){
        return true;
       }
        return false;
    }
    public static void main(String[] args) {
        boolean result =age(18);
        if(result){
            System.out.println("your are eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
      
    }
}
