package method_task;
// Create a method to print the multiplication tables from 1 to 10



public class q13 {
    public void table(){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+j*i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        q13 obj = new q13();
        obj.table();
    }
}
