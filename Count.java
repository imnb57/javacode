public class Count {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int evenCount = 0;
        int oddCount=0;
        for (int i=0;i<array.length;i++){
            if(array[i]%2 == 0){
                System.out.println(array[i]+"-> even");
                evenCount++;
            }
            else{
                if(array[i]%2!=0){
                   System.out.println(array[i]+"-> odd");
                   oddCount++; 
                }
                
            }
        }
        System.out.println("total even count -> "+evenCount);
        System.out.println("total odd count -> "+oddCount);

    }
}