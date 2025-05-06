
// 2. Write a program to calculate Simple Interest. 
// Formula Simple Interest = (PrincipleAmount*Time*Rate/100);

public class q2 {
    static void simple(double PrincipleAmount, double Time, double Rate){
        double interest = (PrincipleAmount*Time*Rate)/100;
        System.out.println("the output is:"+interest);
    }
    public static void main(String[] args) {
        simple(10000,2,12.4);
        
    }
    
}
