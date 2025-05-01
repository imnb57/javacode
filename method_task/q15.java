package method_task;
// Create a method to count uppercase and lowercase characters in a string



public class q15 {
    public void counter(String word){
        int upcounter=0;
        int lowcounter=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == Character.toLowerCase(word.charAt(i))){
                lowcounter++;

            }
            else if(word.charAt(i)==Character.toUpperCase(word.charAt(i))){
                upcounter++;
            }
        }
        System.out.println("Uppercase count: "+upcounter);
        System.err.println("Lowercase count: "+lowcounter);

    }
    public static void main(String[] args) {
        q15 obj = new q15();
        obj.counter("Hello my name is Nitesh");

    }
}
