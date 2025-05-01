package method_task;
// Write a method to determine if a number is a Duck number
public class q12 {
        public  boolean isDuckNumber(String number) {
            if (number == null || number.length() == 0 || number.charAt(0) == '0') {
                return false;
            }
    
            for (int i = 1; i < number.length(); i++) {
                if (number.charAt(i) == '0') {
                    return true;
                }
            }
    
            return false;
        }
    
        public static void main(String[] args) {
            q12 obj = new q12();
            boolean result =obj.isDuckNumber("1204");
            if(result){
                System.out.println("This is a ducknumber");
            }
            else{
                System.out.println("This is not a ducknumber");
            }
            
        }
    }
    

