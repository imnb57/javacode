import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        String mystring = "apple is okay";
        System.out.println(mystring);
        // concat
        String newstring = mystring.concat(mystring);
        System.out.println(newstring);
        // length
        int lenofstr = mystring.length();
        System.out.println(lenofstr);
        // split
        String [] words = mystring.split("");
        // toString
        System.out.println(Arrays.toString(words));
        // substring
        String newsubstring = mystring.substring(1, 6);
        System.out.println(newsubstring);
        // toUpperCase, toLowerCase
        System.out.println(mystring.toLowerCase());
        System.out.println(mystring.toUpperCase());
        // endswith
        System.out.println(mystring.endsWith("okay"));
        // startswith
        System.out.println(mystring.startsWith("banana"));
        // contains
        System.out.println(mystring.contains("apple"));
        // equals
        System.out.println(mystring.equals("apple is okay"));
        // equalsIgnoreCase
        System.out.println(mystring.equalsIgnoreCase("Apple is OKAY"));
    }
    
}
