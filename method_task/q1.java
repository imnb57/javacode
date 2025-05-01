package method_task;
// Write a method to print all odd numbers from 1 to a given number n



public class q1{
    public void oddchecker(int num){
        for(int i=0;i<=num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
       
    }
    public static void main(String [] args){
        q1 obj = new q1();
        obj.oddchecker(7);
    }
}