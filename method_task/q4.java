package method_task;
// Write a method to count the number of words in a given string


public class q4 {
    public q4() {
    }
 
    public int checkword(String word) {
       int count = 1;
 
       for(int i = 0; i <= word.length() - 1; ++i) {
          if (word.charAt(i) == ' ') {
             ++count;
          }
       }
 
       return count;
    }
 
    public static void main(String[] var0) {
       q4 obj = new q4();
       int output = obj.checkword("word is okay or not");
       System.out.println("The number of word are:" + output);
    }
 }
 