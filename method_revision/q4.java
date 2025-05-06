public class q4 {
    static void ageCheck(int age){
        String result = age<18 ?"allowed to vote": 
        "not allowed to vote";
        System.out.println(result);
    }
    public static void main(String[] args){
       ageCheck(19);
        
    }
}