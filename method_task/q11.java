package method_task;
// Create a method to calculate the cube of a given number



public class q11 {
    public void cubemaker(int num){
        int cube = num*num*num;
        System.out.println("The cube is:"+cube);
    }
    public static void main(String[] args) {
        q11 obj = new q11();
        obj.cubemaker(3);
    }
}
