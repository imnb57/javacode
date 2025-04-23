public class decision {
    public static void main(String[] args){
        int a = 1;
        if (a<4){
            System.out.println("Not true");
            if(a<2){
                System.out.println("still not true");
            }
        }
        else if (a>10){
            System.out.println("greater than 10");
        }
        // There can be only one 'else' but multiple 'else if' blocks
        else{
            System.out.println("True");
        }
    }
}
